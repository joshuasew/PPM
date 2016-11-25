import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Joshua Sew-Hee on 11/21/2016.
 */
public class PPM {

    // create an array of Pixels
    int[][] r;
    int[][] g;
    int[][] b;
    String magic;

    int width, height, depth;

    // default constructor
    public PPM()
    {
        magic = "P3";
        width = 0;
        height = 0;
        depth = 0;
        r = new int [0][0];
        g = new int[0][0];
        b = new int[0][0];
    }

    public void read(String file_name) {
        File f = new File(file_name);
        Scanner sc = null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        magic = sc.nextLine();
        width = sc.nextInt();
        height = sc.nextInt();
        depth = sc.nextInt();

        r = new int [height][width];
        g = new int [height][width];
        b = new int [height][width];

        for (int i = 0; i < height; i++) {
            try {
                for (int j = 0; j < width; j++) {
                    r[i][j] = sc.nextInt();
                    g[i][j] = sc.nextInt();
                    b[i][j] = sc.nextInt();
                }
            } catch (Exception e){
                System.out.println("Index out of bounds." + e);
            }
        }
    }


    // Accessors
    public  String getMagic(){
        return magic;
    }
    public  int getWidth(){

        return width;
    }
    public  int getHeight(){

        return height;
    }
    public int getDepth(){

        return depth;
    }

    //Modifiers
    public void setMagic(String m){

        this.magic = m;
    }
    public void setWidth(int w){

        this.width = w;
    }
    public void setHeight(int h){

        this.height = h;
    }
    public void setDepth(int d){

        this.depth = d;
    }

    public void save(String x) throws FileNotFoundException
    {
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(x);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        writer.println(magic);
        writer.println(width + " " + height);
        writer.println(depth);
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                writer.print(String.format("%4d", r[i][j]));
                writer.print(String.format("%4d", g[i][j]));
                writer.print(String.format("%4d  ", b[i][j]));
            }
            writer.println();
        }
        writer.close();
    }
}
