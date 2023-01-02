import java.util.Scanner;
import racing.Car;
import racing.RacingGame;

public class RacingMain {

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner sc = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scTime = new Scanner(System.in);

        gameStart(sc.next(), scTime.nextInt());

    }

    private static void gameStart(String carNameList, int gameTryTime) {
        RacingGame racingGame = new RacingGame(carNameList, gameTryTime);
        // gameStart
        racingGame.racing();

        // print
        racingGame.printCarsDistinct();

        // print winner

    }

}
