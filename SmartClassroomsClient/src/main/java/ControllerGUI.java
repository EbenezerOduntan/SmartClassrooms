

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.smartclassrooms.grpc.exam.Assignment;
import com.smartclassrooms.grpc.exam.SubmissionConfirmation;
import com.smartclassrooms.grpc.exam.examGrpc;
import com.smartclassrooms.grpc.exam.examGrpc.examBlockingStub;
import com.smartclassrooms.grpc.exam.examGrpc.examStub;
import com.smartclassrooms.grpc.qanda.Answer;
import com.smartclassrooms.grpc.qanda.Question;
import com.smartclassrooms.grpc.qanda.qandaGrpc;
import com.smartclassrooms.grpc.qanda.qandaGrpc.qandaStub;
import com.smartclassrooms.grpc.user.APIResponse;
import com.smartclassrooms.grpc.user.RegisterRequest;
import com.smartclassrooms.grpc.user.userGrpc;
import com.smartclassrooms.grpc.user.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;


public class ControllerGUI implements ActionListener{


	private JTextField entry1, entry2, entry3, entry4, reply1, reply2, reply3;


	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label1 = new JLabel("Enter Username")	;
		panel.add(label1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JLabel label2 = new JLabel("Enter Password")	;
		panel.add(label2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1 = new JButton("Register");
		button1.addActionListener(this);
		panel.add(button1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1.setEditable(false);
		panel.add(reply1);

		JPanel nextButtonRow = new JPanel();
		nextButtonRow.setLayout(new BoxLayout(nextButtonRow, BoxLayout.Y_AXIS));
		
		JButton button2 = new JButton("Assignment Submission");
		button2.addActionListener(this);
		nextButtonRow.add(button2);
		
		panel.add(nextButtonRow);
		
		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label1 = new JLabel("Enter Username");
		panel.add(label1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("",10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JLabel label2 = new JLabel("Enter Course Name");
		panel.add(label2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry4 = new JTextField("",10);
		panel.add(entry4);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1 = new JButton("Submit Assignment");
		button1.addActionListener(this);
		panel.add(button1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2.setEditable(false);
		panel.add(reply2);

		JPanel nextButtonRow = new JPanel();
		nextButtonRow.setLayout(new BoxLayout(nextButtonRow, BoxLayout.Y_AXIS));
		
		JButton button2 = new JButton("Assignment Submission");
		button2.addActionListener(this);
		nextButtonRow.add(button2);
		
		panel.add(nextButtonRow);
		
		panel.setLayout(boxlayout);

		return panel;

	}
	
	public void build(int service) { 

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		if(service == 1) {			
			panel.add( getService1JPanel() );
		} else if( service == 2) {
			panel.add( getService2JPanel() );			
		}

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) throws NullPointerException {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Register")) {
			System.out.println("service 1 to be invoked ...");

			/*
			 * 
			 */
			Metadata metadata =  new Metadata();
			metadata.put(Metadata.Key.of("HOSTNAME", Metadata.ASCII_STRING_MARSHALLER), "localhost:9090");
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
			userBlockingStub userStub = userGrpc.newBlockingStub(channel);
			

			//preparing message to send
			RegisterRequest registerrequest = RegisterRequest.newBuilder().setUsername(entry1.getText()).setPassword(entry2.getText()).build();

			//retrieving reply from service
			APIResponse response = userStub.register(registerrequest);
			userStub = MetadataUtils.attachHeaders(userStub, metadata);

			System.out.println(response.getResponsemessage());
			reply1.setText( String.valueOf( response.getResponsemessage()));
			
			
			channel.shutdown();
		
		} else if(label.equals("Assignment Submission")) {
			build(2);
		} else if(label.equals("Submit Assignment")){
			// Assignment Submission Client Streaming 
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091) // Replace with server details
	                .usePlaintext() // For simplicity, we use plaintext (non-encrypted) connection
	                .build();
	
	        examStub stub = examGrpc.newStub(channel);
	
	        StreamObserver<SubmissionConfirmation> responseObserver = new StreamObserver<SubmissionConfirmation>() {
	            @Override
	            public void onNext(SubmissionConfirmation confirmation) {
	                // Process the confirmation from the server
	                String message = confirmation.getSubmissionresponse();
	                System.out.println("Server response: " + message);
	            }
	
	            @Override
	            public void onError(Throwable throwable) {
	                // Handle any errors that occur during the streaming
	            }
	
	            @Override
	            public void onCompleted() {
	                // The server has completed processing the assignment submission
	                System.out.println("Assignment submission completed.");
	            }
	        };
	
	        StreamObserver<Assignment> requestObserver = stub.assignmentSubmission(responseObserver);
	        			System.out.println("I corrected the " + entry4.getText());

	        try {
	        	// Simulate sending three assignment
		            Assignment submission = Assignment.newBuilder()
		                    .setUsername(entry3.getText())
		                    .setCoursename(entry4.getText())
		                    .build();
	
		            requestObserver.onNext(submission);
		        
		    } catch(NullPointerException error) {
	        	System.out.println("Having trouble going to the next service");
	        }
	
	        // Mark the end of the assignment submission stream
	        requestObserver.onCompleted();
	
	        // Gracefully shutdown the channel when done
	        channel.shutdown();
		} else if(label.equals("Live Q and A")) {
			// Bidirectional Live Q and A
			 ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092) // Replace with server details
		                .usePlaintext() // For simplicity, we use plaintext (non-encrypted) connection
		                .build();

		        qandaStub stub = qandaGrpc.newStub(channel);

		        StreamObserver<Question> requestObserver = stub.liveQandA(new StreamObserver<Answer>() {
		            public void onNext(Answer answer) {
		                // Process the incoming answer from the server
		                String teacherId = answer.getUsername();
		                String answerText = answer.getAnswerText();

		                System.out.println("Received answer from " + teacherId + ": " + answerText);
		            }

		            public void onError(Throwable throwable) {
		                // Handle any errors that occur during the streaming
		            }

		            public void onCompleted() {
		                // The server has completed sending answers
		                System.out.println("Q&A session completed.");
		            }
		        });

		        // Simulate sending multiple questions
		        for (int i = 1; i <= 5; i++) {
		            Question question = Question.newBuilder()
		                    .setUsername("S001")
		                    .setQuestionText("Question " + i)
		                    .build();

		            requestObserver.onNext(question);
		        }

		        // Mark the end of the question stream
		        requestObserver.onCompleted();

		        // Gracefully shutdown the channel when done
		        channel.shutdown();
			
		}

	}

}
