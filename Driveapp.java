
/* import java.io.*;
class Driveapp
{
	public static void main(String args[])
	{
		
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
} */

import java.io.*;
 class Driveapp{
	 public static void main(String agrs[])
	 {
		 File f[]=File.listRoots();
		 for(int i=0;i<f.length;i++)
		 {
			 long totalspace=f[i].getTotalSpace();
			 long freeSpace=f[i].getreeSpace();
			 System.out.println(f[i]+"\t"+(totalSpace/10312333)+"GB\t"+(freeSpace/1044034334)+"GB");
		 }
	 }
 }
