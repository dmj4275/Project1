package Chapter1;

/**
 * Program that calculates the perimeter and area of a circle
 *
 * @author Dylan Jamison
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 2 * radius * 3.14;
        double area = radius * radius * 3.14;
        System.out.println(perimeter);
        System.out.println(area);
    }

}
