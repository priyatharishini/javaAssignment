package javaassignment;

public class Students 
{
public void getStudentInfo(int id)
{
	System.out.println("Students id "+id);
}
public void getStudentInfo(int id,String name)
{
	System.out.println( id+" "+ name);
}
public void getStudentInfo(String email,String  phoneNumber)
{
	System.out.println(email+ " " + phoneNumber);
}
public static void main(String[] args)
{
	Students s1=new Students();
	s1.getStudentInfo(10001);
s1.getStudentInfo(10002, "SAM");
s1.getStudentInfo("Sam91@gmail.com", "9934210099");
}
}
