import java.util.*;
public class Taskfour {
    public static String remove(String s){

        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='0'){
               sb.replace(0, i, "");
             }
            else{
                break;
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
       

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        remove(st);
        sc.close();
    }
}
