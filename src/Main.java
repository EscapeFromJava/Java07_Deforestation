import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("������� A-�������� � ���� ������� �������?");
        int A = scan.nextInt();
        System.out.println("����� �-�� ���� �������� �������?");
        int K = scan.nextInt();
        System.out.println("������� B-�������� � ���� ������� �����?");
        int B = scan.nextInt();
        System.out.println("����� M-�� ���� �������� �����?");
        int M = scan.nextInt();
        System.out.println("������� ������ X-�������� � ����?");
        int X = scan.nextInt();

        int value = 0;
        int weekendNikolay = K;
        int weekendFedor = M;

        for (int i = 1; i <= X; i++) {
            if (i != weekendNikolay)
                value += A;
            else
                weekendNikolay += K;
            if (i != weekendFedor)
                value += B;
            else
                weekendFedor += M;
            if (value >= X) {
                System.out.println("������� ����� ��������� �� " + i + " ����");
                break;
            }
        }
    }
}
