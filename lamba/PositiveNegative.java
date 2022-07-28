package com.globalLogic.lamba;
interface Coder9{
	public void num(int a);
}
public class PositiveNegative {
 public static void main(String args[]) {
	 Coder9 cc=(n)->{
	 if(n>0) {
		 System.out.println("Positive");
	 }else {
		 System.out.println("Negative");
	 }
 };
 cc.num(-78);
}
}
