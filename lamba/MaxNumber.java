package com.globalLogic.lamba;
interface Coder{
	public int max(int a ,int b);

	

	
}
public class MaxNumber {
public static void main(String args[]) {
	Coder cc=(a,b)->{return Math.max(a, b);};
	System.out.println(cc.max(12,89));
}
}
