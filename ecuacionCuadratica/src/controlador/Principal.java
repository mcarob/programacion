package controlador;

import modelo.World;
import vista.PrincipalView;
@SuppressWarnings("unused")
public class Principal {

	private World equation;
	private PrincipalView view;
	
	public Principal() {
		equation= new World();
		view= new PrincipalView(this);
	}
	public void setA(double a) {
		equation.setA(a);
	}
	public void setB(double b) {
		equation.setB(b);
	}
	public void setC(double c) 
	{
	
		equation.setC(c);
	}
	public void evaluate()throws Exception {
		equation.evaluate();
	}
	public void reset() {
		equation.reset();
	}
	public double getDiscriminant() {
		return equation.getDiscriminant();
	}
	public String getvalueA() {
		return equation.getOne();
	}
	public String getvalueB() {
		return equation.getTwo();
	}
	/**
	 * 1) discriminante
	 * 2) valor 1 ;
	 * 3) valor 2;
	 * @return
	 */
	public String arrayInfos() {
	 return equation.info();
		
		
		
	}
}
