package class1;

public class ClassStart3 {
    public static void main(){
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.grade = 90;
        Student student2 = new Student();
        student2.name = "학생2";
        student2.grade = 80;
        System.out.println("이름: "+student1.name);
    }
}
