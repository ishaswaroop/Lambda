package com.globalLogic.lamba;
interface Coder2{
	public int min(int a,int b);
}
public class MinNumber {
	public static void main(String args[]) {
		Coder2 cc=(a,b)->{return Math.min(a, b);};
		System.out.println(cc.min(12,89));
	}
}
