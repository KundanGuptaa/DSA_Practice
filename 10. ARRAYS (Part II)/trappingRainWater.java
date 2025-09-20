public class trappingRainWater {
    public static int trapping(int height[]) {
        // left max array
        int leftMaxBoundry[] = new int[height.length];
        leftMaxBoundry[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMaxBoundry[i] = Math.max(height[i], leftMaxBoundry[i - 1]);
        }
        // right max boundry
        int rightMaxBoundry[] = new int[height.length];
        rightMaxBoundry[height.length - 1] = height[height.length - 1];
        for (int i = leftMaxBoundry.length - 2; i >= 0; i--) {
            rightMaxBoundry[i] = Math.max((height[i]), rightMaxBoundry[i + 1]);
        }
        int trappedRainWater = 0;
        // loop
        for (int i = 0; i < height.length; i++) {
            // finding water level
            int waterLevel = Math.min(leftMaxBoundry[i], rightMaxBoundry[i]);
            trappedRainWater += waterLevel - height[i];
        }
        return trappedRainWater;

    }

    public static void main(String args[]) {
        int height[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 10 };
        int trappedRainWater = trapping(height);
        System.out.println("Total Trapped Water=" + trappedRainWater);
    }

}
