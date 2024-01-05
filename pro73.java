import java.util.Scanner;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x,n,i=0,f=0;
System.out.println("enter the size of an arry:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements into array:");
for(i=0;i<n;i++){
	a[i]=sc.nextInt();
}
System.out.println("enter the element to find:");
x=sc.nextInt();
for(i=0;i<n;i++){
	if(a[i]==x){
	f=1;
break;
	}
}
if(f==1)
System.out.println("element is found at position:"+(i+1));
else
System.out.println("element is not found");
}
}