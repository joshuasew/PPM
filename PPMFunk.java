import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Joshua Sew-Hee on 11/21/2016.
 */

public class PPMFunk extends PPM {

    public PPMFunk() {
        super();
    }

    public void negate_red() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                r[i][j] = (Math.abs(r[i][j] - 255));
            }
        }
    }

    public void negate_green() {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                g[i][j] = (Math.abs(g[i][j] - 255));
            }
        }
    }

    public void negate_blue() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                b[i][j] = (Math.abs(b[i][j] - 255));
            }
        }
    }

    public void flip_horizontally() {
        int temp = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (width/2); j++) {
                temp = r[i][j];
                r[i][j] = r[i][width-j-1];
                r[i][width-j-1] = temp;

                temp = g[i][j];
                g[i][j] = g[i][width-j-1];
                g[i][width-j-1] = temp;

                temp = b[i][j];
                b[i][j] = b[i][width-j-1];
                b[i][width-j-1] = temp;
            }
        }
    }

    public void grey_scale() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int gray = ((r[i][j] + g[i][j] + b[i][j]) / 3);
                r[i][j] = gray;
                g[i][j] = gray;
                b[i][j] = gray;
            }
        }
    }

    public void flatten_red() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                r[i][j] = 0;
            }
        }
    }

    public void flatten_green() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                g[i][j] = 0;
            }
        }
    }

    public void flatten_blue() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                b[i][j] = 0;
            }
        }
    }

//    public void horizontal_blur() {
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//            }
//        }
//    }

    public void extreme_contrast(){
        for (int i = 0; i < height; i++){
            for (int j =0; j < width; j++){
                int midpoint = 255/2;
                if (r[i][j] > midpoint)
                {
                    r[i][j] = 255;
                }
                else{
                    r[i][j] = 0;
                }
                if (g[i][j] > midpoint){
                    g[i][j] = 255;
                }
                else{
                    g[i][j] = 0;
                }
                if (b[i][j] > midpoint){
                    b[i][j] = 255;
                }
                else{
                    b[i][j] = 0;
                }
            }
        }
    }


}
