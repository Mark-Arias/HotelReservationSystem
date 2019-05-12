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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import GUI.MainFrame.MealItemListener;
import GUI.MainFrame.RoomItemListener;

public class NewReservationFrame extends JFrame{

	// COMPONENTS 
	// Guest Info 
	private JTextField guestName;
	private JTextField guestPhone;
	private JTextField guestEmail;
	private JTextField guestAddress;
	private JTextField guestDOB;
	
	//Guest Info - Contact Method 
	private JCheckBox contactedPhone;
	private JCheckBox contactedEmail;
	
	// Guest Info- CC 
	private JTextField ccName;
	private JTextField ccNum;
	private JTextField ccExp; 
	private JTextField ccCVV; // CC Security Code 
	
	private JCheckBox ccVisa;
	private JCheckBox ccMastercard;
	private JCheckBox ccAmericanExpress;
	
	// Save & Cancel 
	private JButton saveButton;
	private JButton cancelButton; 
	
	//Labels 
	private JLabel guestNameLabel;
	private JLabel guestPhoneLabel;
	private JLabel guestEmailLabel;
	private JLabel guestAddressLabel;
	private JLabel guestDOBLabel;
	
	private JLabel contactMethodLabel; 
	
	private JLabel ccNameLabel;
	private JLabel ccTypeLabel;
	private JLabel ccNumLabel;
	private JLabel ccExpLabel;
	private JLabel ccCVVLabel;
	


	JMenuBar menuBar;
	JScrollPane scrollPane;
	JPanel centerPanel;
	

	//border settings used in the method addARoomDescription()
 	Border raisedbevel = BorderFactory.createRaisedBevelBorder(); 
 	Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	
	NewReservationFrame()
	{
		this.setTitle("New Reservation");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.createMenuBar();
		//this.createMainPanel();
		this.createComponents();
		this.setVisible(true);
		
	}
	
	
	public void createComponents()
	{
		// GUEST INFORMATION 
		guestNameLabel = new JLabel("Guest name: ");
		guestName = new JTextField("", 15);
		
		guestPhoneLabel = new JLabel("Phone: ");
		guestPhone = new JTextField("", 10);
		
		guestEmailLabel = new JLabel("Email: ");
		guestEmail = new JTextField("", 15);
		
		guestAddressLabel = new JLabel("Address: ");
		guestAddress = new JTextField("", 20);
		
		// Temp 
		// Use J Spinner 
		guestDOBLabel = new JLabel("Date of Birth: ");
		guestDOB = new JTextField("", 5);
		
		
		// CREDIT CARD INFORMATION
		ccNameLabel = new JLabel("Name: ");
		ccName = new JTextField("", 15);
		
		ccTypeLabel = new JLabel("Type: ");
		ccVisa = new JCheckBox("Visa");
		ccMastercard = new JCheckBox("Mastercard");
		ccAmericanExpress = new JCheckBox("American Express");
		
		
		ccNumLabel = new JLabel("Number: ");
		ccNum = new JTextField("", 10);
		
		ccExpLabel = new JLabel("Exp Date: ");
		ccExp = new JTextField("", 5);
		
		ccCVVLabel = new JLabel("CVV: ");
		ccCVV = new JTextField("", 5); 
		
		saveButton = new JButton("Save");
		cancelButton = new JButton("Cancel");
		
		// Create the panel 
		JPanel mainPanel = new JPanel(); 
		JPanel guestPanel = new JPanel();
		JPanel ccPanel = new JPanel();
		JPanel footerPanel = new JPanel();
		
	
				
		// Add the components to the panel 
		guestPanel.add(guestNameLabel);
		guestPanel.add(guestName);
		guestPanel.add(guestPhoneLabel);
		guestPanel.add(guestPhone);
		guestPanel.add(guestEmailLabel);
		guestPanel.add(guestEmail);
		guestPanel.add(guestAddressLabel);
		guestPanel.add(guestAddress);
		guestPanel.add(guestDOBLabel);
		guestPanel.add(guestDOB);
		
		ccPanel.add(ccNameLabel);
		ccPanel.add(ccTypeLabel);
		ccPanel.add(ccTypeLabel);
		ccPanel.add(ccVisa);
		ccPanel.add(ccMastercard);
		ccPanel.add(ccAmericanExpress); 
		ccPanel.add(ccNumLabel);
		ccPanel.add(ccNum); 
		ccPanel.add(ccExpLabel);
		ccPanel.add(ccExp);
		ccPanel.add(ccCVVLabel);
		ccPanel.add(ccCVV);
		
		footerPanel.add(saveButton);
		footerPanel.add(cancelButton);
		
		// Add panels to the frame 
		mainPanel.add(guestPanel);
		mainPanel.add(ccPanel);
		mainPanel.add(footerPanel);
		
		this.add(mainPanel);		
		
		
		
		// Add the action listeners to the corresponding buttons 

	}
	
	
	
	//..................................................................................

	
	/*
	 * initializes the default center panel and adds it to this frame
	 * */
	private void createMainPanel() {
		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		//Title of default view
		JLabel panelTitle = new JLabel("Guest Reservation");
		panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		centerPanel.add(panelTitle);
	
		scrollPane = new JScrollPane(centerPanel);
		this.add(scrollPane, BorderLayout.CENTER);
	}
	
	
	/* initializes menu bar items and adds them to this window*/
	private void createMenuBar() {
		menuBar = new JMenuBar();
		//-------
				JMenu menu;
				JMenu submenu;
				JMenuItem menuItem;
				
				//-------  DESCRIPTIONS MENU------------------
				menu = new JMenu("Descriptions");

				//Party Room Sub Menu
				submenu = new JMenu("Party Rooms");

				
				menuItem = new JMenuItem("All");
				//menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);

				menuItem = new JMenuItem("Small Party Rooms");
				//menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Medium Party Rooms");
				//menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Aqua Room");
				submenu.add(menuItem);
				menu.add(submenu);
				
				//Lounges Sub Menu
				submenu = new JMenu("Lounges");
				
				menuItem = new JMenuItem("All");
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Karaoke Lounges");
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Billiards Lounges");
				submenu.add(menuItem);
				
				menu.add(submenu);
				menu.addSeparator();
				
				//Meal Plans Sub Menu
				submenu = new JMenu("Meal Plans");

				menuItem = new JMenuItem("All");
				submenu.add(menuItem);
				//menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Basic");
				submenu.add(menuItem);
				//menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Bronze");
				submenu.add(menuItem);
				//menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Silver");
				submenu.add(menuItem);
				//menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Gold");
				submenu.add(menuItem);
				//menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Platinum");
				submenu.add(menuItem);
				//menuItem.addActionListener(new MealItemListener());
				
				menu.add(submenu);
			
			
				
				menuBar.add(menu);
				
				
				//-------  RESERVATIONS MENU------------------
				menu = new JMenu("Reservations");
						
						//New reservation item
						menuItem = new JMenuItem("New Reservation...");
						menu.add(menuItem);
						menu.addSeparator();
						
						//Edit reservation item
						menuItem = new JMenuItem("Edit Existing Reservation...");
						menu.add(menuItem);
						menu.addSeparator();
						
						
						//Manage reservation sub menu 
						submenu = new JMenu("Manage Current Reservation");
						submenu.setMnemonic(KeyEvent.VK_S);

						menuItem = new JMenuItem("Check-in");
						submenu.add(menuItem);
						
						menuItem = new JMenuItem("Check-out");
						submenu.add(menuItem);
						

						menu.add(submenu);
				
				
				menuBar.add(menu);
				this.add(menuBar, BorderLayout.NORTH);
	}
	}
	
