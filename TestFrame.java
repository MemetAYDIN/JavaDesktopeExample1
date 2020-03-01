package com.aydin.desktop;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFrame extends JFrame implements ActionListener{
	
	public TestFrame() {
		setBounds(100,100,640,480);
		setTitle("Godoro");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton perfomButton=new JButton("Bas");
		perfomButton.setActionCommand("print");
		add(perfomButton);
		perfomButton.addActionListener(this);
		
		JButton seconButton=new JButton("Ekle");
		seconButton.setActionCommand("add");
		add(seconButton);
		seconButton.addActionListener(this);
		
		
		JButton thirdButton=new JButton("Güncelle");
		add(thirdButton);
		thirdButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Güncelleniyor");
				
			}
		});
		
		JButton frdButton=new JButton("Sil");
		add(frdButton);
		frdButton.addActionListener(
			(e)->
			 {
				JOptionPane.showMessageDialog(null, "Siliniyor");
				
			}//
		);
		
		JButton fvdButton=new JButton("Kontrol");
		add(fvdButton);
		fvdButton.addActionListener(
			(e)->{update();});// Lande Expression(Yapının adı)
	
	}
	
	public void update()
	{
		JOptionPane.showMessageDialog(null, "Kontrol Ediliyor");
		
	}
	
	public static void main(String[] args) {
		
		TestFrame frame=new TestFrame ();
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getActionCommand().equals("print"))
		{
		JOptionPane.showMessageDialog(null, "Basılıyor");
		}
		else if(event.getActionCommand().equals("add"))
		{
		JOptionPane.showMessageDialog(null, "Ekleniyor");
		}
		
	}

}
