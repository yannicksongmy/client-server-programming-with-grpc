package factorization;

import io.grpc.stub.StreamObserver;
import factorization.FactorizationServiceGrpc;
import factorization.Factorization;

public class FactorizationServiceImpl extends FactorizationServiceGrpc.FactorizationServiceImplBase {

    @Override
    public StreamObserver<Factorization.FactorRequest> factorizeStream(StreamObserver<Factorization.FactorResponse> responseObserver) {
        return new StreamObserver<Factorization.FactorRequest>() {
            @Override
            public void onNext(Factorization.FactorRequest request) {
                long number = request.getNumber();
                Factorization.FactorResponse.Builder response = Factorization.FactorResponse.newBuilder();

                for (long i = 2; i * i <= number; i++) {
                    while (number % i == 0) {
                        response.addFactors(i);
                        number /= i;
                    }
                }
                if (number > 1) {
                    response.addFactors(number);
                }

                responseObserver.onNext(response.build()); // Envoie la réponse immédiatement
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Erreur lors du traitement : " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted(); // Fermeture du stream
            }
        };
    }
}
