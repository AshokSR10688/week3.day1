package week3.day1;

public class Calculator {
	private void add(int a, int b) {
		System.out.println(a + b);

	}
	private void add(float a, float b, float c) {
		
		System.out.println(a + b + c);

	}
	private void sub(int c,int d) {
		
		System.out.println(c - d);

	}
	private void sub(double c,int d) {
		
		System.out.println(c - d);

	}
	private void mul(int e, int f) {
		
		System.out.println(e*f);

	}
	private void mul(double e, int f) {
		
		System.out.println(e*f);

	}
	private void div(int g, int h) {
		
		System.out.println(g / h);

	}
	private void div(double g, int h) {
		
		System.out.println(g / h);

	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(1,8);
		calc.sub(22,1);
		calc.mul(4,3);
		calc.div(12,3);
		calc.add(2.0f,4.5f,3.2f);
		calc.sub(25,15);
		calc.mul(4,3000);
		calc.div(478,2);
		System.out.println("All calcs are working");
	}

}
