package vista;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
@SuppressWarnings("serial")
public class RightSide extends JPanel{

	private JLabel equation;
	private JLabel Discriminant;
	private JLabel solution1;
	private JLabel solution2;
	private JLabel equation1;
	private JLabel Discriminant1;
	private JLabel solution11;
	private JLabel solution22;
	private String a;
	private String b;
	private String c;
	
	public RightSide () {
	
		 setLayout( new GridLayout(4, 2,5,5));
		initialize();
		setBorder(new TitledBorder("Información"));
		
	}

	private void initialize() {
		a="A";
		b= "B";
		c= "C";
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		equation= new JLabel("	ECUACIÓN : ");
		equation.setBorder(border);
		Discriminant= new JLabel("	DISCRIMINANTE: ");
		Discriminant.setBorder(border);
		solution1= new JLabel("	SOLUCIÓN 1: ");
		solution1.setBorder(border);
		solution2= new JLabel("	SOLUCIÓN 2: ");
		solution2.setBorder(border);
		equation1= new JLabel(a+"x^2+"+b+"x+"+c);
		equation1.setBorder(border);
		Discriminant1= new JLabel("NULL ");
		Discriminant1.setBorder(border);
		solution11= new JLabel("NULL");
		solution11.setBorder(border);
		solution22= new JLabel("NULL");
		solution22.setBorder(border);
		add(equation);
		add(equation1);
		add(Discriminant);
		add(Discriminant1);
		add(solution1);
		add(solution11);
		add(solution2);
		add(solution22);
	}
	public void setEquation(int i, String c) {
		
		switch (i) {
		case 1:
			a=c;
			break;

		case 2:
			b=c;
			break;
		case 3:
			this.c=c;
			break;
		}
		double valb=0, valc=0;
		try {
			valb=Double.parseDouble(b);
			valc=Double.parseDouble(this.c);
		} catch (Exception e) {
			
		}
		
			
		// CONDICIONAL MODIFICAR ECUACIÓN
		if(valb<0 && valc<0) {
			equation1.setText(a+"x^2"+b+"x"+this.c);
		} else if(valb<0) {
			equation1.setText(a+"x^2"+b+"x+"+this.c);
		} else if(valc<0) {
			equation1.setText(a+"x^2+"+b+"x"+this.c);
		} else {
			equation1.setText((a+"x^2+"+b+"x+"+this.c));
		}
		
	}
	/**
	 * en el parametro ingresado, se envia la información de 1, discriminante, 2 solucion 1 y 3 solución 2;
	 * @param text string que representa los valores para modificar la información. 
	 */
	public void setText(String text) {
		String[] array= text.split(",");
		
		Discriminant1.setText(array[0]);
		solution11.setText(array[1]);
		solution22.setText(array[2]);
	}
	public void resetText() {
		a="A";
		b= "B";
		c= "C";
		equation1.setText(a+"x^2+"+b+"x+"+c);
		Discriminant1.setText("NULL");
		solution11.setText("NULL");
		solution22.setText("NULL");
	}
	
}
