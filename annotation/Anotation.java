package annotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
public class Anotation {
    /* 
    Annotations  are not Inheriteable by deafault
    Annotations  are not documentable by deafault 
     
*/



    @Override
    @SuppressWarnings("unchcked")
    @Deprecated
    @FunctionalInterface
    //metaannotation
    /***
     * java.lang.annotation.Annotation
     * 
     * 
     * 
     */
    
    @Inherited   //we use this annotation to provide feature to annotation to get inherated 
    
    @Retention
    @Documented  // we can use this annotation to provide spcial faeture to annotation to get documented 

    @Target   // 

/** 
    Customized  annotation
        1) Define user defined annotation
        2) utlize user defined annotation in java application
        3) Access Data from user defined annotation
         




*/
    







    
}
