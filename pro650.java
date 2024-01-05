import java.util.*;
class armstrong{
public static int lenDigit(int n){
int len=0;
while(n>0){len++;n=n/10;}
return len;
}
public static boolean arm(final int a)
{
int sum=0;
int exp=lenDigit(a);
int num=a;
while(num>0){
sum+=(int)Math.pow((num%10),exp);
num=num/10;
}
return a==sum;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=1000;
for(n=1000;n<=9999;n++){
if(arm(n)){System.out.println(n);}
}
}
}