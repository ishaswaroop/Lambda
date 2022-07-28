package com.globalLogic.lamba;
interface Code2{
	public void print();
}
public class HelloWorld {
public static void main(String args[]) {
	Code2 cc=()->System.out.println("Hello World");
	 cc.print();
}
}
