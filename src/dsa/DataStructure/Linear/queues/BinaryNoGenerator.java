package dsa.DataStructure.Linear.queues;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNoGenerator {
    public static void generateBinaryNos1toN(int N){
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        while(N-- >0){
            String curr=q.poll();
            System.out.print(curr+ " ");     //Print the latest
            q.offer(curr + "0");  //Concatenate 0& push to queue
            q.offer(curr + "1");  //Concatenate 1 & push to queue
        }
        System.out.println();
    }

    static void main(String[] args) {
        int N=5;
        generateBinaryNos1toN(N);
        generateBinaryNos1toN(6);
    }
}
