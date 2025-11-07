import java.util.*;

class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}
public class RectangleTest {
    public static void main(String[] args) throws InvalidDimensionException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        if (length <= 0 || breadth <= 0) {
            throw new InvalidDimensionException("Length and breadth must be positive numbers.");
        }
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);

        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
    
}
