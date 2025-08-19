import java.io.FileOutputStream;

import java.io.FileInputStream;
 
class demo2

{

   public static void main(String asd[]) throws Exception

	{

	   FileOutputStream fout=new FileOutputStream("cafe.txt");

           String str="Welcome to The Butterbean's Cafe";

	   byte bystr[]=str.getBytes();

	   fout.write(bystr);

	   fout.close();
 
	   FileInputStream fin=new FileInputStream("cafe.txt");

           int i=0;

	   fin.skip(10);

	   while((i=fin.read())!=-1)

		System.out.print((char)i);
 
	   


	}

}
 