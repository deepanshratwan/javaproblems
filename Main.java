import java.util.*;
public class Main {
    public static int maxSum(int[]arr,int k,int n){
        if(k>n){
            System.out.println("invalid!");
            return -1;//if k is greater than n then it is invalid
        }
        int maxSum =Integer.MIN_VALUE;// to get the minimum value
//the range of i taken to get consecutive sum of the array like here n is 4 k is 2 we want to get i  move from  0 to 1 so n-k is good
         for (int i = 0; i < n-k+1; i++) {
             int sum=0;// it can store the sum
             for (int j = 0; j < k; j++) {//to move j from 0 to 1
                 sum+=arr[i+j];//the value changes w.r.t i


            }
            maxSum=Math.max(maxSum,sum);//to change the max value after the execution

        }


        return maxSum;
//this return value


    }
    public static void main(String[] args) {

    int[] arr ={100,200,300,400,500};
    int k=2;
    int n=arr.length;
        System.out.println(maxSum(arr,k,n));



        }
    }
