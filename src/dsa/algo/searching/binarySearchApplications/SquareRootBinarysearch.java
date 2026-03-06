package dsa.algo.searching.binarySearchApplications;

public class SquareRootBinarysearch {
    public static int sqrt_bs(int n){
        int s=0;
        int e=n;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int square=mid*mid;
            if(square==n){
                return mid;
            }else if(square>n){
              e=mid-1;  //Go to the left hand side
            }else{
                //Store the probable answer & move to the right
                ans=mid;        //the mid-value is stored in the answer
                s=mid+1;        //We move to the right to find accurate  ans
            }
        }
        return ans;
    }

    static void main(String[] args) {
        System.out.println(sqrt_bs(35));
        System.out.println(sqrt_bs(36));
        System.out.println(sqrt_bs(37));
        System.out.println(sqrt_bs(3));
    }

}
