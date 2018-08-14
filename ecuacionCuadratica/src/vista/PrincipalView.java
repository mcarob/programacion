package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import controlador.Principal;

@SuppressWarnings("serial")
public class PrincipalView  extends JFrame implements ActionListener{

	public static final String COEFFICIENTA = "coeficiente a";
	public static final String COEFFICIENTB = "coeficiente b";
	public static final String COEFFICIENTC = "coeficiente c";
	public static final String CALCULATE = "calcular";
	public static final String RESET = "resetear";
	Principal controler;
	LeftSide actions;
	RightSide Information;
	
	
	public PrincipalView(Principal pControl) {
		
		
		controler=pControl;
		Information= new RightSide();
		actions= new LeftSide(this);
		setLayout(new GridLayout(1,2,5,5));
		add(actions);
		add(Information);
		setTitle("Ecuación Cuadratica");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 200, 550, 200);
		setVisible(true);
		setResizable(false);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String event=e.getActionCommand(); 
		if(event==COEFFICIENTA) {
			try {
				String val=JOptionPane.showInputDialog("Ingrese el valor del Coeficiente A");
				Information.setEquation(1, val);
				controler.setA(Double.parseDouble(val));
				actions.enable(1);
			} catch (Exception e2) {
				
			}
			
			
		} else if(event==COEFFICIENTB) {
			try {
				String val=JOptionPane.showInputDialog("Ingrese el valor del Coeficiente B");
				Information.setEquation(2, val);
				controler.setB(Double.parseDouble(val));
				actions.enable(2);
			} catch (Exception e2) {
				
			}
			
		}else if(event==COEFFICIENTC) {
			
			try {
				
				String val=JOptionPane.showInputDialog("Ingrese el valor del Coeficiente C");
				Information.setEquation(3, val);
				
				controler.setC(Double.parseDouble(val));
				
				actions.enable(3);
			} catch (Exception e2) {
				
			}
			actions.enable(3);
		}else if(event==CALCULATE) {
			try {
				controler.evaluate();	
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null,e2.getMessage() );
			}
			String array=controler.arrayInfos();
			Information.setText(array);
		} else {
			controler.reset();
			Information.resetText();
			actions.reset();
		}
		
	}
}
