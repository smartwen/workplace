package AuditionDemo;

public class Question2 {

	
	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("hello");
		String s3=new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}
}
