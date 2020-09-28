package lucky7;

import java.util.Scanner;

public class lucky7 {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int sum, num1, num2;
        System.out.print("Enter how much money you want to spend: ");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int rolls = 0;
        int highrolls = 0;
        int money = m;
        int high = m;
        while (true) {
            if(money == 0){break;}
            d1.roll();
            d2.roll();
            num1 = d1.getNumber();
            num2 = d2.getNumber();
            sum = num1 + num2;
            if (sum == 7) {
                money += 4;
            } else {
                money -= 1;
            }
            if (money > high) {
                high = money;
                highrolls = rolls;
            }
            rolls += 1;
        
        }
        System.out.println(String.format("You are broke after %d roles", rolls));
        System.out.println(String.format("You should have quit after %d rolls when you had: $%d", highrolls, high));
    }

}
