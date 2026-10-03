// Find the smallest character in a string.
class SmaStr
{
	public static void main(String args[])
	{
		String str="Raju";
		char min=str.charAt(0);
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)<min)
				min=str.charAt(i);
				
		}
		System.out.println("Smaller Number "+min);
	}
}