import com.smartclassrooms.grpc.User.APIResponse;
import com.smartclassrooms.grpc.User.LoginRequest;
import com.smartclassrooms.grpc.userGrpc;
import com.smartclassrooms.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcSmartClassroomsClient {
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		// stubs - generate from proto
		
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		
		LoginRequest loginrequest = LoginRequest.newBuilder().setUsername("RAMqwe").setPassword("RAM").build();
		
		userStub.login(loginrequest);
		
		APIResponse response = userStub.login(loginrequest);
		
		System.out.println(response.getResponsemessage());
		
	}
}