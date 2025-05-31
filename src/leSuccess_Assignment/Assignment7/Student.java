package leSuccess_Assignment.Assignment7;

public class Student {
    int rollNo;
    String name;
    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    Student(int rollNo){
        this.rollNo=rollNo;
        this.name="Unknown";
    }
    public void display(){
        System.out.println("RollNo "+ rollNo + " Name " +name);
    }
    public static void main(String[] args) {
        Student obj=new Student(16,"Bharath");
        Student obj2=new Student(12);
        obj.display();
        obj2.display();
    }
}
