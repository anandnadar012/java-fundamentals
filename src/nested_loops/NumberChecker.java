package nested_loops;

public class NumberChecker {
    public static void main(String[] args){
        int k;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                k = ((i + j) % 2 == 0) ? i : 0;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}