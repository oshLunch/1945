package Straikers;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImagingOpException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VsBoss extends JFrame {

	private VsBoss vsBoss = this;
	private static final String TAG = "VsBoss : ";
	
	private Image bufferImg;
	private Graphics screenGraphics;
	
	private Image vsBossImg = new ImageIcon("images/vs Boss stage.png").getImage();
	
	public static Player player = new Player();
	private Boss boss;

	ImageIcon originBossBgIcon = new ImageIcon("images/vs Boss stage.png");
	Image originBossBgImg = originBossBgIcon.getImage();
	Image bossBgImg = originBossBgImg.getScaledInstance(480, 620, Image.SCALE_SMOOTH);
	ImageIcon bossBgIcon = new ImageIcon(bossBgImg);

	int backY1 = 0;

	public VsBoss() {
		setTitle("º¸½ºÀü");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 318, 608
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		init();
		player.start();
		
		setVisible(true);
	}
	
	private void init() {
		addKeyListener(new keyListener());
	}

	public void paint(Graphics g) {
		bufferImg = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphics = bufferImg.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(bufferImg, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(bossBgImg, 0, 0, null);
		player.gameDraw(g);
		this.repaint();
	}

	class keyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_SPACE:
					player.setAttack(true);
					break;
				case KeyEvent.VK_UP:
					player.setUp(true);
					break;
				case KeyEvent.VK_DOWN:
					player.setDown(true);
					break;
				case KeyEvent.VK_LEFT:
					player.setLeft(true);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(true);
					break;
			}
		}

		public void keyReleased(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_SPACE:
				player.setAttack(false);
				break;
			case KeyEvent.VK_UP:
				player.setUp(false);
				break;
			case KeyEvent.VK_DOWN:
				player.setDown(false);
				break;
			case KeyEvent.VK_LEFT:
				player.setLeft(false);
				break;
			case KeyEvent.VK_RIGHT:
				player.setRight(false);
				break;
			}
		}
	}
}
