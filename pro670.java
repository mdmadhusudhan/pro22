import java.util.Scanner;
class con{
public static void demo(int a){
int count=0;
for(int k=1;k<=a;k++){
 			if(a%k==0){
    				count++;
  			 	if(count==2){
 				if(k==a){System.out.print(a+" ");}
				}
			}
		}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
while(n>=i){
	if(n%i==0){
 	 con.demo(i);
	}
	i++;
  }
}
}