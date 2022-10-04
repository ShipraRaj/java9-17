sealed class Person permits Doctor,Teacher{
	void display() {
		System.out.println("Person is a sealed class.");
	}
}
final class Doctor extends Person{
	
}
sealed class Teacher extends Person permits MathsTeacher{
	
}
non-sealed class MathsTeacher extends Teacher{
	void display() {
		System.out.println("Maths teachers are great");
	}
}
public class SealedClass {
	public static void main(String[] args) {
		MathsTeacher mathsteach = new MathsTeacher();
		mathsteach.display();	
	}

}