package three;

public class third {
    static void occur(String str,int len,char c){
        System.out.print(Character.toString(str.charAt(0))+" ");
        String s = str.replace(Character.toString(str.charAt(0)),"");
        System.out.println(str.length() - s.length());
        if(s.length()==0) {
            return;
        }else
            occur(s, s.length(), s.charAt(0));
    }

    public static void main(String[] args) {
        String str = "india is a good country";
        int len= str.length();
        occur(str,len,str.charAt(0));

    }

}

