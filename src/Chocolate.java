/**
        * Class Name: Chocolate
        * @Author: Jose Munoz Suastegui
        * @Version: 1.0
        * @Date: January 2023
        * Description: A program designed to answer the number of bags needed to add three chocolate bars
 */
public class Chocolate {
    public static void main(String[] args) {
        int totalNumberOfBags = 9;
        int numberOfChocolateInEachBag = 2;
        int totalNumberOfChocolateBars = totalNumberOfBags * numberOfChocolateInEachBag;
        int maximumForBag = 3;


        int bagsNeeded = totalNumberOfChocolateBars / maximumForBag;

        System.out.println("There are " + totalNumberOfBags + " bags with " + numberOfChocolateInEachBag + " " +
                "chocolate bars in each bag totaling up to " + totalNumberOfChocolateBars + " chocolate bars.");

        System.out.println("Each bag can fit up to " + maximumForBag + " chocolate bars.");

        System.out.println("If I wanted to put " + maximumForBag + " bars of chocolate of the " +
                totalNumberOfChocolateBars + " in each bag I would only need to use " + bagsNeeded + " bags.");

    }
}
