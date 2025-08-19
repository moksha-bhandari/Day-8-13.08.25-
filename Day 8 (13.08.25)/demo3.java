import java.io.FileOutputStream;

import java.io.FileInputStream;

import java.io.BufferedInputStream;
 
class demo3

{

   public static void main(String asd[]) throws Exception

	{

	   FileOutputStream fout=new FileOutputStream("cafe.txt");

           String str="Welcome to the Butterbean's Cafe";

	   byte bystr[]=str.getBytes();

	   fout.write(bystr);

	   fout.close();
 
	   BufferedInputStream bin=new BufferedInputStream(new FileInputStream("cafe.txt"));

           int i=0;

	    while((i=bin.read())!=-1)

		System.out.print((char)i);
 
	   


	}

}
 