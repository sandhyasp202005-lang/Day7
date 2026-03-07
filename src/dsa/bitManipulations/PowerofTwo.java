package dsa.bitManipulations;

import java.util.Scanner;

public class PowerofTwo {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        //Bitwise and
        if((n&(n-1))==0){
            System.out.println(n+" POWER of 2");
        }else{
            System.out.println(n+" NOT POWER of 2");
        }
    }
}
