import java.util.Scanner;

public class Quiz {
    // Global variables to store the score and the scanner to get user input
    static int score = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Quiz Answers:\n");

        // Variable to store the answer of the user
        char answer;

        // Function to print the question and the options of answers
        printQuestion("Question 1: What is the correct syntax for the main method in Java?\n",
                "A. public static main(String[] args) \nB. public void main(String[] args) \nC. public static void main(String[] args) \nD. public main(String[] args) \n");
        // Get the answer from the user and convert it to upper case
        answer = Character.toUpperCase(scan.next().charAt(0));
        // Check the answer of the user
        checkAnswer(answer, 1);

        printQuestion("Question 2: Which of the following is NOT a valid Java data type?\n",
                "A. int \nB. float \nC. boolean \nD. string \n");
        answer = Character.toUpperCase(scan.next().charAt(0));
        checkAnswer(answer, 2);

        printQuestion("Question 3: Which keyword is used to create an object in Java?\n",
                "A. new \nB. class \nC. object \nD. this \n");
        answer = Character.toUpperCase(scan.next().charAt(0));
        checkAnswer(answer, 3);

        printQuestion("Question 4: What will be the output of the following code?\n int x = 5;\n int y = 10;\n System.out.println(x + y);",
                "A. 5 \nB. 10 \nC. 15 \nD. 0 \n");
        answer = Character.toUpperCase(scan.next().charAt(0));
        checkAnswer(answer, 4);

        printQuestion("Question 5: Which of the following is a reserved keyword in Java?\n",
                "A. object \nB. strictfp \nC. main \nD. system \n");
        answer = Character.toUpperCase(scan.next().charAt(0));
        checkAnswer(answer, 5);

        // Print the score of the user
        double percentageScore = (double) score / 5 * 100;
        System.out.printf("Score: %.2f%%\n", percentageScore);

        // Close the scanner
        scan.close();
    }

    public static void checkAnswer(char answer, int question) {
        /*
         * This function is responsible for checking the answer and summing the score
         * of the user. First, it checks if the answer is equal to one of the options in
         * lower or upper case. Then it checks if the answer matches with the question.
         */
        switch (answer) {
            case 'A' :
                if (question == 3) {
                    score++;
                }
                break;
            case 'B' :
                if (question == 1) {
                    score++;
                }
                break;
            case 'C' :
                if (question == 4 || question == 5) {
                    score++;
                }
                break;
            case 'D' :
                if (question == 2) {
                    score++;
                }
                break;
            default:
                // If the user passes a letter that is not valid in the quiz, show an error
                System.out.println("Invalid input, quiz will be reset.\n");
                // Restart the quiz
                main(null);
                break;
        }
    }

    public static void printQuestion(String question, String options) {
        System.out.println(question);
        System.out.println(options);
    }
}
