package com.globalLogic.lamba;
interface Code{
	public int sum(int a,int b);
}

public class Lamda {
public static void main(String args[])
{
	Code code =(a,b)->{return a+b;};
	System.out.println(code.sum(10,50));
	
}
}
