package factorization;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FactorizationServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new FactorizationServiceImpl())
                .build()
                .start();

        System.out.println("gRPC server started on port 50052...");
        server.awaitTermination();
    }
}
