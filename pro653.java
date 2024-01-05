import java.util.Scanner;
class run{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n=sc.next();
String d=" ";
for(int i=0;i<=n.length()-1;i++){
if((n.charAt(i)>='a'&&n.charAt(i)>='z')||(n.charAt(i)>='A'&&n.charAt(i)<='Z')){

	if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u'||n.charAt(i)=='A'||n.charAt(i)=='E'
	||n.charAt(i)=='I'||n.charAt(i)=='O'||n.charAt(i)=='U'){
	continue;}
else
	d=d+n.charAt(i);
}
}
System.out.println(d);
}
}