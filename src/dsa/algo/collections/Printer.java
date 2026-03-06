package dsa.algo.collections;

public class Printer<T> {
T data;
Printer(T data){
    this.data=data;
}
void printValue(){
    System.out.println("Data: "+data);
}

    static void main(String[] args) {
        Printer<Integer> integerprinter=new Printer<>(1);
        Printer<String> stringprinter=new Printer<>("Java");
        Printer<Boolean> booleanprinter=new Printer<>(true);
        Printer<Float> floatprinter=new Printer<>(1.2f);
        Printer<Double> doubleprinter=new Printer<>(1.2);
        integerprinter.printValue();
        stringprinter.printValue();
        booleanprinter.printValue();
        floatprinter.printValue();
        doubleprinter.printValue();
    }
}
