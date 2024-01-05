import java.util.Scanner;
class mine{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n=sc.next();
String rev="";
int l=n.length()-1;
for(int i=l;i>=0;i--){
rev=rev+n.charAt(i);
}
System.out.println(rev);
}
}
