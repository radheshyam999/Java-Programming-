package lamdas;

import java.io.File;
import java.io.FileFilter;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class DemoFile {



    

public static void main(String[] args) {
//     File[] hiddenFiles = new File(".").listFiles( (File f)->{
        
        
//         if(f.isFile()){
//                 System.out.println(f.getName());
//         }
//         return  f.isDirectory();
//     });
    
//     for (File file : hiddenFiles) {
//          System.out.println(  ((FileFilter) file).accept(new File("C:\\Users\\Admin\\Desktop\\javaTraning\\lamdas")));
            
//     }
    
// }
    
// File[] hiddenFiles = new File(".").listFiles(File::isHidden);
// for (File file : hiddenFiles) {
//     ((FileFilter) file).accept(new File("wddfnkwnfknfkwnf"));
    
    
//     System.out.println();
// }




public class HelloWorld {
    public static void main(String[] args) {
        Flowable.just("Hello world").subscribe(System.out::println);
    }
}




    /** 
    new FileFilter(){ 
        public boolean accept(File file) { return file.isHidden(); } });

*/
    }    
}
