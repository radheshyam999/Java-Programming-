package annotation;
@Course(cid = "1234",cname = "JAVA",ccost=15000)
public class Student {
    String sid;
    String sname;
    String saddr;
    public Student(String sid, String sname, String saddr){
        this.saddr = saddr;
        this.sname = sname;
        this.sid = sid;
    }
public void getStudent(){
    System.out.println("Student Details");
    System.out.println("---------------");
    System.out.println("Student Id      " + sid);
    System.out.println("Student Name  " + sname);
    System.out.println("Student course " + saddr);
}

    
}
