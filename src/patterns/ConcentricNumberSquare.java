package patterns;

public class ConcentricNumberSquare {
    public static void main(String[] args) {// number of layers
        int size = 2 * 5 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int bottom = size - 1 - i;
                int left = j;
                int right = size - 1 - j;
                int layer = Math.min(Math.min(top, bottom), Math.min(left, right));
                int value = 5 - layer;

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}