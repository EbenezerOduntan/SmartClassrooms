import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;
import exam.ExamService;

public class GrpcServer {
public static void main(String[] args) throws IOException, InterruptedException {
		
		Server server1 = ServerBuilder.forPort(9090).addService(new UserService()).intercept(new HeaderServerInterceptor()).build();
		Server server2 = ServerBuilder.forPort(9090).addService(new ExamService()).intercept(new HeaderServerInterceptor()).build();
		
		server1.start();
		
		System.out.println("Server started at " + server1.getPort());
		
		server1.awaitTermination();
		
		server2.start();
		
		System.out.println("Server started at " + server1.getPort());
		
		server2.awaitTermination();
	}
}