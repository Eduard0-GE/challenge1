package Java;

public class App {
    public static void main(String[] args){
        EmotionCheck emotionCheck = new EmotionCheck();

        String text = emotionCheck.textInput();

        emotionCheck.setFun(emotionCheck.emotionAmount(text, ":-)"));
        emotionCheck.setUpset(emotionCheck.emotionAmount(text, ":-("));

        String emotion = emotionCheck.returnEmotion();
        System.out.println(emotion);
    }
}
