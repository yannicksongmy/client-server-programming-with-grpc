import grpc
import factorization_pb2
import factorization_pb2_grpc

def generate_requests():
    while True:
        number = int(input("Entrez un nombre à factoriser (ou 0 pour quitter) : "))
        if number == 0:
            break
        yield factorization_pb2.FactorRequest(number=number)

def run():
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = factorization_pb2_grpc.FactorizationServiceStub(channel)

        responses = stub.FactorizeStream(generate_requests())

        for response in responses:
            print(f"Facteurs premiers : {list(response.factors)}")

if __name__ == "__main__":
    run()
