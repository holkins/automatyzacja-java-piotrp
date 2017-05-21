package codesprinters.autojava;

public class Square extends AbstractShape {

	private double a;

	public Square(double a) {
		this.a = a;
	}

	public double getArea() {
		return a*a;
	}

	public double getSide() {return a;}

}
