import java.util.Scanner;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x,n,i=0,j=0,f=0;
System.out.println("enter the size of an arry:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements into array:");
for(i=0;i<n;i++){
	a[i]=sc.nextInt();
}
System.out.println("shorting of an array:");
for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		int t=0;
                if(a[i]>a[j]){
		t=a[i];
		a[i]=a[j];
		a[j]=t;
		}
}    
}
for(int m:a)
System.out.print(m);
}
}