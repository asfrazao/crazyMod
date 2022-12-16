package estudo;

import java.util.Scanner;

public class Scratch {

          public static void main(String[] args) {

            String[] que = new String[5];
            que[0] = "What continent is the USA on?";
            que[1] = "What continent is Japan on?";
            que[2] = "how much is 3x8?";
            que[3] = "how many minutes is 1 hour?";
            que[4] = "what's the capital of Brazil?";

            String[] ans = new String[5];
            ans[0] = "North America";
            ans[1] = "Asia";
            ans[2] = "24";
            ans[3] = "60";
            ans[4] = "Brasilia";

            Scanner scanner = new Scanner(System.in);
            ans[0] = scanner.next();

            outputQuestionsAndAnswers(que, ans);
        }

        public static void outputQuestionsAndAnswers(String[] questions, String[] answers){

            System.out.println(questions[0]);
            if (answers[0].equals("North America")) {
                System.out.println("Yea! The answer is North America");
            }

    }

}
