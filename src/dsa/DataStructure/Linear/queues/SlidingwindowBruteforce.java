package dsa.DataStructure.Linear.queues;

public class SlidingwindowBruteforce {
    static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        for (int i = 0; i <=arr.length-k ; i++) {     //0 to 8-3=5
            int max=arr[i];
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.print(max+" ");

        }
    }
}
