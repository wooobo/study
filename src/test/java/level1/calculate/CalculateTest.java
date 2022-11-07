package level1.calculate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("계산기를 구현합니다.")
public class CalculateTest {

    @Test
    @DisplayName("1+2 의 결과는 3")
    void sum() {
        int a = 1;
        int b = 2;

        int result = a + b;

        assertEquals(3, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void method_minus() {
        int a = 4;
        int b = 2;

    }


    @Test
    @DisplayName("나누기")
    void method_divide() {
        int dividend = 4;
        int divisor = 2;

    }

}
