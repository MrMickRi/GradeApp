import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		String grade;
		String result = "0";

		Scanner scan = new Scanner(System.in);
		System.out.println("What grade did you get ?\nA , B , C or D");
		grade = scan.nextLine();
		grade = grade.toUpperCase();

		switch(grade){
			case "A" : result = "85-100" ; break;
			case "B" : result = "70-84" ; break;
			case "C" : result = "55-69" ; break;
			case "D" : result = "40-54" ; break;
			default : System.out.println("you failed"); ; break;
		}
		System.out.println(result);
	}

}
