public class ReverseString {
    public static void main(String args[]){
    String str="Mango";
System.out.print(logic(str));
    }

public static String logic(String str){
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
     rev=rev+str.charAt(i);
    }
    return rev;
}}
