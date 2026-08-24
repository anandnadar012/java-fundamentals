package patterns;

public class HollowSquareWithDiagonals {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                boolean isBorder = (i == 0 || i == 7 - 1 || j == 0 || j == 7 - 1);
                boolean isMainDiagonal = (i == j);
                boolean isAntiDiagonal = (i + j == 7 - 1);

                if (isBorder || isMainDiagonal || isAntiDiagonal) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}