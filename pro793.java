//invoking the current constructor(calling  parametarised constructor from default constructor)
class a{
a(){
this(5);
System.out.println("hello a from default constructor");
}
a(int x){
System.out.println(x);
}
}
class test{
public static void main(String args[]){
a b=new a();
}
}