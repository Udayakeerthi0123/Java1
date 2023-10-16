import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main {
   public static void main(String args[]) {
      Main integer = new Main();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Roman Number: ");
      String inputRoman= sc.nextLine();
      System.out.println("The Integer value of given Roman number is:"+integer.romanToInt(inputRoman));
   }
   int NumValue(char r){
      if (r == 'I')
         return 1;
      if (r == 'V')
         return 5;
      if (r == 'X')
         return 10;
      if (r == 'L')
         return 50;
      if (r == 'C')
         return 100;
      if (r == 'D')
         return 500;
      if (r == 'M')
         return 1000;
      return -1;
   } 
   int romanToInt(String value) {
      int sum = 0;
      for (int i=0; i<value.length(); i++) {
         int s1 = NumValue(value.charAt(i));
         if (i+1 <value.length()) {
            int s2 = NumValue(value.charAt(i+1));
            if (s1 >= s2) {
               sum = sum + s1;
            }
            else {
               sum = sum - s1;
            } 
         }
         else {
            sum = sum + s1;
         } 
      }
      return sum;
   } 
}