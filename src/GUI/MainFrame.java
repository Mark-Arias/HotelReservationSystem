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
import javax.swing.JTextField;
import javax.swing.border.Border;

import MealPlanDecorator.BasicMealPlan;
// Note modified from her given code 
import Room.AquaRoom;
import Room.MediumPartyRoom;
import Room.SmallPartyRoom;
//import MainFrame.ClickListener;

public class MainFrame extends JFrame {
	
	JMenuBar menuBar;
	JScrollPane scrollPane;
	JPanel centerPanel;
	
	
	// MEAL PLANS 
	// Meal Plan Panels 

	JPanel mealPanel; 
	JPanel allMealPanel; 
	JPanel basicMealPlanPanel; 
	JPanel bronzeMealPlanPanel; 
	JPanel silverMealPlanPanel;
	JPanel goldMealPlanPanel;
	JPanel platinumMealPlanPanel; 
		
	
	// Meal Plan Labels 
	private JTextArea basicMealPlan;
	private JLabel bronzeMealPlan;
	private JLabel silverMealPlan;
	private JLabel goldMealPlan;
	private JLabel platinumMealPlan;
	// test label 
	JPanel mainPanel; 
	

	//border settings used in the method addARoomDescription()
 	Border raisedbevel = BorderFactory.createRaisedBevelBorder(); 
 	Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	
	MainFrame(){
		this.setTitle("Reservation System");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		this.createMenuBar();
		
		// Given 
		this.createDefaultPanel();
		
		//this.testPanel(); 
		//this.testPanelII();
		//this.createMealPanel(); 
		
		//mainPanel.setVisible(false);
		this.setVisible(true);
		//centerPanel.setVisible(true);
	}
	
// 

	private void testPanel()
	{
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		//Title of default view
		JLabel panelTitle = new JLabel("test");
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
	
	private void testPanelII()
	{
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		//Title of default view
		JLabel panelTitle = new JLabel("test II");
		panelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		
		centerPanel.add(panelTitle);
		
		//Temporarily hard coded the descriptions
		addARoomDescription(mainPanel, "/Users/ashley/Desktop/temp02.PNG", "Small Party Room" , "Small Party Room"
	  			+ "\nDescription: Room with party tables and chairs, adjacent to arcade.");
		addARoomDescription(mainPanel, "/Users/ashley/Desktop/temp02.PNG", "Medium Party Room" , "Medium Party Room"
	  			+ "\nDescription: Room with party tables and chairs, adjacent to arcade.");
		addARoomDescription(mainPanel, "/Users/ashley/Desktop/temp02.PNG", "Aqua Party Room" , "Aqua Party Room"
	  			+ "\nDescription: Room with party tables and chairs, adjacent to arcade.");
		
		scrollPane = new JScrollPane(centerPanel);
		this.add(scrollPane, BorderLayout.CENTER);
	
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
		//chn
		
	}
	
	private void createMealPanel()
	{
		// Clear existing components and add new components to frame 
		centerPanel.removeAll(); 
		centerPanel.revalidate();
		centerPanel.repaint();
		
		JLabel allMealPanelTitle = new JLabel("Meal Plans");
		allMealPanelTitle.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		centerPanel.add(allMealPanelTitle);
		
		BasicMealPlan bmp = new BasicMealPlan();
		String description = bmp.getDes();
		System.out.print(description);
		basicMealPlan = new JTextArea(1,1);
		//basicMealPlan.setSize(5, 10);
		
		basicMealPlan.setEditable(false);
		basicMealPlan.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		basicMealPlan.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
		
		basicMealPlan.append(description);
	
		bronzeMealPlan = new JLabel("Bronze Meal Plan");
		silverMealPlan = new JLabel("Silver Meal Plan");
		goldMealPlan = new JLabel("Gold Meal Plan");
		platinumMealPlan = new JLabel("Platinum Meal Plan");
		
		centerPanel.add(basicMealPlan);
		centerPanel.add(bronzeMealPlan);
		centerPanel.add(silverMealPlan);
		centerPanel.add(goldMealPlan);
		centerPanel.add(platinumMealPlan);
		//centerPanel.add(gold);
		//centePanel.add()
		allMealPanel.add(bronzeMealPlan);
		allMealPanel.add(silverMealPlan);
		
		
		//centerPanel.add(basicMealPlan);
		
		// Add all panels to the main panel 
		//mainPanel.add(allMealPanel);
		//mainPanel.add(basicMealPlanPanel); 
		
	//	System.out.println("meal plan");
		JScrollPane scrollPane = new JScrollPane(centerPanel);
		this.add(scrollPane); 
	

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
				menuItem.addActionListener(new LoungeItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Karaoke Lounges");
				menuItem.addActionListener(new LoungeItemListener());
				submenu.add(menuItem);
				
				menuItem = new JMenuItem("Billiards Lounges");
				menuItem.addActionListener(new LoungeItemListener());
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

			//Meal Plan
			Object source = e.getActionCommand();
			switch(source.toString()) {
			case "All":
				
				//centerPanel.setVisible(false);
				//testPanel();
				createMealPanel(); 
				//allMealPanel.setVisible(true);
				//allMealPanel.setVisible(true);
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
			
				//
		}
		}
		
	}

	class LoungeItemListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent select) {
			JMenuItem item = (JMenuItem) select.getSource();
			switch(item.getText()) {
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
			}
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
	
	public static void main(String[] args
			) {
		MainFrame f = new MainFrame();
	}
}