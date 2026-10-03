//Remove all digits from a string.
class RmDigit
{
	public static void main(String args[])
	{
		String str="Giri1223h";
		String result=str.replaceAll("[0-9]","");
		System.out.println(result);
	}
}