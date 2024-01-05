//to pass as an argument in the method
class a{
void m(a obj){
System.out.println("method is invoked");
}
void n(){
m(this);              //m(obj);
}
}
class test{
public static void main(String args[]){
a b=new a();
b.n();
}
}