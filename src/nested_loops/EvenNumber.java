package nested_loops;

public class EvenNumber {
    public static void main(String[] args){
        for(int i=2; i<=10; i+=2) {
            for (int j=2; j<=i; j+=2) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
