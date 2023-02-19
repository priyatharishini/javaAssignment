package javaassignment;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		int count;
		String[] s1 = text.split(" ");
		
		for(int i=0;i<s1.length-1;i++)
		{
		count=0;	 		
			for(int j=0;j<s1.length-1;j++)
		{
			if(s1[i].equals(s1[j]))
			{
			count++;
		if(count>1)
		{
		s1[j]="";
		}
	}

}
		}
	
 String result="";
 
for(String word:s1)
{
	if(!s1.equals(""))
	{

	result+=word+" ";
	//System.out.println(result.trim());

	}
}
System.out.println(result);

	}
}
