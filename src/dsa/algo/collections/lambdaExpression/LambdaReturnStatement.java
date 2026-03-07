package dsa.algo.collections.lambdaExpression;

interface Calculator{
    int operate(int a,int b);
}
public class LambdaReturnStatement {
    static void main(String[] args) {
        Calculator multiply=(a,b)->{
            int result=a*b;
            return result;
        };
        System.out.println("Multiplication "+multiply.operate(12,20));
    }
}
