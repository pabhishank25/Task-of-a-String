import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       s=s.toLowerCase();
       s=s.replaceAll("[aeiou]","");
       
       s=s.replaceAll("",".");
       //System.out.println(s);
       StringBuffer s1=new StringBuffer(s);
       s1.deleteCharAt(s1.length()-1);
       System.out.println(s1);
    }
}
