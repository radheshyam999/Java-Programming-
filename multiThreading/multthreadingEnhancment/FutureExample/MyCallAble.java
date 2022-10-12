package multiThreading.multthreadingEnhancment.FutureExample;

import java.util.concurrent.Callable;

public class MyCallAble implements Callable {
    int n;
    MyCallAble(int n){
        this.n = n;
    }
    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName() + " ::: "+"is responsibale to find sum of first n numbers");
        int sum  = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    
    
}
