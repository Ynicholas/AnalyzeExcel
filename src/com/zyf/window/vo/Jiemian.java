package com.zyf.window.vo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;

import com.zyf.table.TableDemo;

public class Jiemian {
//�ó���ȷ����ʾ�ĳ��򣬴����JFrame��VisibleӦ��Ҫ�ŵ�������������Ϊtrue�������ȶ��ܶ�
//	public static void main1(String[] args) {
//		
//		JFrame frame = new JFrame("Frame With Panel");
//		Container contentPane = frame.getContentPane();
//		contentPane.setBackground(Color.CYAN); // ��JFrameʵ����������Ϊ����ɫ
//		JPanel panel = new JPanel(); // ����һ��JPanel��ʵ��
//		panel.setBackground(Color.yellow); // ��JPanel��ʵ����������Ϊ��ɫ
//		JButton button = new JButton("Press me");
//		panel.add(button); // ��JButtonʵ����ӵ�JPanel��
// 
//		contentPane.add(panel, BorderLayout.SOUTH); // ��JPanelʵ����ӵ�JFrame���ϲ�
//		frame.setSize(300, 200);
//		frame.setVisible(true);
//	}
	
    public static void main(String args[]) {
    	String title = "����ѡ��";
        JFrame myframe = new JFrame(title); 
        myframe.setDefaultCloseOperation(myframe.DISPOSE_ON_CLOSE);
	    Container c = myframe.getContentPane();
	    
	    JPanel mypanel = new JPanel();
	    
	    JButton a = new JButton("grade");
	    Monitora aa = new Monitora(); 
//	    mypanel.add(a);
	    a.addActionListener(aa);
	    
	    JButton b = new JButton("sex");
	    Monitorb bb = new Monitorb(); 
//	    mypanel.add(b);
	    b.addActionListener(bb);
	    
	    
	    mypanel.add(a);
	    mypanel.add(b);
	    c.add(mypanel);
	    myframe.setSize( 1000,1000);
        myframe.setVisible( true);   
    }
}

class Monitora implements ActionListener{
	String firstStr = "grade";
	String secondStr;
	public void actionPerformed(ActionEvent e){
		JFrame myjframe = new JFrame("����ʾ");

		myjframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		Container c = myjframe.getContentPane();
		
	    Panel mypanel = new Panel(new FlowLayout());

		
	    JLabel sexLabel = new JLabel("�꼶:");
	    sexLabel.setSize(20, 290);
	    
		JRadioButton firstRadioButton = new JRadioButton("��һ");

		firstRadioButton.setSelected(false);
		firstRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (firstRadioButton.isSelected()) {
					secondStr = firstRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});

		JRadioButton secondRadioButton = new JRadioButton("���");

		secondRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (secondRadioButton.isSelected()) {
					secondStr = secondRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		JRadioButton thirdRadioButton = new JRadioButton("����");

		thirdRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (thirdRadioButton.isSelected()) {
					secondStr = thirdRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		JRadioButton fourthRadioButton = new JRadioButton("����");

		fourthRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fourthRadioButton.isSelected()) {
					secondStr = fourthRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		JButton show = new JButton("ȷ��");
		show.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    try {
				TableDemo.createAndShowGUI(firstStr,secondStr);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		
		//�˴������Ƕ�JRadioButton���з�������Դﵽ����Ч��
		ButtonGroup sexGroup = new ButtonGroup();
		sexGroup.add(firstRadioButton);
		sexGroup.add(secondRadioButton);
		sexGroup.add(thirdRadioButton);
		sexGroup.add(fourthRadioButton);
		
		mypanel.add(sexLabel);
		mypanel.add(firstRadioButton);
		mypanel.add(secondRadioButton);
		mypanel.add(thirdRadioButton);
		mypanel.add(fourthRadioButton);
		mypanel.add(show);
	    c.add(mypanel);
		myjframe.setSize( 1000,1000);
		myjframe.setVisible( true);   

	}
}


class Monitorb implements ActionListener{
	String firstStr = "sex";
	String secondStr;
	public void actionPerformed(ActionEvent e){
		JFrame myjframe = new JFrame("����ʾ");

		myjframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		Container c = myjframe.getContentPane();
		
	    Panel mypanel = new Panel(new FlowLayout());

		
	    JLabel sexLabel = new JLabel("�Ա�:");
	    sexLabel.setSize(20, 290);
	    
		JRadioButton firstRadioButton = new JRadioButton("��");

		firstRadioButton.setSelected(false);
		firstRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (firstRadioButton.isSelected()) {
					secondStr = firstRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});

		JRadioButton secondRadioButton = new JRadioButton("Ů");

		secondRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (secondRadioButton.isSelected()) {
					secondStr = secondRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		
		JButton show = new JButton("ȷ��");
		show.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    try {
				TableDemo.createAndShowGUI(firstStr,secondStr);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		
		//�˴������Ƕ�JRadioButton���з�������Դﵽ����Ч��
		ButtonGroup sexGroup = new ButtonGroup();
		sexGroup.add(firstRadioButton);
		sexGroup.add(secondRadioButton);
		
		mypanel.add(sexLabel);
		mypanel.add(firstRadioButton);
		mypanel.add(secondRadioButton);
		mypanel.add(show);
	    c.add(mypanel);
		myjframe.setSize( 1000,1000);
		myjframe.setVisible( true);   

	}
}