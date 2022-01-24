class Demo{

	public static void main(String[]ap){	
	

		//Every integral literal within the range of int datatype in Java is by default treated as an int type


		byte b;

		/*
		Here 10 is within the range of byte so implicit type casting takes place
		*/
		b = 10;// b = (byte)10;
		System.out.println(b);
		

		// error: incompatible types: possible lossy conversion from int to byte
		/*
		here no implicit type casting takes place as 200 is outside the range of byte
		*/
		//b = 200;  

		/*
		b = (byte)-128;
		System.out.println(b);
		b= (byte)-129;
		System.out.println(b);
		System.out.println(++b);
		System.out.println(++b);
		System.out.println(++b);
		System.out.println(++b);
		*/


		/*
		Here 200 is within the range of short so implicit type casting takes place
		*/
		short s = 200;// short s = (short)200;
		//System.out.println(s);

		 //error: incompatible types: possible lossy conversion from int to short
		//s = 35000;

		s = (short)32770;
		//System.out.println(s);

		int i;
		//int i = 2_500_000_000;//error: integer number too large
		
		//i = (int)2_500_000_000;//error: integer number too large
		
		//incompatible types: possible lossy conversion from long to int
		//i = 2_500_000_000L;

		i = (int)2_500_000_000L;//a valid explicit type conversion with data loss
		//System.out.println(i);


		long l = 654;// long l = (long)654;
		System.out.println(l);
		l = 9223372036854775807L;
		System.out.println(l);
	
	
	}



}