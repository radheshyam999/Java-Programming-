package lf;

import java.util.Vector;

/**this is simple programe for java**/
interface A{
	int x = 0;
 default void m1(){
	
	System.out.println("i m method from interface " +  this.hashCode());
 }
} 

class Hello implements A{

	//final static  int x;
	//var y  =  0;
	static{
		//x =0;
		//System.loadLibrary("C:\\Python310\\python.exe");
	
	}
	
public void m2(){
	m1();
}
	@Override
	public void m1() {
		//System.out.println("dnkaskldnslkfdnskldfnskl");
		//
		if(super.hashCode() == this.hashCode()){
			System.out.println(A.x+"we are equal" + this.hashCode());
			//A.x = 8;
		}else{
			System.out.println("Base calss Object"+super.hashCode());
			System.out.println("Current class Object:"+this.hashCode());
		}
		A.super.m1();
	}

	static String[] yShapedPattern(int N) {
        // code here
		/* 
				if(j  == i){
                System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            	
				if(j == N-i){
*/
					
  /*              System.out.print("* ");
                }else{
                    System.out.print(" ");
                } */
			

			for(int j = 0; j <= (N); j++){
				System.out.print("* ");
			}
			System.out.println();
		
						
        Vector<String> v = new Vector<String>();
        StringBuilder sb  = new StringBuilder();
		for(int i = 0; i < N; i++){
            sb.delete(0, sb.length());
			for(int j = 0; j <= N; j++){
            
				 

		if(i <= N/2){
			System.out.print((j  == i)? "* ": " ");
			System.out.print((j  == N-i)? "*": " ");

			//sb.append((j  == i)? "* ": j);
			//sb.append((j  == N-i)? "*": j);	
            }else if(j == (N/2)+4){
				System.out.print(" *");
				//sb.append(" *");	
				}else{
					//sb.append("2");
					System.out.print(" ");
				}

			    
        }
		v.add(sb.toString());
		System.out.println();
		}
		
		String []s = new String[v.size()];
		for (int i = 0; i < v.size(); i++) {
			s[i] = v.get(0);	
		}
    return s;    
    }


	public static void main(String args[]){
		String s[] = yShapedPattern(8);
		System.out.println("__________________________________________________");
		
		for (String string : s) {
			System.out.println(string);
		}
		
		
		//new Hello().m1();
		/** 
		boolean b =  true;
		boolean s = false;
		System.out.println(s^b); 
		System.out.println("Byte"+Byte.SIZE);
		System.out.println("Short "+ Short.SIZE);
		System.out.println("Integer " + Integer.SIZE);
		System.out.println("Float " + Float.SIZE);
		System.out.println("Double " + Double.SIZE);
		System.out.println("Character " + Character.SIZE);
	
	
		System.out.println("this is simple programe for java");
		*/
		//System.out.println(x);
		//var y = new Thread();
		//System.out.println(y.currentThread().getThreadGroup().getParent());
		
	



	}
	
}