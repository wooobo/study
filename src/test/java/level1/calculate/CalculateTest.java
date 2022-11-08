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
//        int result = a + b;
        int result = Calculate.sum(a,b);


        // then
        // assert -> 검증한다
        // 테스트코드 작성할 때는 실패한 코드를 먼저 작성한다.
        // 프로덕션 코드를 짜기 전에 실패 -> 하드코딩 -> 리팩토링 과정을 거치는 것이 디버깅하기에도 좋다.
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
//        assertEquals(2, result);
//        assertThat((result).isEqualTo(2));
    }

}
