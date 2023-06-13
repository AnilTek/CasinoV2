import java.util.Random;
import java.util.Scanner;

public class Hilo implements CasinoInterface{

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    RouletteClass values = new RouletteClass();
    float balance = (float)values.balance;
    float bet = (float)values.bet;
    String highOrLower;
    int playerCard;
    int bankCard;
    float highmultiplier;
    float lowmultiplier;
    float equalmultiplier;
    float totalMultiplier = 1F;
    String cashout= "";

    public void HiloGame(){
        System.out.println("Oyun Başlatılıyor");
        totalMultiplier=1F;
        playerCard = random.nextInt(10);
        while (playerCard==0){
            playerCard = random.nextInt(10);
        }
        while(!cashout.equalsIgnoreCase("Cashout")){


            bankCard = random.nextInt(10);
            while (bankCard==0){
                bankCard = random.nextInt(10);
            }
            if (playerCard==1){
                highmultiplier = 1.1F;
                equalmultiplier = 10F;
                System.out.println("Kartınız: " + playerCard +" Eşit mi ? Oran--> "+equalmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==2){
                highmultiplier = 1.3F;
                lowmultiplier = 5F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==3){
                highmultiplier = 1.25F;
                lowmultiplier = 3.3F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==4){
                highmultiplier = 1.42F;
                lowmultiplier = 2.5F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==5){
                highmultiplier = 1.66F;
                lowmultiplier = 2F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==6){
                highmultiplier = 2F;
                lowmultiplier = 1.66F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==7){
                highmultiplier = 2.5F;
                lowmultiplier = 1.42F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==8){
                highmultiplier = 3.3F;
                lowmultiplier = 1.25F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==9){
                highmultiplier = 5F;
                lowmultiplier = 1.3F;
                System.out.println("Kartınız: " + playerCard +" Düşük-Eşit mi ? Oran--> "+lowmultiplier+" Yüksek-eşit mi ? Oran--> "+ highmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= highmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
            }else if (playerCard==10){
                lowmultiplier = 1.1F;
                equalmultiplier = 10F;
                System.out.println("Kartınız: " + playerCard +" Eşit mi ? Oran--> "+equalmultiplier+" Düşük-eşit mi ? Oran--> "+ lowmultiplier);
                System.out.println("Total Multp X"+totalMultiplier);
                highOrLower = scanner.nextLine();
                if (highOrLower.equalsIgnoreCase("h")){
                    if (playerCard<=bankCard){
                        totalMultiplier *= equalmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard>=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }
                } else if (highOrLower.equalsIgnoreCase("L")) {
                    if (playerCard>=bankCard){
                        totalMultiplier *= lowmultiplier;
                        System.out.println("BİNGO BANKA KARTI: " +bankCard);
                        System.out.println("Total Multp X"+totalMultiplier);
                        System.out.println("Cashout yapmak ister misin alıcağın (Y/N) ücret : " + (totalMultiplier*bet));
                        cashout = scanner.nextLine();
                        if (cashout.equalsIgnoreCase("Y")){
                            balance += totalMultiplier*bet;
                            System.out.println("Yeni bakiye : " +balance+"$");
                            break;
                        }else
                            playerCard = bankCard;
                    }else if (playerCard<=bankCard) {
                        System.out.println("AHH BEEE BANKA KARTI: "+bankCard);
                        balance -= bet;
                        System.out.println("Yeni bakiye : " +balance+"$");
                        break;
                    }


                }
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

    @Override
    public int BaccaratPlayer() {
        return 0;
    }

    @Override
    public int BaccaratBank() {
        return 0;
    }

    @Override
    public void BaccaratRunner() {

    }
}
