package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
@SuppressWarnings("serial")
public class LeftSide extends JPanel{

	/**
	 * 
	 */
	
	private JButton  coefficientA;
	private JButton  coefficientB;
	private JButton  coefficientC;
	private JButton  calculate;
	private JButton  reset;
	private PrincipalView view;
	private int enable;
	
	
	public LeftSide(PrincipalView view) 
	{

		this.view= view;
		setLayout(new GridLayout(5, 1,6,6));
		initialize();
		reset();
	
		setBorder(new TitledBorder("Operaciones"));
	
		
	}

	private void initialize() {
		Border border = BorderFactory.createLineBorder(Color.black, 1);
	
	  coefficientA= new  JButton(" Agregar Coeficiente A");
	  coefficientA.setBorder(border);
	  coefficientB= new  JButton("Agregar Coeficiente B");
	  coefficientB.setBorder(border);
	  coefficientC= new  JButton("Agregar Coeficiente C");
	  coefficientC.setBorder(border);
	  calculate= new  JButton("Calcular");
	  calculate.setBorder(border);
	  reset= new  JButton("Resetear");
	  reset.setBorder(border);
	  
	  coefficientA.setActionCommand(PrincipalView.COEFFICIENTA);
	  coefficientA.addActionListener(view);
	  coefficientB.setActionCommand(PrincipalView.COEFFICIENTB);
	  coefficientB.addActionListener(view);
	  coefficientC.setActionCommand(PrincipalView.COEFFICIENTC);
	  coefficientC.addActionListener(view);
	  calculate.setActionCommand(PrincipalView.CALCULATE);
	  calculate.addActionListener(view);
	  reset.setActionCommand(PrincipalView.RESET);
	  reset.addActionListener(view);
	  add(coefficientA);
	  add(coefficientB);
	  add(coefficientC);
	  add(calculate);
	  add(reset);
	}
	public void enable(int i) {
		switch (i) {
		case 1:
		coefficientA.setEnabled(false);
		enable++;
		break;
		case 2:
		coefficientB.setEnabled(false);	
		enable++;
		break;
		case 3:
		coefficientC.setEnabled(false);
		enable++;
		break;	
		
		}
		if(enable==3) {
			calculate.setEnabled(true);
		}
	}
	public void reset() {
		enable=0;
		  coefficientA.setEnabled(true);
		  coefficientB.setEnabled(true);
		  coefficientC.setEnabled(true);
		  calculate.setEnabled(false);
	
	}
	
}
