//to refer current class instance variable
class student{
int id;
String name;
float fee;
student(int id,String name, float fee){
this.id=id;
this.name=name;
this.fee=fee;
}
student(){}
void display(){
System.out.println(id+"    "+name+"    "+fee);
}
public static void main(String args[]){
student s1=new student(22,"madhu",60000f);
student s2=new student(10,"raj",55000f);

s1.display();
s2.display();
}
}