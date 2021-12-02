import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
public class DayOneAdvent
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DayOne.txt"));
        int curr = 0;
        int prev = 0;
        int count = 0;
        //Part One
        /*
        while(sc.hasNextLine())
        {
            curr = Integer.parseInt(sc.nextLine());
            if(curr > prev && prev!=0)
            {
                count++;
                prev = curr;
            }else
            {
                prev = curr;
            }
        }
        System.out.println(count);
        */
        //Part Two
        int counter = 0;
        int prevSum = 0;
        int time = 0;
        ArrayList<Integer> holder = new ArrayList<Integer>();
        while(sc.hasNextLine())
        {
           holder.add(Integer.parseInt(sc.nextLine())); //Holds All the input
        }
        for(int i = 0; i < holder.size()-2; i++) //Loops through every number but last two
        {
            int currSum = holder.get(i) + holder.get(i+1) + holder.get(i+2);
            if(currSum > prevSum && prevSum!=0)
            {
                prevSum = currSum;
                counter++;
            }else{
                prevSum = currSum;
            }
        }
        System.out.println(counter);
    }
}