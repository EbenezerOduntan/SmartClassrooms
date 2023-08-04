package exam;

import com.smartclassrooms.grpc.Exam.Assignment;
import com.smartclassrooms.grpc.Exam.SubmissionConfirmation;
import com.smartclassrooms.grpc.Exam.StudentRequest;
import com.smartclassrooms.grpc.Exam.Grade;
import com.smartclassrooms.grpc.examGrpc.examImplBase;

import io.grpc.stub.StreamObserver;

public class ExamService extends examImplBase{
    public StreamObserver<Assignment> submit(
    	final StreamObserver<SubmissionConfirmation> responseObserver) {
        	return new StreamObserver<Assignment>() {

            StringBuilder assignment = new StringBuilder();

            @Override
            public void onNext(Assignment value) {
                assignment.append(value.getCoursename());
                
                System.out.println("Received assignment from student " + value.getUsername());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error received from client: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("All parts of the assignment received. Compiling...");
                // You would compile the assignment here

                SubmissionConfirmation confirmation =
                        SubmissionConfirmation
                                .newBuilder()
                                .setSubmissionresponse("Assignment received and compiled successfully!").setResponseCode(0)
                                .build();

                responseObserver.onNext(confirmation);
                responseObserver.onCompleted();
            }
        };
    }
    
    public void getGrade(StudentRequest request,
                          StreamObserver<Grade> responseObserver) {

        // Here, we're just sending dummy grade for illustration
        String[] assignmentNames = {"Assignment 1", "Quiz 1", "Midterm Exam", "Final Exam"};
        int[] grades = {95, 87, 78, 88};

        for (int i = 0; i < assignmentNames.length; i++) {
            Grade grade = Grade.newBuilder().setAssignmentname(assignmentNames[i])
                    .setGrade(grades[i])
                    .build();

            responseObserver.onNext(grade);
        }

        responseObserver.onCompleted();
    }
}          