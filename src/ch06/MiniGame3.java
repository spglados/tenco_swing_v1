package ch06;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniGame3 extends JFrame {
	
	private JLabel panel1;
	private JLabel jPlayer;
	private int jPlayerX = 100;
	private int jPlayerY = 100;
	private int panel1X = 0;
	private int panel1Y = 0;
	private final int MOVE_DISTANCE = 10;
	private final int FRAME_WIDTH = 1000;
	private final int FRAME_HEIGHT = 861;
	private final String PLAYER_NAME = "야스오";
	private final int PLAYER_WIDTH = 100; 
	private final int PLAYER_HEIGHT = 100;
	
	
	public MiniGame3() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Icon icon = new ImageIcon("images/LOLBackground.jpg");
		panel1 = new JLabel(icon);
		panel1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		panel1.setLocation(panel1X, panel1Y);
		
		jPlayer = new JLabel(new ImageIcon("images/Yasuo100.jpg"));
		jPlayer.setSize(PLAYER_WIDTH, PLAYER_HEIGHT);
	}
	
	private void setInitLayout() {
		setLayout(null);
		add(panel1);
		panel1.add(jPlayer);
		jPlayer.setLocation(jPlayerX, jPlayerY);
		setVisible(true);
	}
	
	private void addEventListener() {
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					jPlayerY -= MOVE_DISTANCE;
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					jPlayerX -= MOVE_DISTANCE;
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					jPlayerX += MOVE_DISTANCE;
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					jPlayerY += MOVE_DISTANCE;
				}
				jPlayer.setLocation(jPlayerX, jPlayerY);
			}
		});
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new MiniGame3();
	} // end of main

} // end of class
