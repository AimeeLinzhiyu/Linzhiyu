package com.rl.sbuffer;

public class StringBufferDemo {
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("�ɱ��ַ����ĳ�����"+sb.length()+"������:"+sb.capacity());
	    System.out.println(sb);
	    
	    StringBuffer sb1=new StringBuffer(20);
	    System.out.println("�ɱ��ַ����ĳ�����"+sb1.length()+"������:"+sb1.capacity());
	    System.out.println(sb1);
	    
	    StringBuffer sb2=new StringBuffer("thisistest");
	    System.out.println("�ɱ��ַ����ĳ�����"+sb2.length()+"������:"+sb2.capacity());
	    System.out.println(sb2);
	}

}
