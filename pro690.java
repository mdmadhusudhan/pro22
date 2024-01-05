import java.util.Scanner;
class con{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
while(n>=i){
if(n%i==0){
if(i==n){System.out.print(i);}
else
System.out.print(i+",");
}
i++;
}
}
}