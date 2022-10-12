public class ArrayLeanring {
    byte arr1[] = new byte[5];
        short arr2[] = new short[5];
        char[] arr3 = new char[5];
        int [] arr4 = new int[5];
        long [] arr5 = new long[5];
        float arr6[] = new float[5];
        double arr7[] = new double[5];
        boolean arr8[] = new boolean[5];
    void printNameOfClass(){
        System.out.println(arr1.getClass().getName());
        System.out.println(arr2.getClass().getName());
        System.out.println(arr3.getClass().getName());
        System.out.println(arr4.getClass().getName());
        System.out.println(arr5.getClass().getName());
        System.out.println(arr6.getClass().getName());
        System.out.println(arr7.getClass().getName());
        System.out.println(arr8.getClass().getName());
    }
    
    
        public static void main(String[] args) {
            ArrayLeanring ob = new ArrayLeanring();
            ob.printNameOfClass();



    }
    
}
