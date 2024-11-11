import java.util.StringTokenizer;
import java.util.*;
public class Main{
  public static void main(String[] args){
    int n;
    int sum=0;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the integers with space between them :");
    String s = sc.nextLine();
    
    StringTokenizer st = new StringTokenizer(s," ");
    while(st.hasMoreTokens()){
      String temp = st.nextToken();
      n=Integer.parseInt(temp);
      System.out.println(n);
      sum=sum+n;
    }
      System.out.println("sum of the integer is "+sum);
  }
}
