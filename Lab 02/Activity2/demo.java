public class demo{
	public static void main(String args[]){

	student s1=new student();
	student s2=new student();

	s1.id=13;
	s1.name="Raza";
	s1.completedCredits=23;

	s2.id=18;
	s2.name="Anas";
	s2.completedCredits=26;

	
	//changing s1 values
	s1.name="Rabia";
	s1.completedCredits=34;
	
	s1.printsummary();
	s2.printsummary();
}


}