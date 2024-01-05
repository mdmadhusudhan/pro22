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
System.out.print(count);
}
}