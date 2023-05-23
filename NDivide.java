public class NDivide {
    public static void NDivide( int n1, int n2){
        int result = 0;
        int n = n1;
        while (n1>=n2){
            n1=n1-n2;
            result++;
        }
        System.out.println(n + " devide on " + n2 + " is " + result);
    }

}
