/**
 * Class Name: Cycle
 * @Author: Jose Munoz Suastegui
 * @Version: 1.0
 * @Date: January 2023
 * Description: A program designed to answer the number of tricycles in the problem.
 */
public class Cycle {
    public static void main(String[] args){
        int bicycles = 10;
        int totalWheels = 47;
        int totalBicycleWheels = bicycles * 2;
        int totalTricycleWheels = totalWheels - totalBicycleWheels;
        int tricycles = totalTricycleWheels / 3;

        System.out.println("There are currently " + bicycles + " bicycles and X number amount of tricycles.");
        System.out.println("It was given that the total number of wheels is " + totalWheels + "." );
        System.out.println("We can find the total amount of wheels of a bicycle by multiplying the amount of"
        + " bicycles " + bicycles + " * 2 which would gives us " + totalBicycleWheels + " bicycle wheels.");
        System.out.println("After that we could find the total number of tricycle wheels" +
                " by subtracting " + totalWheels + " - " + totalBicycleWheels + " which would be " +
                totalTricycleWheels + ".");
        System.out.println("Finding the number of tricycle wheels now gives us the amount of tricycles by " +
                "dividing " + totalTricycleWheels + " / 3 which would give us " + tricycles + ".");
        System.out.println("There would be " + tricycles + " tricycles.");
    }
}
