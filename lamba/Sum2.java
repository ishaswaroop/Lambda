package com.globalLogic.lamba;
interface Coder8{
	public int sum2();
}
public class Sum2 {


public static void main(String args[]) {


	
	Coder8 cc=()->{
		int sum=0;
		for(int i=0;i<=100;i++) {
		sum=sum+i;
	
	
	
	}
	return sum;
	};
	System.out.println(cc.sum2());
}
}
