package lamdas;
//import io.reactivex.rxjava3.core.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

@FunctionalInterface 
 interface BufferedReaderProcessor {
     
    String process(BufferedReader b) throws IOException; 
    
    }
 





public class DemoFile {

   static String  processFile(BufferedReader br){
    return "ssddssssddss";
   }

    

public static void main(String[] args) {
    int xp  = 90;    
    Function<BufferedReader, String>  str =   (br)->  {
        System.out.println(xp);
        //xp = 15;
        try {
            return br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    };
//xp = 10;
str.apply(new BufferedReader(new InputStreamReader(System.in)));






    
    
    
    
    //Arrays.asList(1,2,3,4,5).forEach((Integer i) -> System.out.println(i) );
    // BufferedReaderProcessor br  = (b)-> b.readLine();
    // System.out.println("Get Input");
    // try {
    //     br.process(new BufferedReader(new InputStreamReader(System.in)));
    // } catch (IOException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }

    
    //String twoLines = (BufferedReader br) -> br.readLine() + br.readLine();

     



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




        //Flowable.just("Hello world").subscribe(System.out::println);
    
}







    /** 
    new FileFilter(){ 
        public boolean accept(File file) { return file.isHidden(); } });

*/
    }    

