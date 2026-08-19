package Patterns;

public class RightAlignedTriangle {
    public static void main() {
        Trianle(5);
    }
    static void Trianle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
