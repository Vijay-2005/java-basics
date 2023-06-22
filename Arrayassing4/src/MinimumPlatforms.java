import java.util.Arrays;

public class MinimumPlatforms {
    public static int findMinimumPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformsNeeded = 0;
        int maxPlatforms = 0;
        int arrIndex = 0;
        int depIndex = 0;

        while (arrIndex < arrival.length) {
            if (arrival[arrIndex] <= departure[depIndex]) {
                platformsNeeded++;
                arrIndex++;
            } else {
                platformsNeeded--;
                depIndex++;
            }
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = { 900, 940, 950, 1100, 1500, 1800 };
        int[] departure = { 910, 1200, 1120, 1130, 1900, 2000 };
        int minPlatforms = findMinimumPlatforms(arrival, departure);
        System.out.println("Minimum platforms required: " + minPlatforms);
    }
}

