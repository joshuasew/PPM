import java.io.FileNotFoundException;
import java.lang.NullPointerException;
import java.util.*;

/**
 * Created by Joshua Sew-Hee on 11/21/2016.
 */

public class Sample
{
    public static void main(String[] args) throws FileNotFoundException, NullPointerException
    {
        String one,two, three, four, five, six, seven, eight, nine;

        System.out.println("Portable Pixmap (PPM) Image Editor");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the image file name: ");
        String input_file = sc.nextLine();
        System.out.print("Enter the output file name: ");
        String output_file = sc.nextLine();

        PPMFunk image = new PPMFunk();

        image.read(input_file);

        System.out.println("");

        System.out.println("Here are your choices:");
        System.out.println("[1]  convert to greyscale [2]  flip horizontally");
        System.out.println("[3]  negative of red [4]  negative of green [5]  negative of blue");
        System.out.println("[6]  just the reds   [7]  just the greens   [8]  just the blues");
        System.out.println("[9]  extreme contrast");
        System.out.println("");

        System.out.print("Do you want [1]? (y/n) ");
        one = sc.nextLine();
        while (!(one.equals("y") || one.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            one = sc.nextLine();
        }

        if(one.equals("y")){
            image.grey_scale();
        }

        System.out.print("Do you want [2]? (y/n) ");

        two = sc.nextLine();
        while (!(two.equals("y") || two.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            two = sc.nextLine();
        }

        if(two.equals("y")){
            image.flip_horizontally();
        }

        System.out.print("Do you want [3]? (y/n) ");
        three = sc.nextLine();
        while (!(three.equals("y") || three.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            three = sc.nextLine();
        }

        if(three.equals("y")){
            image.negate_red();
        }

        System.out.print("Do you want [4]? (y/n) ");
        four = sc.nextLine();
        while (!(four.equals("y") || four.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            four = sc.nextLine();
        }

        if(four.equals("y")){
            image.negate_green();
        }

        System.out.print("Do you want [5]? (y/n) ");
        five = sc.nextLine();
        while (!(five.equals("y") || five.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            five = sc.nextLine();
        }

        if(five.equals("y")){
            image.negate_blue();
        }

        System.out.print("Do you want [6]? (y/n) ");
        six = sc.nextLine();
        while (!(six.equals("y") || six.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            six = sc.nextLine();
        }

        if(six.equals("y")){
            image.flatten_red();
        }

        System.out.print("Do you want [7]? (y/n) ");
        seven = sc.nextLine();
        while (!(seven.equals("y") || seven.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            seven = sc.nextLine();
        }

        if(seven.equals("y")){
            image.flatten_green();
        }

        System.out.print("Do you want [8]? (y/n) ");
        eight = sc.nextLine();
        while (!(eight.equals("y") || eight.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            eight = sc.nextLine();
        }

        if(eight.equals("y")){
            image.flatten_blue();
        }

        System.out.print("Do you want [9]? (y/n) ");
        nine = sc.nextLine();
        while (!(nine.equals("y") || nine.equals("n"))) {
            System.out.print("Invalid input. Please enter \"y\" or \"n\": ");
            nine = sc.nextLine();
        }

        if(nine.equals("y")){
            image.extreme_contrast();
        }

        System.out.println();
        System.out.println(output_file+" created") ;

        image.save(output_file);
    }
}
