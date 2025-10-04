public class StudentClass {
    // public static class Student{
    //     String name;
    //     int rollno;
    //     double percentage;
    // }
    public static void main(String[] args) {
        Student s = new Student(); // ye vs code ka error hai esse koi dikkat ni hai
        s.name = "Shreyash";
        s.percentage = 15.1;
        System.out.println(s.name);
        System.out.println(s.percentage);

        // s.rno = 10;
        // pehle setter method se set krna hoga fir getter method se access
        s.setRno(10);
        System.out.println(s.getRno());

        // using cunstructor
        Student s1 = new Student("Shreyash_Jaiswal", 109, 72.4);
        System.out.println(s1.name +" "+ s1.rno +" "+ s1.percentage);

        // final keyword
        // s.schoolName = "GIC"; generating error final attributes can't modified
        System.out.println(s.schoolName);
    }
}
