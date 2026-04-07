import java.util.Scanner;
interface Classify {
    String getDivision(double average);
}
class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }
}
public class Practical27 {
    public static void main(String[] args) {
	System.out.println("KRISHA : 250393107009");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        Result r = new Result();
        String division = r.getDivision(avg);

        System.out.println("Division: " + division);

        sc.close();
    }
}