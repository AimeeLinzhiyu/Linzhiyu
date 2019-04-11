package com.rl.Integer;

public class IntegerDemo {
	public static void main(String[] args)
	{
		  System.out.println(Integer.MAX_VALUE);
		  System.out.println(Integer.MIN_VALUE);
		  
		  //把十进制的数转换成十六进制
		  System.out.println(Integer.toHexString(200));
		  //把十进制的数转换成八进制
		  System.out.println(Integer.toOctalString(30));
		  //把十进制的数转换成二进制
		  System.out.println(Integer.toBinaryString(40));
		  
		  Integer i=new Integer(2); 
		  System.out.println(i);
		  
	}
}
