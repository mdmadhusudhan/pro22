import java.util.Scanner;
class mine{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rd=0;
while(n>0){
rd=rd*10+n%10;
n=n/10;
}
System.out.println(rd);
}
}
