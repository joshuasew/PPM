import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Joshua Sew-Hee on 11/21/2016.
 */

public class Sample
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String one,two, three, four, five, six, seven, eight;

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
        System.out.println("");

        System.out.print("Do you want [1]? (y/n) ");
        one = "";
        while (!(one.equals("y") || one.equals("n"))) {
            one = sc.nextLine();
        }

        if(one.equals("y")){
            image.grey_scale();
        }

        System.out.print("Do you want [2]? (y/n) ");

        two = "";
        while (!(two.equals("y") || two.equals("n"))) {
            two = sc.nextLine();
        }

        if(two.equals("y")){
            image.flip_horizontally();
        }

        System.out.print("Do you want [3]? (y/n) ");
        three = "";
        while (!(three.equals("y") || three.equals("n"))) {
            three = sc.nextLine();
        }

        if(three.equals("y")){
            image.negate_red();
        }

        System.out.print("Do you want [4]? (y/n) ");
        four = "";
        while (!(four.equals("y") || four.equals("n"))) {
            four = sc.nextLine();
        }

        if(four.equals("y")){
            image.negate_green();
        }

        System.out.print("Do you want [5]? (y/n) ");
        five = "";
        while (!(five.equals("y") || five.equals("n"))) {
            five = sc.nextLine();
        }

        if(five.equals("y")){
            image.negate_blue();
        }

        System.out.print("Do you want [6]? (y/n) ");
        six = "";
        while (!(six.equals("y") || six.equals("n"))) {
            six = sc.nextLine();
        }

        if(six.equals("y")){
            image.flatten_red();
        }

        System.out.print("Do you want [7]? (y/n) ");
        seven = "";
        while (!(seven.equals("y") || seven.equals("n"))) {
            seven = sc.nextLine();
        }

        if(seven.equals("y")){
            image.flatten_green();
        }

        System.out.print("Do you want [8]? (y/n) ");
        eight = "";
        while (!(eight.equals("y") || eight.equals("n"))) {
            eight = sc.nextLine();
        }

        if(eight.equals("y")){
            image.flatten_blue();
        }

        System.out.println();
        System.out.println(output_file+" created") ;

        image.save(output_file);
    }
}
