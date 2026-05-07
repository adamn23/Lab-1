public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Step: " + findSteps(n));
    }
    private static String findSteps(int n) {
        int steps = 0;
        while(n != 0) {
            if(n % 2 == 0) { n /= 2; }
            else { n -= 1; }
            ++steps;
        }
        return "" + steps;
    }
}
