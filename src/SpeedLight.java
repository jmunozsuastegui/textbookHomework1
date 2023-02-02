/**
 * Class Name: SpeedLight
 * @Author: Jose Munoz Suastegui
 * @Version: 1.0
 * @Date: January 2023
 * Description: A program designed to calculate the speed of light
 */



public class SpeedLight {
    public static void main(String []args){
        int[] numbers = {3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++)
        {
            if ( i == 2 )
            {
                System.out.print(numbers[i]);
            }
            else if ( i == 3 )
            {
                System.out.print(numbers[i-3]);
                System.out.print(numbers[i-1]);
                System.out.print(numbers[i]);
            }
            else if ( i == 4 )
            {
                System.out.print(numbers[i-4]);
                System.out.print(numbers[i-2]);
                System.out.print(numbers[i]);
            }
        } //edited

    }
}
