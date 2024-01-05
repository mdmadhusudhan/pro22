import java.util.Scanner;
class con{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int i=1;
while(n>=i){
if(n%i==0)
{count++;}
i++;
}
if(count==2){
System.out.println(n+"  is a prime number");}
else
System.out.println(n+"  is not a prime number");}

}
}