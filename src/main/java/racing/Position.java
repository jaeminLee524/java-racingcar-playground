package racing;

import java.util.Objects;

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

    public boolean isSame(Position maxPosition) {
        return this.equals(maxPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public Position getCurrentPosition() {
        return this;
    }

    public boolean isSameOrBetter(Position maxPosition) {
        return this.equals(maxPosition) || this.position > maxPosition.getPosition();
    }
}
