class Pattern1
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=r;
			for(int c=5;c>=r;c--)
			{
				if(r==c)
				{
					System.out.println(r+" ");
				}
				else
					System.out.println("  ");
			
			}
			for(int c=5;c>=r;c--)
			{
				if(c==5)
				System.out.print(temp);
				else
				System.out.print("  ");
			}
			temp++;
			System.out.println();
		}
	}
}