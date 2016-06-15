package app;

public class ComplexTest {
	public static void main(String[] args) {
		Complex a = new Complex(0.4, -0.8);
		Complex b = new Complex(1, 2);
		
		b.add(a);
		
		System.out.println(b.re + " " + b.im + "i");
		
		b.mul(b);
		
		System.out.println(b.re + " " + b.im + "i");
		
		
		}
}
