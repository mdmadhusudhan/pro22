import java.util.Scanner;
class test{
public static void main(String args[]){
int[] a={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
double ave;
for(int i:a){
sum+=i;
}
System.out.println(sum);
int l=a.length;
ave=(double)sum/(double)l;
System.out.println(ave);
}
}