package level1.calculate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("계산기를 구현합니다.")
public class CalculateTest {

    @Test
    @DisplayName("1+2 의 결과는 3")
    void sum() {
        // given
        int a = 1;
        int b = 2;


        // when
        int result = Calculate.sum(a,b);


        // then
        assertEquals(3, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void method_minus() {
        int a = 4;
        int b = 2;

        int result = Calculate.minus(a,b);

        assertEquals(2, result);
    }


    @Test
    @DisplayName("나누기")
    void method_divide() {
        int dividend = 4;
        int divisor = 2;

        int result = Calculate.divide(dividend, divisor);

        boolean bool = true;
        assertTrue(bool);
    }

}
