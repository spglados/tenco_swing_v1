package ch02;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 내부 클래스 활용해서 코드 완성
public class PaintFrame extends JFrame{
	
	PaintPanel paintPanel;
	
	public PaintFrame() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("집그리기");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		paintPanel = new PaintPanel();
	}
	
	private void setInitLayout() {
		add(paintPanel);
		setVisible(true);
	}
	
	
	class PaintPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.blue);
			int []x = {300,200,300,400};
			int []y = {120,200,250,200};
			g.fillPolygon(x, y, 4);
			g.setColor(Color.red);
			g.fillRect(200, 200, 200, 200);
			g.setColor(Color.BLACK);
			g.drawString("★", 180, 120);
			g.drawString("★", 180, 130);
			g.drawString("★", 200, 120);
			g.drawString("★", 200, 130);
			g.drawString("★", 220, 120);
			g.drawString("★", 220, 130);
			g.drawString("★", 380, 120);
			g.drawString("★", 380, 130);
			g.drawString("★", 400, 120);
			g.drawString("★", 400, 130);
			g.drawString("★", 420, 120);
			g.drawString("★", 420, 130);
			g.setColor(Color.YELLOW);
			g.fillRect(250, 250, 100, 100);
			
		}
		
		
		
	}
	
	

}
