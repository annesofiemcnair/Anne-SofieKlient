package GUI;


	//import af komponenter til at bygge vinduer
	
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.JPasswordField;
	
	public class Login extends JPanel{
		
		private static final long serialVersionUID = 1L;
		
		//der oprettes instansvariable til de forskellige elementer, fx knapper, tekstfelter og overskrifter
		
		private JLabel lblWelcome;
		private JLabel lblLogInHere;
		private JLabel lblUsername;
		private JLabel lblPassword;
		private JLabel lblWrongPass;
		private JButton btnLogIn;
		private JPasswordField enterPassword;
		private JTextField enterUsername;
		
		//her bliver udseende tilfoejet til de forskellige variable, bliver gjort via konstruktorer
		
		public Login (){
			setLayout(null);
			
			lblWelcome = new JLabel("Welcome to CBS calendar");
			lblWelcome.setBounds(69, 100, 190, 24);
			lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
			add(lblWelcome);
			
			lblLogInHere = new JLabel ("Please log in here:");
			lblLogInHere.setBounds(100, 145, 110, 16);
			lblLogInHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
			add(lblLogInHere);
			
			lblUsername = new JLabel("Enter username here:");
			lblUsername.setBounds(85, 195, 52, 14);
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
			add(lblUsername);
			
			lblPassword = new JLabel("Enter your password here:");
			lblPassword.setBounds(88, 252, 49, 14);
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
			add(lblPassword);
			
			lblWrongPass = new JLabel("You have entered a wrong password or username. Please try again");
			lblWrongPass.setBounds(75, 315, 165, 14);
			lblWrongPass.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblWrongPass.setForeground(Color.PINK);
			lblWrongPass.setVisible(false);
			add(lblWrongPass);
		
			
			enterPassword = new JPasswordField("");
			enterPassword.setBounds(75, 240, 148, 29);
			add(enterPassword);
			
			enterUsername = new JTextField();
			enterUsername.setBounds(75, 173, 148, 29);
			add(enterUsername);
			
		
	}
	
	
}
