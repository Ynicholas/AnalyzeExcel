package com.zyf.danview;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;

import com.zyf.table.TableDemo;

public class Danview {
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
	static int i1=0,i2=0;
	static JPanel mypanel2 = null;
	static JPanel mypanel3 = null;
	static JPanel mypanel4 = null;
    public static void main(String args[]) {
    	String title = "����ѡ��";
        JFrame myframe = new JFrame(title); 
        myframe.setDefaultCloseOperation(myframe.DISPOSE_ON_CLOSE);
        myframe.setLayout(new BorderLayout(10,10));
	    Container c = myframe.getContentPane();
	    
	    JPanel mypanel = new JPanel();
	    
	    String as = "grade";
	    JButton a = new JButton(as);
//	    mypanel.add(a);
	    a.addActionListener(new ActionListener(){
	    	String firstStr = "grade";
	    	String secondStr;	
	    	public void actionPerformed(ActionEvent e){
	    		
	    			
//	    		myjframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
//				Container c = myframe.getContentPane();
				
	    		if(i2==1){
	    			mypanel3.setVisible(false);
	    			i1=0;
	    		}
				if(i1==0){
					mypanel2 = new JPanel();
				    JLabel sexLabel = new JLabel("�꼶:");
				    sexLabel.setSize(20, 290);
				    
					JRadioButton firstRadioButton = new JRadioButton("��һ");
			
					firstRadioButton.setSelected(false);
					firstRadioButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
			
							if (firstRadioButton.isSelected()) {
								secondStr = firstRadioButton.getText();
	//	    								System.out.println(gradeStr);
							}
						}
					});
			
					JRadioButton secondRadioButton = new JRadioButton("���");
			
					secondRadioButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (secondRadioButton.isSelected()) {
								secondStr = secondRadioButton.getText();
	//	    								System.out.println(gradeStr);
							}
						}
					});
					
					JRadioButton thirdRadioButton = new JRadioButton("����");
			
					thirdRadioButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (thirdRadioButton.isSelected()) {
								secondStr = thirdRadioButton.getText();
	//	    								System.out.println(gradeStr);
							}
						}
					});
					
					JRadioButton fourthRadioButton = new JRadioButton("����");
			
					fourthRadioButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (fourthRadioButton.isSelected()) {
								secondStr = fourthRadioButton.getText();
	//	    								System.out.println(gradeStr);
							}
						}
					});
					
					JButton show = new JButton("ȷ��");
					show.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
						    try {
							TableDemo tableDemo = TableDemo.createAndShowGUI(firstStr,secondStr);
							
							c.add(tableDemo,BorderLayout.SOUTH);
							myframe.pack();
							myframe.setVisible(true);
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
						
						mypanel2.add(sexLabel);
						mypanel2.add(firstRadioButton);
						mypanel2.add(secondRadioButton);
						mypanel2.add(thirdRadioButton);
						mypanel2.add(fourthRadioButton);
						mypanel2.add(show);
					    c.add(mypanel2);
//						myframe.setSize( 400,300);
						myframe.setVisible( true);   
						myframe.validate();
						i1=1;
				}else{
					
				}
		}
});
	    
	    JButton b = new JButton("sex");
	    b.addActionListener(new ActionListener(){
	    	String firstStr = "sex";
	    	String secondStr;
	    	
	    	public void actionPerformed(ActionEvent e){
	    		if(i1==1){
	    			mypanel2.setVisible(false);
	    			i2=0;
	    		}
	    		if(i2==0){
		    		mypanel3 = new JPanel();
		    	 	JLabel sexLabel = new JLabel("�Ա�:");
				    sexLabel.setSize(20, 290);
				    
					JRadioButton firstRadioButton = new JRadioButton("��");
	
					firstRadioButton.setSelected(false);
					firstRadioButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
	
							if (firstRadioButton.isSelected()) {
								secondStr = firstRadioButton.getText();
	//							System.out.println(gradeStr);
							}
						}
					});
	
					JRadioButton secondRadioButton = new JRadioButton("Ů");
	
					secondRadioButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (secondRadioButton.isSelected()) {
								secondStr = secondRadioButton.getText();
	//							System.out.println(gradeStr);
							}
						}
					});
					
					
					JButton show = new JButton("ȷ��");
					
					show.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							try {	
								TableDemo tableDemo = TableDemo.createAndShowGUI(firstStr,secondStr);
		//						myframe.setContentPane(tableDemo);
		//						myframe.pack();
								c.add(tableDemo,BorderLayout.SOUTH);
								myframe.pack();
								myframe.setVisible(true);
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
					
					mypanel3.add(sexLabel);
					mypanel3.add(firstRadioButton);
					mypanel3.add(secondRadioButton);
					mypanel3.add(show);
				    c.add(mypanel3);
				    
	//			    c.add(mypanel2,new Integer(Integer.MAX_VALUE));
	//				myframe.setSize( 400,300);
					myframe.setVisible( true);   
					i2=1;
	    		}else{
	    			
	    		}
	    }});
	    
	    
	    mypanel.add(a);
	    mypanel.add(b);
	    c.add(mypanel,BorderLayout.NORTH);
	    myframe.setSize(534,400);
        myframe.setVisible( true);   
    }
}