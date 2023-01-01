package racing;

/**
 * TDD 연습을 통해 극단적인 리팩토링도 함께 진행
 * 해당 클래스는 자동차의 위치 원시값을 포장한 객체
 */
public class Position {

    private int position;

    public Position(int initialPosition) {
        this.position = initialPosition;
    }

    public void plusDistinct() {
        position += 1;
    }

    public int getPosition() {
        return position;
    }
}
