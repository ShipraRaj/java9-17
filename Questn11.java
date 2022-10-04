record Student(String name,int id,int age) {
	static int counter = 0;
	public Student(String name,int id,int age) {
		this.name = name;
		this.id = id;
		this.age = age;
		counter++;
	}
}
public class RecordImmutable {

	public static void main(String[] args) {
		Student std1 = new Student("Ravi",101,22);
		Student std2 = new Student("Rashi",102,22);
		System.out.println(std1);
		System.out.println(std1.name());
		System.out.println(std1.age());
		System.out.println(std1.id());
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std1.equals(std2));
		System.out.println(Student.counter);
	

	}

}
