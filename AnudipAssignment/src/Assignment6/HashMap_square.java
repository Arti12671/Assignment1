package Assignment6;

import java.util.HashMap;

public class HashMap_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Integer>data=new HashMap<>();//create HashMap
data.put(1,(int)Math.pow(1, 2));
data.put(2,(int)Math.pow(2, 2));
data.put(3,(int)Math.pow(3, 2));
data.put(4,(int)Math.pow(4, 2));
data.put(5, (int)Math.pow(5, 2));
data.put(6, (int)Math.pow(6, 2));
data.put(7,(int)Math.pow(7, 2));
data.put(8,(int)Math.pow(8, 2));
data.put(9,(int)Math.pow(9, 2));
data.put(10,(int)Math.pow(10, 2));
data.put(11,(int)Math.pow(11, 2));
data.put(12,(int)Math.pow(12, 2));
data.put(13, (int)Math.pow(13, 2));
data.put(14, (int)Math.pow(14, 2));
data.put(15, (int)Math.pow(15, 2));
for(Integer n:data.values())//using for loop
{
		System.out.println(n);//print values
}
  }
}