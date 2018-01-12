/**
 * Created by de_ivanov on 12.01.2018.
 */
import javax.swing.*;
import java.io.File;
import java.util.*;


/**
 * Created by de_ivanov on 12.01.2018.
 */
public class Sort2 {
    static String[] m = new String[6];
    static int[] numb = new int[6];
    static Scanner scn;
    public static void main(String args[]) {
        openFile();
        readFile();
        out();
    }

    private static void openFile() {
        try {
            scn = new Scanner(new File("test//1.txt"));
            // Scanner s = new Scanner(input).useDelimiter(",");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File not found");
        }
    }

    private static void readFile() {


        while (scn.hasNext()) {
            for (int num = 0; num < 6; num++) {
                m[num] = scn.next();
                numb[num] = Integer.parseInt(m[num]);
            }
        }

        Arrays.sort(numb);
    }


    private static void out() {
        //for (int i=5; i >= 0; i --) System.out.print(numb[i]+ " ");
        for (int i=0; i < 6; i ++) System.out.print(numb[i]+ " ");
    }
}