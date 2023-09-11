public class Reduce {
    public static void main(String[] args) {
        int n = 1001;
        while (n != 0){
            if (n%2 == 0) {
                n = n / 2;
            }
            else if (n < 0) {
                n = n + 1;
            }
            else {
                n = n-1;
            }
            System.out.println(n);
        }
    }
}
