public class VarsAndMath {
    public static void main(String[] args) {

        String studentName = "John Doe";
        int mathGrade = 95;
        int scienceGrade = 88;
        int englishGrade = 98;


        double averageGrade = (mathGrade + scienceGrade + englishGrade) / 3.0;


        String letterGrade;
        if (averageGrade >= 90) {
            letterGrade = "A";
        } else if (averageGrade >= 80) {
            letterGrade = "B";
        } else if (averageGrade >= 70) {
            letterGrade = "C";
        } else if (averageGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }


        String report = "Student Name: " + studentName + "\n" +
                "Math Grade: " + mathGrade + "\n" +
                "Science Grade: " + scienceGrade + "\n" +
                "English Grade: " + englishGrade + "\n" +
                "Average Grade: " + averageGrade + "\n" +
                "Letter Grade: " + letterGrade;

        // Print the report
        System.out.println(report);
    }
}
