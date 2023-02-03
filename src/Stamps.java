/**
 * Class Name: Stamps
 * @Author: Jose Munoz Suastegui
 * @Version: 1.0
 * @Date: January 2023
 * Description: A program designed to answer the difference between Jean and Susan's stamps.
 */
public class Stamps {
    public static void main(String [] args){
         int susan = 8;
         int jean = 40;

         int difference = jean - susan;


         System.out.println("Susan and Jean just started collecting stamps as a hobby. Susan currently has "
                 + susan + " stamps, while Jean has only " + jean + " stamps.");

         System.out.println("How many more does Jean have than Susan?");

         System.out.println("The answer to this will be: " + difference );
    }
}
