package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("kart nomresi daxil edin:");
            String cardNumber = scanner.nextLine();
            System.out.println("istifadeci adini daxil edin :");
            String holderName = scanner.nextLine();

            Card card = new Card(cardNumber, holderName);
            if (!card.isValid) {
                throw new Exception("ABB karti deyil");
            }
            System.out.println("ABB kartidir");
            System.out.println("kart:"+card.mask());
            System.out.println("kart sahibi:"+card.holderName);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
       finally{
            System.out.println("final");
        }
    }
}