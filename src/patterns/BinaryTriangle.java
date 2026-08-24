package patterns;

public class BinaryTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(((i+k) % 2 == 0  ? 1 : 0) +" ");
            }
            System.out.println();
        }
    }
}
