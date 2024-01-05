class student{
int id;
String name;
int age;
student(int x,String y){
id=x;
name=y;
}
student(int x,String y,int a){
id=x;
name=y;
age=a;
}

void display(){
System.out.println(id+"    "+name+"  "+age);
}
public static void main(String args[]){
student s1=new student(22,"madhu",20);
student s2=new student(27,"deepu");
s1.display();
s2.display();
}
}