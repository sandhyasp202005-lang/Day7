package dsa.algo.collections.lambdaExpression;

public class Example1 {
    static void main(String[] args) {
        Runnable r=()->{
            System.out.println("Thread is running using Lambda(->)");
        };
        Thread t=new Thread(r);
       t.start();
    }
}
