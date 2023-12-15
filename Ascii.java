class Ascii
{
	public static void main(String[] args)
	{
		int rows=5,value=65;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print((char)value);
				value++;
			}
			System.out.println();
		}
	}
}