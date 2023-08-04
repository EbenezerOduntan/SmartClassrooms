

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

import com.smartclassrooms.grpc.User.APIResponse;
import com.smartclassrooms.grpc.User.RegisterRequest;
import com.smartclassrooms.grpc.userGrpc;
import com.smartclassrooms.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;


public class ControllerGUI implements ActionListener{


	private JTextField entry1, entry2, reply1;


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

		JButton button = new JButton("Register");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1.setEditable(false);
		panel.add(reply1);

		panel.setLayout(boxlayout);

		return panel;

	}

	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	public void build() { 

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getService1JPanel() );

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
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

			reply1.setText( String.valueOf( response.getResponsemessage()));
			
			System.out.println(response.getResponsemessage());
			
			channel.shutdown();
		
		}

	}

}
