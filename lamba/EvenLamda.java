package com.globalLogic.lamba;
interface Code1{
	

	public boolean check(int a);
}
public class EvenLamda {
	public static void main(String args[]) {
  Code1 cc=(a)->{return a%2==0;};
    if(cc.check(20)) {
    	System.out.println("Even");
    }else {
    	System.out.println("Odd");
    }
	}
}
