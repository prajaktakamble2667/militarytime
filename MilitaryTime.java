import java.io.*;
public class MilitaryTime
{
static void clock(String str)
{
int h1 = (int)str.charAt(1) - '0';
int h2 = (int)str.charAt(0) - '0';
int hh = (h2 * 10 + h1 % 10);
    if (str.charAt(8) == 'B'){
        if (hh == 12){
            System.out.print("00");
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
        else{
            for (int i = 0; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
    }else{
        if (hh == 12){
            System.out.print("12");
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }else
        {
            hh = hh + 12;
            System.out.print(hh);
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
    }
} 
 public static void main (String[] args){
    String str = "02:20:30PM";
    clock(str);
}
}
 

