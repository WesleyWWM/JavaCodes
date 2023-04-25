import java.util.Scanner;

/**
 *
 * @author WesleyWEN
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
                System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        Rectangle rect = new Rectangle(length, breadth);
        double area = rect.getArea();
        double perimeter = rect.getPerimeter();

        System.out.println("Area (Square Units): " + area);
        System.out.println("Perimeter (Units): " + perimeter);

        input.close();
        
    }
}
