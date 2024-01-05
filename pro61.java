import java.util.Scanner;
class mine{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ram;
int sum=0;
while(n>0){
ram=n%10;
sum=sum+ram;
n=n/10;
}
System.out.println(sum);
}
}
