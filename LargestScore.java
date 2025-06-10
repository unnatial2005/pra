public class LargestScore {
    public static void main(String[] args) {
        int score1 = 89, score2 = 76, score3 = 91;
        int largest = Math.max(score1, Math.max(score2, score3));
        System.out.println("Highest Score: " + largest);
    }
}
