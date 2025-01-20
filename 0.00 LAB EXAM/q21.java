
public class q21 {

    public static void main(String[] args) {
        // 2D array to hold marks of 10 students in 5 subjects
        int[][] marks = {
            {80, 90, 85, 70, 88}, // Marks of student 1
            {75, 85, 95, 90, 80}, // Marks of student 2
            {60, 70, 75, 85, 80}, // Marks of student 3
            {90, 92, 94, 96, 98}, // Marks of student 4
            {65, 70, 60, 55, 50}, // Marks of student 5
            {88, 85, 80, 87, 90}, // Marks of student 6
            {70, 75, 80, 85, 90}, // Marks of student 7
            {50, 60, 55, 65, 70}, // Marks of student 8
            {95, 92, 90, 85, 87}, // Marks of student 9
            {78, 79, 80, 81, 82} // Marks of student 10
        };

        int bestStudentIndex = -1;
        double highestAverage = 0;

        // Iterate over all students to calculate their average marks
        for (int i = 0; i < marks.length; i++) {
            int totalMarks = 0;

            // Calculate total marks for the current student
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }

            // Calculate average marks for the current student
            double average = totalMarks / 5.0;

            // Check if the current student has the highest average marks
            if (average > highestAverage) {
                highestAverage = average;
                bestStudentIndex = i; // Store the index of the best student
            }
        }

        // Display the best student details
        if (bestStudentIndex != -1) {
            System.out.println("Best student is student " + (bestStudentIndex + 1));
            System.out.println("Average marks: " + highestAverage);
            System.out.println("Marks obtained in each subject:");

            // Display the marks of the best student
            for (int j = 0; j < marks[bestStudentIndex].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[bestStudentIndex][j]);
            }
        }
    }
}
