package five;

import java.util.Arrays;

public class fifth {
    public static void main(String[] args) {
        int arr[] = {1,1,37,55,44,43,88};
        int brr[] = {1,3,37,44,44,43,2,88};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    arr[j] = 100;
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (brr[i] == brr[j])
                    brr[j] = 100;

            }

        }
        Arrays.sort(arr);
        Arrays.sort(brr);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j] && arr[i]!=100) {
                    System.out.println(arr[i]);
                    break;
                }
            }


        }
    }
}

