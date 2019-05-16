package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class EditReservationFrame extends JFrame{
	JLabel guestSearchNameLabel;
	JTextField guestSearch;
	JButton guestButton;
	JLabel waitlistSearchLabel;
	JTextField waitlistSearch;
	JButton waitlistButton;
	
	EditReservationFrame(){
		this.setTitle("Edit Reservation Frame");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		this.createComponents();
		this.setVisible(true);
	}
	
	public void createComponents()
	{
		guestSearchNameLabel = new JLabel("Search Confirmation #: ");
		guestSearch = new JTextField("", 15);
		ActionListener guestSearchListener = new guestButton();
		guestButton = new JButton("Search");
		guestButton.addActionListener(guestSearchListener);
		waitlistSearchLabel = new JLabel("Search Wait List: ");
		waitlistSearch = new JTextField("", 15);		
		ActionListener waitlistSearchListener = new waitlistButton();
		waitlistButton = new JButton("Search");
		waitlistButton.addActionListener(waitlistSearchListener);

	}
	
	class guestButton implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent event) {
			//int confirmationNumber = int.parseInt(guestSearch.getText());
			//check if confirmation # is valid ~ bring up guest info to edit
		}
	}
	
	class waitlistButton implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent event) {
			String waitlistGuest = waitlistSearch.getText();
			//check if guest in waitlist ~ bring up guest info to edit
		}
	}
}