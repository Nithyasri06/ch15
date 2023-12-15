class Starpattern
{
	public static void main(String[] args)
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=rows;c++)
			{
			
				
			           if(c==1||c==4)
				
					System.out.print("* ");
				
				 
			      else
			      System.out.print("  ");
			}
			System.out.println();
		}
	}
}