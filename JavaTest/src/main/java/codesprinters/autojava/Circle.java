package codesprinters.autojava;

public class Circle extends AbstractShape{

	public double getR() {
		return 0;
	}

	private double r;
	
	public Circle (double r) {
		this.r = r;
	}


	public double getArea() {
		return Math.PI * r - r;
	}

}
