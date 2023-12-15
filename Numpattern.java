class Numpattern
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			
			for(int c=5;c>=r;c--)
			{
				System.out.print("  ");
			}
			for(int c=2;c<=r;c++)
			{
				
				System.out.print(c +" ");
			
			}
			
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
	