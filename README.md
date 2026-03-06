# Client-Server programming with grpc

Project on C/S programming. This work was conducted as part of the _Systèmes Repartis et Nouvelles Technologies_ class given by Mrs. Faïza NAJJAR, Dr. in Computer Science during my first year of master's studies (Computer Science Master @ENSI, March 2025).

## Description
**gRPC** is a high performance open-source framework developed by Google that allows clients to interact with servers via a **remote procedure call (RPC)** interface.

The main advantage of **gRPC** is that it allows communication between different languages (interoperability).

In this project, the server is coded in Java and the client is coded in Python, and we have standard request/response and bidirectionnal streaming. The goal is to factorize the numbers given by the client and to display the results.

## How to run
To test it, you must first launch the server and ensure that a PID is assigned to it using the following command : 
```bash
./gradlew run &
```
Then, you must launch the client using the following command : 
```bash
python3 client.py
```
Great ! You can now factorize your numbers !
