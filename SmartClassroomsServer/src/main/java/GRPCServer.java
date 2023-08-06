import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;
import exam.ExamService;
import qanda.QandAService;

public class GrpcServer {
public static void main(String[] args) throws IOException, InterruptedException {
		
		Server server1 = ServerBuilder.forPort(9090).addService(new UserService()).intercept(new HeaderServerInterceptor()).build();
		Server server2 = ServerBuilder.forPort(9091).addService(new ExamService()).intercept(new HeaderServerInterceptor()).build();
		Server server3 = ServerBuilder.forPort(9092).addService(new QandAService()).intercept(new HeaderServerInterceptor()).build();
		
		server1.start();
		
		System.out.println("Server 1 started at " + server1.getPort());
		
		server1.awaitTermination();
		
		server2.start();
		
		System.out.println("Server 2 started at " + server2.getPort());
		
		server2.awaitTermination();
		
		server3.start();
		
		System.out.println("Server 3 started at " + server3.getPort());
		
		server3.awaitTermination();
	}
}