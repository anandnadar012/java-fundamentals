package patterns;

public class Rhombus {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int sp = 0; sp < 5 - i - 1; sp++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}