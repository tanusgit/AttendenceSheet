package attendence;

public class Student {
String firstName;
String lastName;
int studentId;
int age;
Register register;

public Student() {
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Register getRegister() {
	return register;
}
public void setRegister(Register register) {
	this.register = register;
}
@Override
public String toString() {
	return "Student: "+ firstName + " " + lastName + ", studentId=" + studentId + ", age=" + age
			+ ", register=" + register + "]";
}
public Student(String firstName, String lastName, int studentId, int age, Register register) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.studentId = studentId;
	this.age = age;
	this.register = register;
}

}
