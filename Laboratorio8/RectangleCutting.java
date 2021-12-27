import java.util.*;
public class RectangleCutting {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] data = new int[a+1][b+1];

		for (int height = 1; height < a + 1; height++) {
			for (int width = 1; width < b + 1; width++) {
				if (height == width) {
					data[height][width] = 0;
				} else {
					int ans = Integer.MAX_VALUE;
					for (int i = 1; i < width; i++) {
						ans = Math.min(ans, 1 + data[height][width - i] + data[height][i]);
					}
					for (int i = 1; i < height; i++) {
						ans = Math.min(ans, 1 + data[height - i][width] + data[i][width]);
					}
					data[height][width] = ans;/
				}
			}
		}
		System.out.println(data[a][b]);
	}
}
