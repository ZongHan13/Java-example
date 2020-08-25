package question;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        String a1 = "what color are apples ? \n" + 
                    "(a)red/green\n(b)Orange\n(c)Magenta\n";
        String a2 = "What color are bananas?\n"
                    + "(a)red/green(b)Yellow\n(c)Blue\n";
                 
        Question[] questions = {
            new Question(a1, "a"),
            new Question(a2, "b")
        };
        takeTest(questions);

    }
    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("you got " + score + "/" + questions.length);
        keyboardInput.close();
    }

}