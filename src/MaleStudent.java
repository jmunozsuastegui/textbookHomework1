/**
 * Class Name: Male Student
 * @Author: Jose Munoz Suastegui
 * @Version: 1.0
 * @Date: January 2023
 * Description: A program designed to answer the number of male students in a middle school.
 */
public class MaleStudent {
    public static void main(String[] args){

        int middleSchool = 389;
        int femaleStudents = 175;

        int maleStudents = middleSchool - femaleStudents;

        System.out.println("Population size of middle school: " + middleSchool );
        System.out.println("Female population size at middle school: " + femaleStudents );
        System.out.println("Male population size at middle school: " + maleStudents);
    }
}
