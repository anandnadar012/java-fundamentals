package nested_loops;

public class ReverseContinuousNumber {
    public static void main(String[] args){
        int k=15;
        for(int i=5; i>=1; i--) {
            for (int j=i; j>=1; j--) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }
    }
}
