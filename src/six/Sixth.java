package six;

import java.util.*;

public class Sixth {

    public static void distinct(int arr[],int len)
    {
        int result=arr[0];
        for(int i=1;i<len;i++)
        {

            result=result^arr[i];
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5,5};
        int n=arr.length;
        distinct(arr,n);
    }
}