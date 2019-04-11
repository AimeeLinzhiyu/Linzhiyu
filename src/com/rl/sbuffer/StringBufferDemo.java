package com.rl.sbuffer;

public class StringBufferDemo {
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("可变字符串的长度是"+sb.length()+"容量是:"+sb.capacity());
	    System.out.println(sb);
	    
	    StringBuffer sb1=new StringBuffer(20);
	    System.out.println("可变字符串的长度是"+sb1.length()+"容量是:"+sb1.capacity());
	    System.out.println(sb1);
	    
	    StringBuffer sb2=new StringBuffer("thisistest");
	    System.out.println("可变字符串的长度是"+sb2.length()+"容量是:"+sb2.capacity());
	    System.out.println(sb2);
	}

}
