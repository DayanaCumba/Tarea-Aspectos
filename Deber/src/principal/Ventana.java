package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import Observer.Boton;

public class Ventana {
	private Boton boton;
	private JButton boton1; 
	private JButton boton2;
	private JButton boton3;
	
	JTextField campo = new JTextField(20);
	Color[] colors;
	
	public Ventana() {
        super();                    
        colors = new Color[3];
        colors[0] = Color.green;
        colors[1] = Color.black;
        colors[2] = Color.pink;
        inicializarComponentes();          
    }
	
	
	
	
	private void inicializarComponentes() {
	
		boton1 = new JButton();	
		boton2 = new JButton();
		boton3 = new JButton();
		boton1.setText(getColourName(colors[0]));  	
		boton1.setBounds(50, 20, 200, 30);  	 
		boton2.setText(getColourName(colors[1]));   
		boton2.setBounds(50, 60, 200, 30);  
		boton3.setText(getColourName(colors[2]));   
		boton3.setBounds(50, 100, 200, 30);  
		campo.setBounds(50,140,200,30);
		
		
		boton1.addActionListener((new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				accionBoton1(e,colors[0]);
			}  
			}));
			boton2.addActionListener((new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				accionBoton2(e,colors[1]);
			}  
			}));
			boton3.addActionListener((new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					accionBoton3(e,colors[2]);
			}  
			}));
			
			this.add(boton1);
			this.add(boton2);
			this.add(boton3);
			this.add(campo);
	}
	
	private void accionBoton1(ActionEvent e, Color color){
		this.getContentPane().setBackground( color );
	}
	
	private void accionBoton2(ActionEvent e, Color color){		
		this.getContentPane().setBackground(color );
	}	
		
	private void accionBoton3(ActionEvent e, Color color){		
		this.getContentPane().setBackground( color );
	}
	
	
	private String getColourName(Color color) {
	    String name = "UNKNOWN";	    
	        if (color.equals(Color.green)){
	            name = "verde";
	        }else if (color.equals(Color.black)){
	        	name = "negro";
	        }else if (color.equals(Color.pink)){
	        	name = "rosado";
	        }	    
	    return name;
	}
	
	
	void changeColor(Color c) {
		frmObservableColors.getContentPane().setBackground(c);
	}
	
	void invertColor(Color c) {
		Color cInv = new Color(255-c.getRed(), 255-c.getGreen(), 255-c.getBlue());
		frmObservableColors.getContentPane().setBackground(cInv);
	}
}
