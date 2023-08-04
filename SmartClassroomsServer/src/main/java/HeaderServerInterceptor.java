
import io.grpc.ForwardingServerCall.SimpleForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;

public class HeaderServerInterceptor implements ServerInterceptor {

	@Override
     public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
        ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
		 System.out.println(headers.get(Metadata.Key.of("HOSTNAME", ASCII_STRING_MARSHALLER)));
		 
		 return next.startCall(new SimpleForwardingServerCall<ReqT, RespT>(call) {}, headers);
     }
}