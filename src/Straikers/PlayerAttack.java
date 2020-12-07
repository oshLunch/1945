package Straikers;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PlayerAttack {
	Image bulletImg = new ImageIcon("images/Player Bullet.png").getImage();
	int x, y;
	int width = bulletImg.getWidth(null);
	int height = bulletImg.getHeight(null);
	
	public PlayerAttack(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.y --;
	}
}
