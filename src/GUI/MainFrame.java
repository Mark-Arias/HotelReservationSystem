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

// Note modified from her given code 
import Room.AquaRoom;
import Room.MediumPartyRoom;
import Room.SmallPartyRoom;
//import MainFrame.ClickListener;

public class MainFrame extends JFrame {
	
	JMenuBar menuBar;
	JScrollPane scrollPane;
	JPanel centerPanel;
	
	
	// test label 
	JLabel test; 
	
	JPanel mealPanel; 
	// Meal Plan Labels 
	private JLabel basicMealPlan;
	private JLabel bronzeMealPlan;
	private JLabel silverMealPlan;
	private JLabel goldMealPlan;
	private JLabel platinumMealPlan;
	
	
	//border settings used in the method addARoomDescription()
 	Border raisedbevel = BorderFactory.createRaisedBevelBorder(); 
 	Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	
	MainFrame(){
		this.setTitle("Reservation System");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		this.createMenuBar();
		this.createDefaultPanel();
		this.setVisible(true);	
	}
	


	/*
	 * initializes the default center panel and adds it to this frame
	 * */
	private void createDefaultPanel() {
		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		//Title of default view
		JLabel panelTitle = new JLabel("Small Party Rooms");
		panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		
		centerPanel.add(panelTitle);
		
		//Temporarily hard coded the descriptions
		addARoomDescription(centerPanel, "/Users/ashley/Desktop/temp02.PNG", "Small Party Room" , "Small Party Room"
	  			+ "\nDescription: Room with party tables and chairs, adjacent to arcade.");
		addARoomDescription(centerPanel, "/Users/ashley/Desktop/temp02.PNG", "Medium Party Room" , "Medium Party Room"
	  			+ "\nDescription: Room with party tables and chairs, adjacent to arcade.");
		addARoomDescription(centerPanel, "/Users/ashley/Desktop/temp02.PNG", "Aqua Party Room" , "Aqua Party Room"
	  			+ "\nDescription: Room with party tables and chairs, adjacent to arcade.");
		
		scrollPane = new JScrollPane(centerPanel);
		this.add(scrollPane, BorderLayout.CENTER);
	}
	
	private void createMealPanel()
	{
		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		
		JLabel panelTitle = new JLabel("Small Party Rooms");
		panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		
		centerPanel.add(panelTitle);
		
		basicMealPlan = new JLabel("Basic Meal Plan");
		bronzeMealPlan = new JLabel("Bronze Meal Plan");
		silverMealPlan = new JLabel("Silver Meal Plan");
		goldMealPlan = new JLabel("Gold Meal Plan");
		platinumMealPlan = new JLabel("Platinum Meal Plan");
		
		centerPanel.add(basicMealPlan);
		centerPanel.add(bronzeMealPlan);
		
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
				JMenuItem newReservationMenuItem;
				JMenuItem editReservationMenuItem;
				
				//-------  DESCRIPTIONS MENU------------------
				menu = new JMenu("Descriptions");

				//Party Room Sub Menu
				submenu = new JMenu("Party Rooms");

				
				menuItem = new JMenuItem("All");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);

