//invoking the current constructor(calling default constructor from parametarised constructor)
class a{
a(){
System.out.println("hello a from default constructor");
}
a(int x){
this();
System.out.println(x);
}
}
class test{
public static void main(String args[]){
a b=new a(10);
}
}