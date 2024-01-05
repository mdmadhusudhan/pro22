//to refer current class instance variable
class student{
int id;
String name;
String course;
float fee;
student(int id,String name,String course ){
this.id=id;
this.name=name;
this.course=course;
}
student(int id,String name,String course,float fee){
this(id,name,course);
this.fee=fee;
}
void display(){
System.out.println(id+"    "+name+"    "+course+"   "+fee);
}
public static void main(String args[]){
student s1=new student(22,"madhu","AI&DS");
student s2=new student(10,"raj","AI&DS",55000f);
s1.display();
s2.display();
}
}