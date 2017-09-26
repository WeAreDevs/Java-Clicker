package wearedevs.javaclicker.gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import wearedevs.javaclicker.Main;

@SuppressWarnings("serial")
public class ShopPanel extends JPanel {
	public JPanel upgradesPanel;
	public JLabel labelClicks;

	public ShopPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		JButton backBtn = new JButton("Go Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.updateCounter();
				
				Main.main.setContentPane(Main.mainPanel);
			}
		});
		backBtn.setBounds(12, 398, 270, 40);
		add(backBtn);
		
		upgradesPanel = new JPanel();
		upgradesPanel.setBounds(12, 75, 616, 311);
		add(upgradesPanel);
		upgradesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JLabel labelTitle = new JLabel("The Shop");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		labelTitle.setBounds(12, 13, 616, 67);
		add(labelTitle);
		
<<<<<<< HEAD
		
		labelClicks = new JLabel("You Have " + Main.clicks + " Clicks");
		labelClicks.setBounds(290, 410, 345, 16);
=======
		labelClicks = new JLabel("0 Clicks");
		labelClicks.setHorizontalAlignment(SwingConstants.RIGHT);
		labelClicks.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelClicks.setBounds(282, 398, 346, 40);
>>>>>>> 63b3a9c3b19a592935e909d2d2bc5898bd1808cb
		add(labelClicks);
	}
}
