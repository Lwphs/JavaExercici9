import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        double car1 = 0;
        double car2 = 0;
        double car3 = 0;

        System.out.println("Congratulations, you've sold 3 cars this month!");
        System.out.println("Please, enter the price you sold the first car at.");

        while (!input.hasNextDouble()) {
            System.out.println("Sorry, invalid input. Try again.");
            input.nextLine();
        }
        car1 = input.nextDouble();

        System.out.println("Please, enter the price you sold the second car at.");

        while (!input.hasNextDouble()) {
            System.out.println("Sorry, invalid input. Try again.");
            input.nextLine();
        }
        car2 = input.nextDouble();

        System.out.println("Please, enter the price you sold the third car at.");

        while (!input.hasNextDouble()) {
            System.out.println("Sorry, invalid input. Try again.");
            input.nextLine();
        }
        car3 = input.nextDouble();

        System.out.println("Congrats you have sold three cars for the total value of "
                + (car1 + car2 + car3) + " euros. You get 10% extra of every car value you" +
                "sell!!!!!!!");

        System.out.println("Calculating your income. ");
        Thread.sleep(1000);
        System.out.println("Calculating your income.. ");
        Thread.sleep(1000);
        System.out.println("Calculating your income... ");
        Thread.sleep(1500);

        System.out.println("Congrats! You've earned " + (car1 * 0.1 + car2 * 0.1 + car3 * 0.1));

        }
    }

