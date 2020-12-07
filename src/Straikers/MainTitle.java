package Straikers;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainTitle extends JFrame {

	private MyPanel panel = new MyPanel();

	public MainTitle() {
		setTitle("스트라이커즈 1945");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(900, 850);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon bgImgicon = new ImageIcon("images/1945.png");
		private Image bgimg = bgImgicon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(bgimg, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new MainTitle();
	}
}
