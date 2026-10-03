//24. Check whether a string contains only alphabets.
class StrAlpha
{
	public static void main(String args[])
	{
		String str="ABC";
		if(str.matches("[a-z,A-Z]+"))
		{
			System.out.println("Alphabate");
		}else
		{
			System.out.println("No Alphabate");
		}
	}
}