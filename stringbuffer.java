class stringbuffer
{
	public static void main(String arr[])
	{
		StringBuffer str=new StringBuffer("object language");
		System.out.println("original string "+str);
		System.out.println("length of string "+str.length());
		int i,p; 
		for(i=0;i<str.length();i++)
		{
			p=i+1;
			System.out.println("character at position"+p+"is"+str.charAt(i));
		}
			String c_str= new String(str.toString());
			int pos=c_str.indexOf("language");
			str.insert(pos,"oriented");
			System.out.println("modified string"+str);
			str.setCharAt(6,'-');
			System.out.println("string now "+str);
			str.append("improves security");
			System.out.println("append string "+str);
	}
}