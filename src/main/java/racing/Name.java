package racing;

/**
 * TDD 연습을 통해 극단적인 리팩토링도 함께 진행
 * 해당 클래스는 자동차의 이름의 원시값을 포장한 객체
 */
public class Name {

    private final String name;

    public Name(String name) {
        this.name = name;
    }

    public boolean isContainComma() {
        return name.contains(",");
    }

    public String[] splitName() {
        return name.split(",");
    }

    public String printName() {
        return name;
    }
}
