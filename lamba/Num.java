package com.globalLogic.lamba;
interface sum{
	public void sum(int n);
}
public class Num {
public static void main(String args[]) {
	int a=10;
	sum s=(n)->{
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	};
	s.sum(a);
}
}
