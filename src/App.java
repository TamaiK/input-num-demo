import java.util.Scanner;

public class App {
    private static final Scanner STDIN = new Scanner(System.in);

    private static final int MIN_NUM = 5;
    private static final int MAX_NUM = 18;

    private static final String BLANK = "";
    private static final String MESSAGE_FOR_REQUIRE_INPUT_NUM = "数字を入力してください: ";
    private static final String MESSAGE_FOR_REQUIRE_INPUT_WITH_NUM = "数字で入力してください ";
    private static final String MESSAGE_FORMAT_FOR_REQUIRE_INPUT_IN_RANGE = "%d ～ %d の範囲内の数字で入力してください %n";
    private static final String MESSAGE_FORMAT_FOR_SHOW_USER_ANSWER_NUM = "ユーザーが入力した数字は %d です %n";

    public static void main(String[] args) {
        int userAnswerNum = recieveInputtedNum();
        showUserAnswerNum(userAnswerNum);
    }

    private static int recieveInputtedNum() {
        showWithNoBreak(MESSAGE_FOR_REQUIRE_INPUT_NUM);
        String inputtedStr = recieveInputtedStr();
        int inputtedNum = validate(inputtedStr);

        return inputtedNum;
    }

    private static int validate(String str) {
        if (!isNum(str)) {
            show(MESSAGE_FOR_REQUIRE_INPUT_WITH_NUM);
            show(BLANK);
            return recieveInputtedNum();
        }

        int num = parseToInt(str);

        if (!isInRange(MIN_NUM, MAX_NUM, num)) {
            showRequireNumInRange(MIN_NUM, MAX_NUM);
            show(BLANK);
            return recieveInputtedNum();
        }
        return num;
    }

    private static String recieveInputtedStr() {
        return STDIN.nextLine();
    }

    private static boolean isNum(String str) {
        try {
            parseToInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean isInRange(int min, int max, int num) {
        return num >= min && num <= max;
    }

    private static int parseToInt(String str) {
        return Integer.parseInt(str);
    }

    private static void show(String message) {
        System.out.println(message);
    }

    
    private static void showWithNoBreak(String message) {
        System.out.print(message);
    }

    private static void showRequireNumInRange(int min, int max) {
        System.out.format(MESSAGE_FORMAT_FOR_REQUIRE_INPUT_IN_RANGE, min, max);
    }

    private static void showUserAnswerNum(int userAnswerNum) {
        System.out.format(MESSAGE_FORMAT_FOR_SHOW_USER_ANSWER_NUM, userAnswerNum);
    }
}
