package com.rl.system;

public class SystemDemo {
	public static void main(String[] args)
	{
		  int[] arr1= {2,4,23,6};
		  int[] arr2= {7,6,8,12};
		  System.arraycopy(arr1,1,arr2,2,1);
		  for(int i=0;i<arr2.length;i++)
		  {
			  System.out.println(arr2[i]);
		  }
		  
		  long timeMillis=System.currentTimeMillis();
		  System.out.println("1970�����������"+timeMillis+"����");
		  //System.exit(0);
		  System.gc();//�ֶ���������������
		  String value=System.getProperty("os.name");
		  System.out.println(value);
	}
}
