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
import Room.AdultBilliardsLounge;
import Room.AquaRoom;
import Room.KaraokeRoom;
import Room.MediumPartyRoom;
import Room.SmallPartyRoom;
public class AllRoomFrameDescription extends JFrame{	
	
	JPanel mainContainer;
	JLabel smallRoomLabel;
	JLabel mediumRoomLabel;
	
	SmallPartyRoom spR; 
	
	AllRoomFrameDescription()
	{
		//this.makeRooms();
		this.setTitle("All Rooms");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); //makes window screen size
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//this.createMenuBar();
		//this.createMainPanel();
		this.createComponents();
		this.setVisible(true);
		
	}

	public void createComponents() {
		
		smallRoomLabel = new JLabel("Small Room Description");
		JTextArea smRD = new JTextArea(spR.getDescription());
		
		mainContainer = new JPanel();
		mainContainer.add(smallRoomLabel);
		mainContainer.add(smRD);
		
		this.add(mainContainer);
		
	}
}