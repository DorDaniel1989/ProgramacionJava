package swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;

public class Formularios1 extends JFrame {

	
	public Formularios1(String titulo, int ancho, int alto) {
		
		super (titulo);
		setSize(ancho, alto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenedor=getContentPane();
		
		
		JLabel label =new JLabel("Norte", JLabel.CENTER);
		label.setFont(new Font("Courier",Font.BOLD,36));
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		getContentPane();add(label, BorderLayout.NORTH);
		
		label=new JLabel("Sur",JLabel.CENTER);
		label.setFont(new Font("Arial",Font.ITALIC,25));
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		getContentPane().add(label, BorderLayout.SOUTH);
		
		label=new JLabel("Este",JLabel.CENTER);
		label.setFont(new Font("Courier",Font.PLAIN,30));
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		getContentPane().add(label, BorderLayout.EAST);
		
		label=new JLabel("OEste",JLabel.CENTER);
		label.setFont(new Font("Sans Serif",Font.ITALIC,30));
		label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		getContentPane().add(label, BorderLayout.WEST);
		
		
		
		
		
		
		/*GridLayout gl= new GridLayout(4,3);
		gl.setHgap(5);
		gl.setVgap(5);
		
		contenedor.setLayout(gl);
		
		for(int i=1; i<=9; i++) {
			contenedor.add(new JButton(String.valueOf(i)));
		}
		
		
		contenedor.add(new JButton("*"));
		contenedor.add(new JButton("0"));
		contenedor.add(new JButton("#"));
		
		
		
		/*
		JLabel etiqueta =new JLabel("Nombre >>>>");
		JTextField texto =new JTextField(20);
		JButton boton =new JButton("Salir");*/
		
		/*contenedor.add(etiqueta);
		contenedor.add(texto);
		contenedor.add(boton);*/
		
	}
	
	
	
}
	
	
	