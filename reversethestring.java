import java.util.*;
class reverse{
    public static void main(String[] args){
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String key="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            key+=str.charAt(i);
        }
        System.out.println("reversed string is : " +key);
    }
}
