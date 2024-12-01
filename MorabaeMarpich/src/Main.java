import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int s = Integer.parseInt(split[1]);
        int d = Integer.parseInt(split[2]);

        int[][] map = new int[n][n];
        fillMap(map, 0, n, 1);

    }

    public static void fillMap(int[][] map, int start, int end, int startNum) {

        for (int j = 0; j < end; j++) {
            map[end - 1][j] = startNum;
            startNum++;
        }
        for (int i = end - 1; i >= 0; i--) {
            map[i][end - 1] = startNum;
            startNum++;
        }
        for (int j = end - 2; j >= 0; j--) {
            map[start][j] = startNum;
            startNum++;
        }

        for (int i = 0; i < end - 1; i++) {
            map[i][start] = startNum;
            startNum++;
        }
    }
}