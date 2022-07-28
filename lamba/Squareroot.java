package com.globalLogic.lamba;
interface Square{
	public double Sq(double num);
}
public class Squareroot {
public static void main(String args[]) {
	Square sq=(a)->Math.sqrt(a);

System.out.println(sq.Sq(4.0));
}
}
