package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class EditReservationFrame extends JFrame{

	EditReservationFrame(){
		this.setTitle("Edit Reservation Frame");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		this.createComponents();
		this.setVisible(true);
}
	//
	public void createComponents()
	{
		guestSearchNameLabel = new JLabel("Search Confirmation #: ");
		guestSearch = new JTextField("", 15);
		ActionListener guestSearchListener = new GuestSearch();
		guestButton = new JButton("Search");
		guestButton.addActionListener(guestSearchListener);
		waitlistSearchLabel = new JLabel("Search Wait List: ")
		waitlistSearch = new JTextField("", 15);		
		ActionListener waitlistSearchListener = new WaitlistSearch();
		waitlistButton = new JButton("Search");
		waitlistButton.addActionListener(waitlistSearchListener);

	}
	
	class guestButton implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent event) {
			int confirmationNumber = int.parseInt(guestSearch.getText());
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
