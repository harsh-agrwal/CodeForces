import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int moves = 0;
        int row = 0;
        int col = 0;
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                    break outer;
                }
            }
        }
        moves += Math.abs(row - 2);
        moves += Math.abs(col - 2);
        System.out.println(moves);
    }
}
