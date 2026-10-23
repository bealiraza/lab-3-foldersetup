public class demo3{
	public static void main(String args []){
	student a= new student();
	a.name = "Ali";
	student b= a;
	b.name = "Sara";
	student c= new student();
	c.name = a.name;
	
	System.out.println(a.name);
	System.out.println(b.name);
	System.out.println(c.name);
	
	
	System.out.println(a==b);
	System.out.println(a==c);
	b= new student();
	b.name="Hira";
}
}