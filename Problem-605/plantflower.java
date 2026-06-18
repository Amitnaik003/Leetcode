import java.util.*;

class plantflower {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean leftEmpty =
                        (i == 0) || (flowerbed[i - 1] == 0);

                boolean rightEmpty =
                        (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {

                    flowerbed[i] = 1;
                    n--;

                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of flowerbed: ");
        int size = sc.nextInt();

        int[] flowerbed = new int[size];

        System.out.println("Enter flowerbed elements (0 or 1):");

        for (int i = 0; i < size; i++) {
            flowerbed[i] = sc.nextInt();
        }

        System.out.print("Enter number of flowers to plant: ");
        int n = sc.nextInt();

        plantflower obj = new plantflower();

        boolean result = obj.canPlaceFlowers(flowerbed, n);

        System.out.println("Can place flowers? " + result);

        sc.close();
    }
}