//Print characters at odd indexes.
class OddIndex
{
	public static void main(String args[])
	{
		String str="girish";
		for(int i=1;i<str.length();i+=2)
		{
			System.out.println(str.charAt(i)+"");
		}
	}
}