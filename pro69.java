import java.util.Scanner;
class con{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,pd=1;
i=sc.nextInt();
while(i>0){
int r=i%10;
pd=pd*r;
i=i/10;
}
	System.out.print(pd);
}
}