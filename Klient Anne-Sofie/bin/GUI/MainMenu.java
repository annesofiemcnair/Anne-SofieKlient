package GUI;

import java.awt.Font;

import javax.swing.*;


public class MainMenu extends JPanel{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblWelcome;
	private JButton viewCalendar;
	private JButton logOut;
	private JButton QOTD;
	private JButton weather;
	private JTextArea textQuote;
	
	

	public MainMenu(){
	lblWelcome = new JLabel("Welcome to CBS calendar!");
	lblWelcome.setBounds(160, 10, 125, 30);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	viewCalendar = new JButton("View Calendar");
	viewCalendar.setBounds(160, 325, 125, 55);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);
	
	logOut = new JButton("Log out");
	logOut.setBounds(300, 325, 125, 55);
	logOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(logOut);

	QOTD = new JButton ("Get your qoute of the day!");
	QOTD.setBounds(160, 325, 125, 55);
	QOTD.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(QOTD);
	
	weather = new JButton("Weatherforecast");
	weather.setBounds(160, 325, 125, 55);
	weather.setFont(new Font("Tahoma", Font.PLAIN, 14));
	
	
	textQuote = new JTextArea();
	textQuote.setBounds(100, 115, 250, 170);
	textQuote.setLineWrap(true);
	textQuote.setWrapStyleWord(true);
	add(textQuote);
	
	}
	
	
	
	
/*	
	private JButton btnDeposit;
	private JButton btnTransfer;
	private JButton btnBalance;
	private JButton btnLogOut;
	private JButton btnSearchUser;
	private JLabel lblNewLabel_1;
	private JLabel lblMenu;
	private JLabel label_1;
	private JButton btnLogOff;


	private JButton btnLogOut;
	private JButton btnViewBalance;
	private JButton btnDeposit;
	private JLabel lblWelcome;
	private JLabel lblBitCoin;
	private JLabel lblPleaseChoose;

}*/
}
