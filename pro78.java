class student{
int id;
String name;
student(int x,String y){
id=x;
name=y;
}
void display(){
System.out.println(id+"    "+name);
}
public static void main(String args[]){
student s1=new student(22,"madhu");
student s2=new student(27,"deepu");
s1.display();
s2.display();
}
}