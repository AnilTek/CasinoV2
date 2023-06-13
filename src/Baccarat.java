import java.util.Random;

public class Baccarat implements CasinoInterface{

    RouletteClass values = new RouletteClass();
    int balance = values.balance;
    int bet = values.bet;
    int playerSum ;
    int bankSum;
    int baccaratGuess;
    int playerResult1 ;
    int bankResult1;

    public int BaccaratPlayer() {
        Random random = new Random();
        for (int i = 3; i > 0; i--) {
            int num = random.nextInt(9);
            System.out.println("Oyuncuya kart veriliyor...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            playerSum += num;
            System.out.println("Oyuncuya kartı " + num + " Total----> " + playerSum);
            if (playerSum>9){
                playerSum = playerSum-10;
                System.out.println("Total----> "+playerSum);
            }

        }
        playerResult1=playerSum;
        return playerResult1;
    }


    public int BaccaratBank() {
        Random random = new Random();
        for (int i = 3; i > 0; i--) {
            int num = random.nextInt(9);
            System.out.println("Bankaya kart veriliyor...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bankSum += num;
            System.out.println("Banka kartı " + num + " Total----> " + bankSum);
            if (bankSum>9){
                bankSum = bankSum - 10;
                System.out.println("Total----> "+bankSum);
            }

        }
        bankResult1=bankSum;
        return bankResult1 ;

    }

    @Override
    public void BaccaratRunner() {
        System.out.println("Sonuç Hesaplanıyor...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int playerResult = playerResult1;
        int bankResult = bankResult1;
        if (baccaratGuess==1){
            if (playerResult>bankResult){
                balance += bet;
                System.out.println("Tebrik ederiz oyuncu skoru ---> " + playerResult+ " banka skoru ---> "+ bankResult + "Kazandınız!!!");
            } else if (playerResult==bankResult) {
                System.out.println("");
            }else {
                balance -= bet;
                System.out.println("Üzgünüz oyuncu skoru ---> "+ playerResult +" banka skoru ---> "+bankResult+ " Kaybettiniz!!!");
            }
        } else if (baccaratGuess==0) {
            if (playerResult==bankResult){
                balance += bet*8;
                System.out.println("Tebrik ederiz oyuncu skoru ---> "+playerResult+" banka skoru ---> "+bankResult+ "Beraberlik Kazandınız");
            }
            else {
                balance -= bet;
                System.out.println("Üzgünüz oyuncu skoru ---> "+ playerResult +" banka skoru ---> "+bankResult+ " Kaybettiniz!!!");
            }
        } else if (baccaratGuess==2) {
            if (bankResult>playerResult){
                balance += bet;
                System.out.println("Tebrik ederiz oyuncu skoru ---> " + playerResult+ " banka skoru ---> "+ bankResult + "Kazandınız!!!");
            } else if (bankResult==playerResult) {
                System.out.println("");

            } else if (playerResult>bankResult) {
                balance -= bet;
                System.out.println("Üzgünüz oyuncu skoru ---> "+ playerResult +" banka skoru ---> "+bankResult+ " Kaybettiniz!!!");

            }

        }


    }


    @Override
    public void RouletteGuess() {

    }

    @Override
    public void RouletteArea() {

    }

    @Override
    public void RouletteTwoPlace() {

    }

    @Override
    public void RouletteBlackOrRed() {

    }
}
