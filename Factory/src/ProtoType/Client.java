package ProtoType;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("abc",15,212323);
        System.out.println(student);
        Student cloneObj = (Student) student.clone();
        System.out.println(cloneObj);
    }
}
