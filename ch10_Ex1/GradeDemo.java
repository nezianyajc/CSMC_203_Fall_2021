import javax.swing.JOptionPane;

public class GradeDemo {
    public static void main(String[] args) {
        String input;
        double testScore;

        GradedActivity grade = new GradedActivity();

        input = JOptionPane.showInputDialog("Enter" + "a numeric test score.");

        testScore = Double.parseDouble(input);
        grade.setScore(testScore);

        JOptionPane.showMessageDialog(null, "The test score is " + grade.getGrade());

        System.exit(0);
    }
}