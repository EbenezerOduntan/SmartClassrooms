package qanda;

import io.grpc.stub.StreamObserver;

import com.smartclassrooms.grpc.qanda.Answer;
import com.smartclassrooms.grpc.qanda.Question;
import com.smartclassrooms.grpc.qanda.qandaGrpc.qandaImplBase;

public class QandAService extends qandaImplBase {
        @Override
        public StreamObserver<Question> liveQandA(StreamObserver<Answer> responseObserver) {
            return new StreamObserver<Question>() {
                @Override
                public void onNext(Question question) {
                    // Your server-side logic to handle the incoming question
                    String username = question.getUsername();
                    String questionText = question.getQuestionText();

                    // Here you can process the question and prepare an answer
                    String teacher_username = "T001";
                    String answerText = "Answering your question: " + questionText;

                    Answer answer = Answer.newBuilder()
                            .setUsername(teacher_username)
                            .setAnswerText(answerText)
                            .build();

                    // Send the answer back to the client
                    responseObserver.onNext(answer);
                }

                @Override
                public void onError(Throwable throwable) {
                    // Handle any errors that occur during the streaming
                }

                @Override
                public void onCompleted() {
                    // The client has completed sending questions
                    responseObserver.onCompleted();
                }
            };
        }
    }