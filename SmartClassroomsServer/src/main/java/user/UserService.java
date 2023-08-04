package user;

import com.smartclassrooms.grpc.User.APIResponse;
import com.smartclassrooms.grpc.User.Empty;
import com.smartclassrooms.grpc.User.RegisterRequest;
import com.smartclassrooms.grpc.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase{

	@Override
	public void register(RegisterRequest request, StreamObserver<APIResponse> responseObserver) {
		
		System.out.println("Inside login!");
		
		String username = request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if(username.equals(password)) {
			//return success message
			response.setResponseCode(0).setResponsemessage("SUCCESS");
		}
		else {
			// return failure message
			response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
}