import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ans = (int) Math.random() * 10 + 1;
		int op = 3;

		while (op > 0) {
			System.out.print("1~10 �� ���� �ϳ��� �Է��ϼ���: ");
			int guess = sc.nextInt();

			if (guess == ans) {
				System.out.println("����� �̰���ϴ�!\t" + ans);
				return;
			} else if (guess < ans) {
				System.out.println("���ڰ� �ʹ� �۽��ϴ�!�Ф�");
			} else {
				System.out.println("���ڰ� �ʹ� Ů�ϴ�!�Ф�");
			}

			op -= 1;
			System.out.println("���� ��ȸ: " + op + "��");
		}

		System.out.println("����� �����ϴ�. ������ " + ans + "�Դϴ�.");
	}
}
