package annotation;
import java.lang.annotation.*;
@inherated
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)



@interface Course {
   String cid() default "c-789";
   String cname() default "C programming lunguage";
   int ccost() default 3000; 

}
