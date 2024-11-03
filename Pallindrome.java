import java.util.*;
class pallindrome
{
public static void main(String args[])
{
System.out.println("enter the string");
Scanner SC=new Scanner(System.in);
String str1=SC.nextLine();
int flag=0;
int len=str1.length();
for(int i=0;i<=len/2;i++)
{
if(str1.charAt(i)!=str1.charAt(len-1-i))
{
flag=1;
}
}
if(flag==1)
{
System.out.println("it is not a pallindrome");
}
else
System.out.println("it is pallindrome");
}
}
