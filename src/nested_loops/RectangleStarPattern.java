package nested_loops;

public class RectangleStarPattern {
    public static void main(String[] args){
        for (int i = 1; i<4; i++) {
            for (int j = 1; j<6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
