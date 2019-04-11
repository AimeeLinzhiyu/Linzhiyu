package com.rl.random;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args)
  {
	  Random ran=new Random();
	  int num=0;
//	  for(int i=0;i<10;i++)
//	  {
//		  //num=ran.nextInt();
//		  num=ran.nextInt(100);
//		  System.out.println(num);
//	  }
	  Random random1=new Random(88);
	  for(int i=0;i<10;i++)
	  {
		  //num=ran.nextInt();
		  num=random1.nextInt(100);
		  System.out.println(num);
	  }
  }
}
