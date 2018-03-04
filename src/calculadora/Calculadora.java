package calculadora;

public class Calculadora {
	private int num1;
	private int num2;
	
	Calculadora (int a, int b) {
		num1=a;
		num2=b;
	}
	
	public int suma() {
		return num1+num2;
	}
	
	public int resta() {
		return num1-num2;
	}
	
	public int multiplicacion() {
		return num1*num2;
	}
	
	public int division() {
		return num1/num2;
	}
	
	public Integer division2() {
		if(num2==0)return null;
		else return num1/num2;
	}
	
	public boolean num1EsMayor() {
		if (num1>num2) return true;
		else return false;
			
	}
	
	public int division3() {
		if(num2==0)
			throw new java.lang.ArithmeticException("Divisi�n por 0");
		else 
			return num1/num2;
	}
}
