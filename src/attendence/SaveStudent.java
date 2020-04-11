package attendence;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveStudent {
	public static void main(String[] args) throws IOException {
		Register t = new Register(true);

		Student piya = new Student("Piya", "Das", 1, 18, t);
		Student piyali = new Student("Piyali", "Dasgupta", 2, 18, t);
		Student piu = new Student("Piu", "Gupta", 3, 28, t);
		Student Riya = new Student("Riya", "Das", 4, 14, t);
		Student Ritu = new Student("Ritu", "Roy", 5, 16, t);

		File f = new File("/home/td/Desktop/Java/Attendence/src/attendence/AttendenceSheet.txt");

		FileOutputStream fos = new FileOutputStream(f);
		try {
			fos.write(piya.toString().getBytes());
			fos.write(piyali.toString().getBytes());
			fos.write(piu.toString().getBytes());
			fos.write(Riya.toString().getBytes());
			fos.write(Ritu.toString().getBytes());
		} catch (Exception ex) {

		} finally {
			fos.close();
		}
	}

}
