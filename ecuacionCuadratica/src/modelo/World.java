package modelo;

public class World {

	/**
	 * atributos de la clase mundo a b y c representan los coeficientes de la ecuación cuadrática
	 */
	private double a;
	private double b;
	private double c;
	private  double discriminant;
	private String one;
	private String two;

	
	/**
	 * constructor de la clase mundo incializa los valores con el metodo reset,  a b y c comiezan con 0, one y two 
	 * representa en String el valor de la respuesta
	 * discriminante corresponde a b^2-4ac 
	 */
	public World() {
	
		reset();
	}

	public void setA(double a) {
		this.a = a;
	}


	public void setB(double b) {
		this.b = b;
	}


	public void setC(double c) {
		this.c = c;
	}

	public void reset() 
	{		
		a=0;
		b=0;
		c=0;		
		one="";
		two="";
		discriminant=0;
	
	}
	public void evaluate()throws Exception {

	sqrtin();
	if(this.a==0) {
		throw new ZeroException();
	} else if(discriminant<0) {
		throw new RaizException();
	}else if(discriminant==0) {
		zeros(1);
	} else {
		zeros(0);
	}
	}

	private void zeros( int i) {
		
		double ans=-1;
		double ans1=-1;
		if(i==1) {
			ans=-(b/(2*a));
			one=String.valueOf(ans);
			

		} else {
			ans=(-b+(Math.sqrt(this.discriminant)))/(2*a);
			one=String.valueOf(ans);
			
			ans1=(-b-(Math.sqrt(this.discriminant)))/(2*a);
			two=String.valueOf(ans1);
		}

	}

	private void sqrtin() {
	
		this.discriminant=((b*b)-(4*(a)*(c)));

	}

	public double getDiscriminant() {
		return discriminant;
	}

	public String getOne() {
		return one;
	}

	public String getTwo() {
		return two;
	}

	/**
	 * 1) determinante 
	 * 2) valor 1;
	 * 3) valor 2;
	 * @return
	 */
	public String info() {
		String ans="";
		
		 if(discriminant<0 ) {
			 ans=String.valueOf(discriminant)+","+"Solución imaginaria"+","+"Solución imaginaria";
			
		 } else if(a==0) {
			 ans="NULL"+","+"NULL"+","+"NULL";
		 }else if (discriminant==0){
			 
			 ans=String.valueOf(discriminant)+","+one+","+"no tiene solución 2";
		 } else if(discriminant>0) {
			 ans=String.valueOf(discriminant)+","+one+","+two;
		 }
		 System.out.println(ans);
		return ans;
	}
	
	 
}
