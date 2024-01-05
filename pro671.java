import java.util.Scanner;
class con{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,j=0;
for(i=0;i<3;i++){
System.out.println();
	for(j=0;j<5;j++){
	if(j%2==1)break;
	System.out.print("i="+i+"j="+j+" ");
	}
}
}
}