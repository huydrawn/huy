package test;

import java.util.regex.Pattern;

interface B {
	int getPoint();
}

abstract class A implements B {
	private int point;

	public A(int point) {
		this.point = point;
	}

	@Override
	public int getPoint() {

		return point;

	}

	public double cubePoint() {
		return Math.pow(point, 3);
	}
}

public class Sample extends A {
	private String name;

	public Sample(int point, String name) {
		super(point);
		this.name = name;
	}

	public static void main(String[] args) {
		A a = new Sample(10, "huy");
		System.out.println();// check in runtime compier
		System.out.println(Pattern.matches("[n]{1}[a-z]{3}", "aame"));
	}

}
