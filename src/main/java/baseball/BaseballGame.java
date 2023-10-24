package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    private boolean exitFlag = false;
    private static final int DIGIT = 3;
    private static final String BALL_PRINT = "볼";
    private static final String STRIKE_PRINT = "스트라이크";
    private static final String NOTHING_PRINT = "낫싱";

    private static final String RESTART_PRINT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static final String THREE_STRIKE_PRINT = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private List<Integer> computerNumber = new ArrayList<>();
    private List<Integer> userNumber = new ArrayList<>();
    SetNumber number = new SetNumber();


        public void start() {
            System.out.println("숫자 야구 게임을 시작합니다.");
            computerNumber = number.setRandomNumbers();
            while (!exitFlag) {
                userNumber = number.setUserNumber();
                printHint(computerNumber, userNumber);
            }
        }




    }
