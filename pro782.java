class student{
int id;
String name;
student(int x,String y){
id=x;
name=y;
}
student(){}
void display(){
System.out.println(id+"    "+name);
}
public static void main(String args[]){
student s1=new student(22,"madhu");
student s2=new student();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}