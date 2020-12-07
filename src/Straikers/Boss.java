package Straikers;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Boss extends JLabel {

	private Boss boss = this;
	private static final String TAG = "Boss : ";
	
	public int x = 90;
	public int y = 0;
	
	public Boss() {
		ImageIcon imgBoss = new ImageIcon("images/boss.gif");
		setIcon(imgBoss);
		setSize(300, 300);
		setLocation(x, y);
	}
}
