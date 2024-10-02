import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first coordinate point (x1,y1): ");
        String firstPoint = scanner.nextLine();
        double x1 = Double.parseDouble(firstPoint.substring(1, firstPoint.indexOf(',')));
        double y1 = Double.parseDouble(firstPoint.substring(firstPoint.indexOf(',') + 1, firstPoint.length() - 1));

        System.out.print("Enter the second coordinate point (x2,y2): ");
        String secondPoint = scanner.nextLine();
        double x2 = Double.parseDouble(secondPoint.substring(1, secondPoint.indexOf(',')));
        double y2 = Double.parseDouble(secondPoint.substring(secondPoint.indexOf(',') + 1, secondPoint.length() - 1));

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation);




    }
}