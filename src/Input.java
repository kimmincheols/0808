import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student[] array;
	private Scanner sc;
	private File file;

	public Input(Student[] array, String path) {
		this.array = array;
		this.file = new File(path);
		try { // 잘 처리가 되면 try에서 처리가 된다
			this.sc = new Scanner(this.file, "utf-8");
			// System.out.println("File Found");
		} catch (FileNotFoundException e) { // 잘 찾지 못하였다면 catch에서 처리가 된다.
			System.out.println("File Not Found");

		}
	}

	public void fileInput() {
		for (int i = 0; i < array.length; i++) {
			String line = this.sc.nextLine();
			// System.out.println(line); // 1101 한송이 78 87 83 78
			// String [] values = line.split("\\s+");
			// System.out.println(values[1]);
			Scanner myScanner = new Scanner(line);
			myScanner = myScanner.useDelimiter("\\s+");
//			myScanner.next();
//			myScanner.next();
//			int kor = myScanner.nextInt();
//			System.out.println();
			
			
			this.array[i] = new Student(myScanner.next(), myScanner.next()
					, myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt()
					, myScanner.nextInt());
			
			
		}
	}

}
