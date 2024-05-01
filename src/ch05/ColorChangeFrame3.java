package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame3 extends JFrame implements ActionListener{

	private JPanel panel1; // 배경패널 선언
	private JPanel panel2; // 버튼패널 선언
	
	private JButton button1; // 버튼 선언
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	// ColorChangeFrame3에 대입
	public ColorChangeFrame3() {
		initData(); 
		setInitLayout();
		addEventLisrener();
	}
	
	// 데이터 생성
	private void initData() {
		setSize(500, 500); // 기본 사이즈 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x누르면(창닫으면) 실행중지
		setLayout(new BorderLayout()); // 보더레이아웃 생성
		
		panel1 = new JPanel(); // "panel1(배경패널)"란 이름으로 JPanel 생성
		panel2 = new JPanel(); // "panel2(버튼패널)"란 이름으로 JPanel 생성
		
		panel1.setBackground(Color.black); // 배경패널의 초기 배경패널 색 설정
		
		button1 = new JButton("1"); // 버튼 생성 
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
	}
	
	// 레이아웃의 데이터 
	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER); // 배경패널추가, 위치설정
		add(panel2, BorderLayout.SOUTH); // 버튼패널추가, 위치설정
		panel2.add(button1); // 생성된 버튼을 버튼패널에 추가
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		setVisible(true); // 실행시 보이도록 설정
	}
	
	// 이벤트
	private void addEventLisrener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	// 버튼 눌렀을 때 행동 설정
	// 오버라이드
	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource를 오브젝트로 생성
		Object object = e.getSource();
		// selectedButton 이라는 JButton 생성
		// getSource 를 JButton으로 강제 형변환해서 selectedButton에 대입
		JButton selectedButton = (JButton)e.getSource();
		
		// 배경패널색 변경
		// 1 클릭시 빨강
		// 2 클릭시 오랜지
		// 3 클릭시 노랑
		// 아니면(4) 초록
		if(selectedButton == this.button1) {
			panel1.setBackground(Color.red); 
		} else if(selectedButton == this.button2) {
			panel1.setBackground(Color.orange);
		} else if(selectedButton == this.button3) {
			panel1.setBackground(Color.yellow);
		} else {
			panel1.setBackground(Color.green);
		}
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new ColorChangeFrame3(); 
	} // end of main
}
