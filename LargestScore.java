public class LargestScore {
    public static void main(String[] args) {
        // You can change these values to test with different scores
        int score1 = 85;
        int score2 = 92;
        int score3 = 78;

        int largest = score1;

        if (score2 > largest) {
            largest = score2;
        }
        if (score3 > largest) {
            largest = score3;
        }

        System.out.println("The highest score is: " + largest);
    }
}