package com.globalLogic.lamba;
interface StringRev1{
	public String revm(String num);
}
public class StringRev {
      public static void main(String args[]) {
    	
		StringRev1 rev=(num1)->{
    	  String revs="";
    	  for(int i=num1.length()-1;i>=0;i--) {
    		  revs=revs+num1.charAt(i);
    	  }
    	  return revs;
      };
      System.out.println(rev.revm("Isha"));
      }
}
