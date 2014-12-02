package GUI;


	//import af komponenter til at bygge vinduer
	
	import java.awt.*;
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
			
			btnLogIn = new JButton("Login");
			btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnLogIn.setBackground(Color.WHITE);
			btnLogIn.setBounds(118, 445, 90, 23);
			add(btnLogIn);
		
	}
		
		//der skal tilføjes actionlisteners for at der sker noget ved tryk paa knapper
		public void addActionListener (ActionListener x){
			btnLogIn.addActionListener(x);
			btnLogIn.setActionCommand("btnLogIn");
		}
		
		//textfield skal nulstilles efter brug
		public void emptyTextfield(){
			enterPassword.setText("");
			
		}
		
		//viser, hvis password er forkert
		public void WrongPass(){
			lblWrongPass.setVisible(true);
		}
		
		//faar fat paa username naar brugeren har indtastet username
		public String getenterUsername(){
			return enterUsername.getText();
		}
		
		//get password
		public char[]  getenterPassword(){
			return enterPassword.getPassword();
		}
		
		
		//getters and setters 
		public JLabel getLblWelcome() {
			return lblWelcome;
		}

		public void setLblWelcome(JLabel lblWelcome) {
			this.lblWelcome = lblWelcome;
		}

		public JLabel getLblLogInHere() {
			return lblLogInHere;
		}

		public void setLblLogInHere(JLabel lblLogInHere) {
			this.lblLogInHere = lblLogInHere;
		}

		public JLabel getLblUsername() {
			return lblUsername;
		}

		public void setLblUsername(JLabel lblUsername) {
			this.lblUsername = lblUsername;
		}

		public JLabel getLblPassword() {
			return lblPassword;
		}

		public void setLblPassword(JLabel lblPassword) {
			this.lblPassword = lblPassword;
		}

		public JLabel getLblWrongPass() {
			return lblWrongPass;
		}

		public void setLblWrongPass(JLabel lblWrongPass) {
			this.lblWrongPass = lblWrongPass;
		}

		public JButton getBtnLogIn() {
			return btnLogIn;
		}

		public void setBtnLogIn(JButton btnLogIn) {
			this.btnLogIn = btnLogIn;
		}

		public JPasswordField getEnterPassword() {
			return enterPassword;
		}

		public void setEnterPassword(JPasswordField enterPassword) {
			this.enterPassword = enterPassword;
		}

		public JTextField getEnterUsername() {
			return enterUsername;
		}

		public void setEnterUsername(JTextField enterUsername) {
			this.enterUsername = enterUsername;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		

		
	
	
}
