package two;

public class second {
    public static void main(String[] args) {
        String str="failure failure is the next step to the success";
        String[] str_arr=str.split(" ");
        for(int i=0;i<str_arr.length;i++){
            int count=1;
            for(int j=i+1;j<str_arr.length;j++){
                if(str_arr[i].equals(str_arr[j])){
                    count++;
                    str_arr[j]=" ";
                }
            }
            if((str_arr[i]!=" ")&&(count>1))
                System.out.println(str_arr[i]+" | "+count);
        }
    }
    }

