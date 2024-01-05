import java.util.Scanner;
class test{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
String rev=" ";
int l=n.length()-1;
for(int i=l;i>=0;i--)
{
rev=rev+n.charAt(i);
}
if(n.equals(rev)){
System.out.println(n+"is a polindrome");}
else{
System.out.println(n+"is not a polindrome");}
}
}