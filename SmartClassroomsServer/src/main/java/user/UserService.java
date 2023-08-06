package user;

import com.smartclassrooms.grpc.user.APIResponse;
import com.smartclassrooms.grpc.user.RegisterRequest;
import com.smartclassrooms.grpc.user.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase{

	@Override
	public void register(RegisterRequest request, StreamObserver<APIResponse> responseObserver) {
		
		System.out.println("Registering...");
		
		String username = request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if(password.length() > 3 && username.length() > 0) {
			//return success message
			response.setResponseCode(0).setResponsemessage("Student registered!");
		}
		else if(password.length() > 3) {
			// return failure message
						response.setResponseCode(100).setResponsemessage("No username entered. Try Again!");
		}
		
		else {
			// return failure message
			response.setResponseCode(100).setResponsemessage("Password too short. Try Again!");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
}