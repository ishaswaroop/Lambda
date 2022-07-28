package com.globalLogic.lamba;
interface Stringup{
	public String upper(String num);
}
public class StringUpper {
public static void main(String args[]) {
	Stringup su=(num1)->{return num1.toUpperCase();};

System.out.println(su.upper("isha"));
}
}
