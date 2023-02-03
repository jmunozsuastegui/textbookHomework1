/**
 * Class Name: Circle
 * @Author: Jose Munoz Suastegui
 * @Version: 1.0
 * @Date: January 2023
 * Description: A program designed to display the area and perimeter of a circle that has a radius of 9.5 using the
 * the formula provided.
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
