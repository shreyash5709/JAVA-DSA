public class Student{
    String name;
    // private int rno;
    int rno;
    double percentage = 10.5;
    final String schoolName = "RDIC";

    // cunstructor
    public Student(){

    }
    public Student(String name, int rno, double percentage){
        this.name =  name;
        this.rno = rno;
        this.percentage = percentage;
    }

    // getter method
    public int getRno(){
        return rno;
    }

    //  setter method
    public void setRno(int rno){
        this.rno = rno;
    }
}