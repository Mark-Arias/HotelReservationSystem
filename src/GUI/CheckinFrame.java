package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.border.Border;
import Observer.Guest;
import Observer.Reservation;

public class CheckinFrame extends JFrame{
	private JList list;
	private JButton CheckIn;
	private JButton Cancel;
	private String[] waitList = {"Allyson", "Ben", "Kaitlyn", "George", "Emily"};
	
	public CheckinFrame() {
		CreateComponents();
		this.setTitle("Check In");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	public void CreateComponents() {
		list = new JList(waitList);
		CheckIn = new JButton("Check In");
		Cancel = new JButton("Cancel");
		
		JPanel panel = new JPanel();
		panel.add(new JScrollPane(list));
		panel.add(CheckIn);
		panel.add(Cancel);
		
		this.add(panel);
		
		ActionListener listener = new ButtonListener();
		CheckIn.addActionListener(listener);
		Cancel.addActionListener(listener);
		
	}
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == CheckIn) {
				int i = list.getSelectedIndex();
				list.remove(i);
				dispose();
			}
			else if (source == Cancel) {
				dispose();
			}
		}
	}

}
