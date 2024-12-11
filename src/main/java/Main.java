import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            cars.add(createCar(scanner, i));
        }

        System.out.println("Самая быстрая машина: " + race.getLeader(cars));
    }

    static Car createCar(Scanner scanner, int number) {
        System.out.println("Введите название машины №" + number);
        String name = scanner.next();

        while (true) {
            String speedError = "Неправильная скорость";

            try {
                System.out.println("Введите скорость машины №" + number);
                int speed = scanner.nextInt();

                if (speed < 0 || speed > 250) {
                    System.out.println(speedError);
                } else {
                    return new Car(name, speed);
                }
            } catch (Exception e) {
                System.out.println(speedError);
                scanner.nextLine();
            }
        }
    }
}
