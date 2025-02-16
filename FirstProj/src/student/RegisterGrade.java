package student;

public class RegisterGrade {

	public static void main(String[] args) {

		Student jon = new Student();
		jon.name = "Jon";
		jon.age = 11;
		jon.grade = "A";

		Student mark = new Student();
		mark.name = "Mark";
		mark.age = 10;
		mark.grade = "A+";
		

		Student tom = new Student();
		tom.name = "Tom";
		tom.age = 11;
		tom.grade = "B";

		mark.getName();
		mark.getAge();
		mark.getGrade();

		jon.getName();
		jon.getAge();
		jon.getGrade();

		tom.getName();
		tom.getAge();
		tom.getGrade();

	}

}
