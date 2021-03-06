package morningRoutine;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz funQuiz = new Quiz();

        MultipleChoice multipleChoice = new MultipleChoice("Did you wash your face?" +
                "\nA: Yes \nB: No\nPlease just type a single letter as an answer", "A");
        funQuiz.addQuestion(multipleChoice);

        Checkbox checkbox = new Checkbox("Morning must routine. Select all that apply, " +
                " \nA: Get dress \nB: Go to bed \nC: Have a breakfast", "A" + "C");
        funQuiz.addQuestion(checkbox);

        TrueOrFalse trueOrFalse = new TrueOrFalse("Did you brush your teeth? \nTrue or False?", "True");
        funQuiz.addQuestion(trueOrFalse);

        funQuiz.runQuiz();
    }
}
