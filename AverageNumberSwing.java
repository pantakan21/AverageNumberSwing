package av;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class AverageNumberSwing {
    int average , score = 0 , sumScore = 0 , maxRound = 0;
    String maxRoundStr , scoreStr;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AverageNumberSwing object = new AverageNumberSwing();
        object.maxRoundStr = JOptionPane.showInputDialog("Enter Number of Score : ");
        object.maxRound = Integer.parseInt(object.maxRoundStr);

        for(int round = 1; round <= object.maxRound; round++) {
            object.scoreStr = JOptionPane.showInputDialog("Enter Score " + round + " : ");
            object.score = Integer.parseInt(object.scoreStr);
            object.sumScore = object.getScore(object.score);
            object.average = object.average(object.sumScore , object.maxRound);
        }
        JOptionPane.showMessageDialog(null, "Average Score is " + object.average , "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public int getScore(int score) {
        this.sumScore += score;
        return this.sumScore;
    }

    public int average(int sumScore , int maxRound) {
        this.average = sumScore / maxRound;
        return average;
    }
}
