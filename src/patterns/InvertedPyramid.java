package patterns;

public class InvertedPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (j < i - 1 || j > 9 - i) {
                    System.out.print(" ");
                } else {                          
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}