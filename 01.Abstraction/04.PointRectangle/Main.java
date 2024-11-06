package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coords = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Point bottomLeft = new Point(coords[0], coords[1]);
        Point topRight = new Point(coords[2], coords[3]);

        Rectangle rectangleFinal = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            Point point = new Point(x, y);
            System.out.println(rectangleFinal.contains(point));
        }
    }
}
