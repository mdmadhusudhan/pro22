//invoking the current method
class a{
void m(){
System.out.println("hello m");
}
void n(){
System.out.println("hello n");
m();              //this.m();
}
}
class test{
public static void main(String args[]){
a b=new a();
b.n();
}
}