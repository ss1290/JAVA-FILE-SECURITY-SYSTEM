import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField username;
	
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public login() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel.setBounds(69, 64, 105, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_1.setBounds(69, 107, 105, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		username = new JTextField();
		username.setBounds(167, 68, 177, 19);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 111, 177, 19);
		frame.getContentPane().add(passwordField);
		
		JButton login = new JButton("login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname=username.getText();
				String psd=passwordField.getText();
				
				if(uname.equals("admin") && psd.equals("admin123"))
				{
					JOptionPane.showMessageDialog(frame, "You are successfully logged in");
				
				 EncryptTXT crypt= new EncryptTXT();
					crypt.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Invalid username or password");
				}
			}
		});
		login.setBounds(167, 202, 105, 29);
		frame.getContentPane().add(login);
	}
}
