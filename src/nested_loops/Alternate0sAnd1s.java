package nested_loops;

public class Alternate0sAnd1s {
    public static void main(String[] args){
        int k;
        for(int i=1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                k = ((i+j)%2==0) ? 1:0;
                System.out.print(k );
            }
            System.out.println();
        }
    }
}
