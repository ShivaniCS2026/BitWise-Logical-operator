import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int andresult = a & b;
      System.out.println("Bitwise AND result: " + (andresult));
      int orResult = a | b;
      System.out.println("Bitwise OR result: "+ (orResult));
      int xorResult = a ^ b;
      System.out.println("Bitwise XOR result: "+ (xorResult));
    }
}
