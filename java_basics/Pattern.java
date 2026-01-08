public static void main(String[] args) {
    // hollow rectangle
    int n = 5;
    int m = 7;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (i == 1 || j == 1 || i == n || j == m) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // inverted half pyramid with numbers
    int p = 5;
    for (int i = 1; i <= p; i++) {
        for (int j = 1; j <= p - i + 1; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Floyd's Triangle
    int rows = 5;
    int number = 1;
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
    }

    // 0-1 Triangle
    int q = 5;
    for (int i = 1; i <= q; i++) {
        for (int j = 1; j <= i; j++) {
            int sum = i + j;
            if (sum % 2 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }

    // Butterfly Pattern
    int s = 5;
    for (int i = 1; i <= s; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int k = 1; k <= 2 * (s - i); k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = s - 1; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int k = 1; k <= 2 * (s - i); k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}