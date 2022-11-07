package level1.calculate;

import java.util.Scanner;

public class Level1Application {

    public static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요.");
        int a = INPUT.nextInt();
        int b = INPUT.nextInt();

        int result = Calculate.sum(a, b);

        System.out.println("결과는 : " + result);

        System.out.println("문자를 입력해주세요.");
        String text = INPUT.next();
        System.out.println("입력한 문자는 : " + text);
    }
}
