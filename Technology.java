class Technology
{
	public static void main(String[] args)
	{
		int num=2025,count=0,num1=20,num2=25,sum=0,temp=num,result=0,square=0,firsthalf=0,secondhalf=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		if(count%2==0)
		{
			firsthalf=num%(int)Math.pow(10,count/2);
			secondhalf=num/(int)Math.pow(10,count/2);
			sum=firsthalf+secondhalf;
		}
		result=(int)Math.pow(sum,2);
		if(temp==result)
		{
			System.out.println("Technology Number");
		}
		else
		{
			System.out.println("Not a Technology Number");
		}
		
		
	}
}