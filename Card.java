package Exception;

public class Card {
    String cardNumber;
    String holderName;
    String[] abbCard = {"123456", "789100", "000000"};
    boolean isValid = true;


    public Card(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    public boolean isValid(boolean isValid) throws Exception {
        for (int i = 0; i < abbCard.length; i++) {
            if (cardNumber.equals(abbCard[i])) {
                System.out.println("ABB kartidir");
                break;
            }
        }
        return isValid;

    }
    public String mask(){
        return cardNumber.substring(0, 2) + "**" + cardNumber.substring(cardNumber.length()-2);

    }
}
