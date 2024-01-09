public class Random_test {
    public static void main(String[] args) {
        // Define a large range, for example, -1e9 to 1e9
        double minValue = -1e9;
        double maxValue = 1e9;

        // Generate a random number within the defined range
        double randomValue = minValue + Math.random() * (maxValue - minValue);

        System.out.println("Random Value: " + Math.round(randomValue));

        long val = Math.round(randomValue);

        int arr[] = {12,40,1};

        



    }
}
