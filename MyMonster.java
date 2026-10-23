
import java.util.Random;
import java.util.Scanner;

public class MyMonster extends Monster {
    MyMonster(int sizeBoard) {
        super(sizeBoard);
        setImage("\uD83E\uDDCC");
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        if (difficultGame == 1) {
            return taskMonster();
        }

        System.out.println("Решите задачу:");

        Random random = new Random();
        // диапазоны как у тебя
        int x = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
        int y = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
        int z = random.nextInt(100 * (difficultGame - 1), 100 * difficultGame);
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        int trueAnswer = x * y - z - (a + b);

        System.out.println("Реши пример: " + x + " * " + y + " - " + z + " - (" + a + " + " + b + ") = ?");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if (trueAnswer == answer) {
            System.out.println("Верно! Ты победил монстра.");
            return true;
        } else {
            System.out.println("Неверно! Но у тебя ещё есть шанс.");
            return false;
        }
    }

    public boolean taskMonster() {
        return super.taskMonster(1);
    }
}