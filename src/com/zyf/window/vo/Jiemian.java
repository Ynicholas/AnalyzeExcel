package com.zyf.window.vo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;

import com.zyf.table.TableDemo;

public class Jiemian {
//得出正确的显示的程序，大概是JFrame的Visible应该要放到最后才让它属性为true，这样稳定很多
//	public static void main1(String[] args) {
//		
//		JFrame frame = new JFrame("Frame With Panel");
//		Container contentPane = frame.getContentPane();
//		contentPane.setBackground(Color.CYAN); // 将JFrame实例背景设置为蓝绿色
//		JPanel panel = new JPanel(); // 创建一个JPanel的实例
//		panel.setBackground(Color.yellow); // 将JPanel的实例背景设置为黄色
//		JButton button = new JButton("Press me");
//		panel.add(button); // 将JButton实例添加到JPanel中
// 
//		contentPane.add(panel, BorderLayout.SOUTH); // 将JPanel实例添加到JFrame的南侧
//		frame.setSize(300, 200);
//		frame.setVisible(true);
//	}
	
    public static void main(String args[]) {
    	String title = "功能选择";
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
		JFrame myjframe = new JFrame("表显示");

		myjframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		Container c = myjframe.getContentPane();
		
	    Panel mypanel = new Panel(new FlowLayout());

		
	    JLabel sexLabel = new JLabel("年级:");
	    sexLabel.setSize(20, 290);
	    
		JRadioButton firstRadioButton = new JRadioButton("大一");

		firstRadioButton.setSelected(false);
		firstRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (firstRadioButton.isSelected()) {
					secondStr = firstRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});

		JRadioButton secondRadioButton = new JRadioButton("大二");

		secondRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (secondRadioButton.isSelected()) {
					secondStr = secondRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		JRadioButton thirdRadioButton = new JRadioButton("大三");

		thirdRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (thirdRadioButton.isSelected()) {
					secondStr = thirdRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		JRadioButton fourthRadioButton = new JRadioButton("大四");

		fourthRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fourthRadioButton.isSelected()) {
					secondStr = fourthRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		JButton show = new JButton("确定");
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
		
		//此处代码是对JRadioButton进行分组操作以达到互斥效果
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
		JFrame myjframe = new JFrame("表显示");

		myjframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		Container c = myjframe.getContentPane();
		
	    Panel mypanel = new Panel(new FlowLayout());

		
	    JLabel sexLabel = new JLabel("性别:");
	    sexLabel.setSize(20, 290);
	    
		JRadioButton firstRadioButton = new JRadioButton("男");

		firstRadioButton.setSelected(false);
		firstRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (firstRadioButton.isSelected()) {
					secondStr = firstRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});

		JRadioButton secondRadioButton = new JRadioButton("女");

		secondRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (secondRadioButton.isSelected()) {
					secondStr = secondRadioButton.getText();
//					System.out.println(gradeStr);
				}
			}
		});
		
		
		JButton show = new JButton("确定");
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
		
		//此处代码是对JRadioButton进行分组操作以达到互斥效果
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