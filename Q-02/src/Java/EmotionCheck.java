package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmotionCheck {
    private int fun;
    private int upset;

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }

    public int getUpset() {
        return upset;
    }

    public void setUpset(int upset) {
        this.upset = upset;
    }

    public String textInput() {
        Scanner input = new Scanner(System.in);
        String text = "";

        while (true) {
            System.out.println("Enter the text a i will find the emotion inside it [ :-) | :-( ]");
            try {
                text = input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type! Try again!");
            }
        }
        return text;
    }

    public int emotionAmount(String text, String emotion) {
        int count = 0;
        int index = text.indexOf(emotion);

        while (index != -1) {
            count += 1;
            index = text.indexOf(emotion, index + emotion.length());
        }
        return count;
    }

    public String returnEmotion() {
        int result = this.getFun() - this.getUpset();
        String emotion = "";
        if (result > 0) {
            emotion = "fun";
        } else if (result < 0) {
            emotion = "upset";
        } else {
            emotion = "neutral";
        }
        return emotion;
    }
}