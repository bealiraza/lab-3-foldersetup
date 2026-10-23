public class demo{
	public static void main(String args[]){
	public class main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Ali";
        s2.name = "Ahmed";

        s1.addCredits(10);
        s1.rename("Raza");

        System.out.println("s1 name: " + s1.name);
        System.out.println("s1 credits: " + s1.completedCredits);

        System.out.println("s2 name: " + s2.name);
        System.out.println("s2 credits: " + s2.completedCredits);
    }
}