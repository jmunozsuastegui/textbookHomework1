/**
 * Class Name: SpeedLight
 * @Author: Jose Munoz Suastegui
 * @Version: 1.0
 * @Date: January 2023
 * Description: A program designed to calculate the speed of light
 */
public class SpeedLight {
    public static void main(String[] args){
        int SPEED_OF_SOUND = 340;

        int timeElapsed = 5;
        int distance = SPEED_OF_SOUND * timeElapsed;

        System.out.println("Speed of sound: " + SPEED_OF_SOUND);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance: " + distance + " meters.");

    }
}