				menuItem = new JMenuItem("Small Party Rooms");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Medium Party Rooms");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Aqua Room");
				menuItem.addActionListener(new RoomItemListener());
				submenu.add(menuItem);
				menu.add(submenu);
				
				//Lounges Sub Menu
				submenu = new JMenu("Lounges");
				
				menuItem = new JMenuItem("All Lounges");
				menuItem.addActionListener(new MealItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Karaoke Lounges");
				menuItem.addActionListener(new MealItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Billiards Lounges");
				menuItem.addActionListener(new MealItemListener());
				submenu.add(menuItem);
				
				menu.add(submenu);
				menu.addSeparator();
				
				//Meal Plans Sub Menu
				submenu = new JMenu("Meal Plans");

				menuItem = new JMenuItem("All");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Basic");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Bronze");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Silver");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Gold");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menuItem = new JMenuItem("Platinum");
				submenu.add(menuItem);
				menuItem.addActionListener(new MealItemListener());
				
				menu.add(submenu);
			
			
				
				menuBar.add(menu);
				
				
				//-------  RESERVATIONS MENU------------------
				menu = new JMenu("Reservations");
						
						ActionListener MenuItemListener = new MenuItemListener();
						//New reservation item
						menuItem = new JMenuItem("New Reservation...");
						menuItem.addActionListener(MenuItemListener);
						menu.add(menuItem);
						menu.addSeparator();
						
						//Edit reservation item
						menuItem = new JMenuItem("Edit Existing Reservation...");
						menuItem.addActionListener(MenuItemListener);
						menu.add(menuItem);
						menu.addSeparator();
						
						
						//Manage reservation sub menu 
						submenu = new JMenu("Manage Current Reservation");
						submenu.setMnemonic(KeyEvent.VK_S);

						menuItem = new JMenuItem("Check-in");
						menuItem.addActionListener(MenuItemListener);
						submenu.add(menuItem);
						
						menuItem = new JMenuItem("Check-out");
						menuItem.addActionListener(MenuItemListener);
						submenu.add(menuItem);
						

						menu.add(submenu);
				
				
				menuBar.add(menu);
				this.add(menuBar, BorderLayout.NORTH);
	}
	
	
	
	/* 
	 * adds room image and description to a given container
	 * @param container - the container onto which to add the new description
	 * @param imgDir - the directory of the image
	 * @param roomName - the name of the room
	 * @param roomDesc - the description of the room
	 * 
	 * */
	 private void addARoomDescription(Container container, String imgDir, String roomName, String roomDesc) {
		 	JPanel p = new JPanel();
		 	
		 	ImageIcon icon = new ImageIcon(imgDir);
		 	JLabel picture = new JLabel(roomName, icon, JLabel.CENTER);
		 	picture.setFont(new Font(Font.SERIF, Font.BOLD, 20));
		 	
		 	//Set the position of the text, relative to the icon:
		 	picture.setVerticalTextPosition(JLabel.TOP);
		 	picture.setHorizontalTextPosition(JLabel.CENTER);
		 	//Set border around 
		 	picture.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
		 	
		 	p.add(picture);
		 	
	
		 	JTextArea description = new JTextArea(5,10);
		 	description.append(roomDesc);
		 	description.setEditable(false);
		 	description.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		 	description.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
			p.add(description);
			
			
			ActionListener buttonListener = new BookNowButtonListener();
	        JButton bookButton = new JButton("Book Now");
	        bookButton.addActionListener(buttonListener);
	        p.add(bookButton);
	        container.add(p);
	    }

	class MenuItemListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object source = e.getActionCommand();
			switch(source.toString()) {
				case "All Rooms":
					System.out.println("all rooms");
					break;
				case "Small Party Rooms":
					System.out.println("small party rooms");
					break;
				case "Medium Party Rooms":
					System.out.println("medium party rooms");
					break;
				case "Aqua Room":
					System.out.println("aqua room");
					break;
				
			
				//Lounges
				case "All Lounges":
					System.out.println("all lounges");
					break;
					
				case "Karaoke Lounges":
					System.out.println("karaoke lounges");
					break;
					
				case "Billiards Lounges":
					System.out.println("billiards lounges");
					break;
				
				
					
				case "New Reservation...":
					System.out.println("NR");
					break;
					
				case "Edit Existing Reservation...":
					System.out.println("ER");
					break;
					
				case "Check-in":
					System.out.println("CI");
					break;
					
				case "Check-out":
					System.out.println("CO");
					break;
			}
			
			
				
		
		}
		
		
		
	}
	
	class MealItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
//			JMenuItem menuItem = (JMenuItem) click.getSource();
//			String item = menuItem.getText();
//			System.out.println(item);
//			if(item.equals("All")) 
//			{
//				
//				System.out.println("VIEW ALL"); //replace 
//				createMealPanel(); 
//				
//				
//			}
//			else if(item.equals("Basic")) System.out.println("VIEW BASIC"); //replace 
//			else if(item.equals("Bronze")) System.out.println("VIEW BRONZE");
			//Meal Plan
			Object source = e.getActionCommand();
			switch(source.toString()) {
			case "All":
				System.out.println("all");
				break;
			case "Basic":
				System.out.println("bc");
				break;
			case "Bronze":
				System.out.println("be");
				break;
				
			case "Silver":
				System.out.println("sr");
				break;
				
			case "Gold":
				System.out.println("gd");
				break;
				
			case "Platinum":
				System.out.println("pl");
				break;
			
		}
		}
		
	}
	class BookNowButtonListener implements ActionListener {
		@Override
		public void actionPerformed (ActionEvent event) {
			Object source = event.getSource();
			JFrame newReservation = new NewReservationFrame();
			
			//System.out.println(source.toString() );
		}
	}

	

	class RoomItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent select) {
			JMenuItem item = (JMenuItem) select.getSource();
			switch(item.getText()) {
			case "All":
				System.out.println("All");
				break;
			case  "Small Party Rooms":
				System.out.println("small party rooms");
				break;
			case "Medium Party Rooms":
				System.out.println("medium party rooms");
				break;
			case "Aqua Room":
				System.out.println("Aqua room");
				break;
			}
			
			
//			if(item.getText().equals("Medium Party Rooms")) {
//				System.out.println("Display only Medium Party Room");
//			}
			
		}}
	
	public static void main(String[] args
			) {
		MainFrame f = new MainFrame();
	}
}