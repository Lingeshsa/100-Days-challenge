public class ReverseInteger {
    public static void main(String[] args) {
        int ans = reverse(130);
        System.out.println(ans);

    }

    public static int reverse(int x) {
        long ans = 0;

        while(x != 0){
            ans = ans*10 + (x%10);
            x=x/10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        return (int)ans;

    }
}
