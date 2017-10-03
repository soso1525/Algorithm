import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ans = (int) Math.random() * 10 + 1;
		int op = 3;

		while (op > 0) {
			System.out.print("1~10 중 숫자 하나를 입력하세요: ");
			int guess = sc.nextInt();

			if (guess == ans) {
				System.out.println("당신이 이겼습니다!\t" + ans);
				return;
			} else if (guess < ans) {
				System.out.println("숫자가 너무 작습니다!ㅠㅠ");
			} else {
				System.out.println("숫자가 너무 큽니다!ㅠㅠ");
			}

			op -= 1;
			System.out.println("남은 기회: " + op + "번");
		}

		System.out.println("당신이 졌습니다. 정답은 " + ans + "입니다.");
	}
}
