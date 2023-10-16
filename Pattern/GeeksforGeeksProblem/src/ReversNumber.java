import java.util.Enumeration;

public class ReversNumber {
    public static void main(String[] args) {
        int num= 12344;
        System.out.println(rev(num));
    }
    static boolean rev(int num){

        int tepm = num;
        int lasteVal = 0;

        while(num != 0){

            int id = num % 10;

            num = num/10;

            lasteVal =(lasteVal*10)+ id;
        }
        if(lasteVal == tepm){
            return  true;
        }else {
            return false;
        }
    }
}
