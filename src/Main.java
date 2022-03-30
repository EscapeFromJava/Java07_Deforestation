import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько A-деревьев в день срубает Дмитрий?");
        int A = scan.nextInt();
        System.out.println("Какой К-ый день отдыхает Дмитрий?");
        int K = scan.nextInt();
        System.out.println("Сколько B-деревьев в день срубает Федор?");
        int B = scan.nextInt();
        System.out.println("Какой M-ый день отдыхает Федор?");
        int M = scan.nextInt();
        System.out.println("Сколько растет X-деревьев в лесу?");
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
                System.out.println("Деревья будут вырублены за " + i + " дней");
                break;
            }
        }
    }
}
