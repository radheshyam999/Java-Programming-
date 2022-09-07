package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test2 {

    
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        

        Student s = new Student("12345", "radhey", "hyd");
        s.getStudent();
        
        Class c  = s.getClass();
        Method m  =  c.getMethod("getStudent");
        Annotation ann = c.getAnnotation(Course.class);
        Course crs = (Course) ann;

        System.out.println("Student Course Details ");
        System.out.println("-------------------------");
        System.out.println("Name Of The course  " + crs.cname());
        System.out.println("Price Of The course  " + crs.ccost());
        System.out.println("Id Of The course  " + crs.cid());
    
    
    }
    
}
