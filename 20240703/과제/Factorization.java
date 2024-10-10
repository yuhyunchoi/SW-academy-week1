public class Factorization {

    public static void findPrimeFactorsLoop(int number) {
        // 2로 나누는 과정
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // 3 이상의 홀수로 나누는 과정
        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // 소수가 남아 있을 경우
        if (number > 2) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    // 소인수 분해를 시작하는 메서드
    public static void findPrimeFactorsRecursion(int number) {
        // 2부터 시작하여 소인수 분해를 시작합니다.
        factorize(number, 2);
    }

    // 소인수를 찾는 재귀 메서드
    public static void factorize(int number, int divisor) {
        if (number <= 1) {
            return; // 기저 조건: 숫자가 1 이하가 되면 반환
        }

        if (number % divisor == 0) {
            System.out.print(divisor + " ");
            factorize(number / divisor, divisor); // 나누어진 결과로 재귀 호출
        } else {
            factorize(number, divisor + 1); // 다음 인수로 넘어감
        }
    }

    public static void main(String[] args) {
        int number = 56;
        System.out.print("Prime factors of " + number + ": ");
        findPrimeFactorsLoop(number);

        number = 56;
        System.out.print("Prime factors of " + number + ": ");
        findPrimeFactorsRecursion(number);

        
    }
}
