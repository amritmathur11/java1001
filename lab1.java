
import java.util.*;
public class lab1 {

	private static final int GRADE_A = 80;
	private static final int GRADE_B = 70;
	private static final int GRADE_C = 60;
	private static final int GRADE_D = 50;

    public static void main(String[] args) {


       	Scanner sc= new Scanner(System.in);
       	System.out.println("Enter your name : ");
       	String name = sc.nextLine();

       	System.out.println("Enter your grade : ");
       	int grade = sc.nextInt();

       	System.out.println("===============================");
       	System.out.println("you have entered : "+name+", Grade : "+grade);
        System.out.println("Result");

       	if(grade>=GRADE_A){
       		System.out.println("Grade : A");
       	}else if (grade>=GRADE_B){
       		System.out.println("Grade : B");
       	}else if (grade>=GRADE_C){
       		System.out.println("Grade : C");
       	}else if (grade>=GRADE_D){
       		System.out.println("Grade : D");
       	}else{
       		System.out.println("Grade : F");
       	}

    }
}