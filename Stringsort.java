class Stringsort
{
	static String name[]={"MUMBAI","KOLKATA","DELHI","CHENNAI"};
	public static void main(String arr[])
	{
		String temp=null;
		int i,j;
		for(i=0;i<name.length;i++)
		{
			for(j=i+1;j<name.length;j++)
			{
				if(name[j].compareTo(name[i])<0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		for(i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}
}