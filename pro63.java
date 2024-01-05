import java.util.Scanner;
class mine{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int rd=0;
int n=a;
while(n>0){
rd=rd*10+n%10;
n=n/10;
}
if(rd==a)
System.out.println(a+"is a polindrome");
else
System.out.println(a+"is not a polindrome");
}
}
