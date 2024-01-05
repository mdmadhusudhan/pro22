import java.util.Scanner;
class run{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n=sc.next();
String d=" ";
for(int i=0;i<=n.length()-1;i++){
if(n.charAt(i)=='0'||n.charAt(i)=='1'||n.charAt(i)=='2'||n.charAt(i)=='3'||n.charAt(i)=='4'||n.charAt(i)=='5'||n.charAt(i)=='6'
||n.charAt(i)=='7'||n.charAt(i)=='8'||n.charAt(i)=='9')
d=d+n.charAt(i);
}
System.out.println(d);
}
}
