import java.util.*;
import java.io.*;

public class DayTwoAdvent {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DayTwo.txt"));
        int depth = 0; //depth
        int hori = 0; //horizontal
        int aim = 0;
        /*
        // Part One
        while(sc.hasNextLine())
        {
            String[] temp = sc.nextLine().split(" ");
            if(temp[0].equals("forward")) // moves forward
            {
                hori = hori + Integer.parseInt(temp[1]);
            }else if(temp[0].equals("down")) // goes down, depth increases
            {
                depth = depth + Integer.parseInt(temp[1]);
            }else if(temp[0].equals("up")) // goes up depth decreases
            {
                depth = depth - Integer.parseInt(temp[1]);
            }
        }
        */
        //Part Two
        while(sc.hasNextLine())
        {
            String[] temp = sc.nextLine().split(" ");
            if(temp[0].equals("forward")) // moves forward
            {
                hori = hori + Integer.parseInt(temp[1]);
                depth = depth + aim*Integer.parseInt(temp[1]);
            }else if(temp[0].equals("down")) // goes down, depth increases
            {
                aim = aim + Integer.parseInt(temp[1]);
            }else if(temp[0].equals("up")) // goes up depth decreases
            {
                aim = aim - Integer.parseInt(temp[1]);
            }
        }
        System.out.println(depth*hori);
    }
}
