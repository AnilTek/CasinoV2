import java.util.Scanner;

public class Runner extends RouletteClass{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner =new Scanner(System.in);
        RouletteClass game = new RouletteClass();
        Baccarat gameB = new Baccarat();
        WheelFiveHunders gameWheel = new WheelFiveHunders();
        Hilo hilo = new Hilo();
        int balance = 100;
        int bet = 0;
        int gameDecision=0;
        int exit = 6;
        String innerExit = null;

        System.out.println("!!! Casinoya hoş geldiniz !!!");
        String welcome = "Bakiyeniz 100$ olup 1000$ da bitmektedir\n"+
                "Casinodan çıkmak için ya 1000$ kazanmalısınız yada batmalısınız\n"+
                "Rulet oynamak için '1' Baccarat oynamak için '2' yi tercih ediniz 500Wheel için '3' Hilo oynamak için '4' ü tercih ediniz";
        String welcomeRulet ="Oyun seçenekleriniz aşağıda gösterilen şekildedir\n"+
                "1------> 0-36 arası sayı tahmini\n"+
                "2------> 1-12 , 13-24 , 25-36 Sayıları arasında 1,2 ve 3 olan alanlardan tahmin etmek \n"+
                "3------> 1-18 ve 19-36 arası 1 ve 2 olan alanlardan tahmin etmek\n"+
                "4------> Kırmızı veya Siyah tahmini kırmızı için 1 siyah için 2 !\n"+
                "Başarılar ve iyi günler dileriz";
        String welcomeBaccarat = "Oyun seçenekleriniz aşağıda gösterilen şekildedir \n"+
                 "1------> Oyuncuya oynamak (Oyuncuya oynamak 1'e 2 oran vermektedir)\n"+
                " 2------> Beraberliğe  oynamak ( Beraberliğe oynamak 1'e 8 oran vermektedir)\n"+
                " 3------> Bankaya oynamak (Bankaya oynamak 1'e 2 oran vermektedir)\n"+
                "Başarılar ve iyi günler dileriz";
        String welcomeWheel = "oyun seçenekleriniz aşağıda gösterildiği gibidir \n"+
                " 1------> Kırmızıya oynamak 1e 3 öder \n"+
                " 2------> Siyaha oynamak 1e 2 öder\n"+
                " 3------> Maviye oynamak 1e 5 öder\n"+
                " 4------> Sarıya oynamak 1e 50 öder\n"+
                "Başarılar ve iyi günler dileriz";

        System.out.println(welcome);
        gameDecision = scanner.nextInt();

        do {


            if (gameDecision == 1) {
                while (game.balance > 0 && game.balance <= 200) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println(welcomeRulet);
                    System.out.print("Lütfen oynamak istediğiniz oyunu seçiniz");
                    int answer = scanner.nextInt();
                    if (answer == 1) {
                        System.out.print("Lütfen oynamak istediğiniz bahis miktarını giriniz");
                        game.bet = scanner.nextInt();
                        if (game.bet > game.balance) {
                            System.out.println("Bakiyenizde " + game.bet + "$ kadar para bulunmuyor tekrar deneyiniz");
                            continue;
                        }
                        System.out.print("Merhaba lütfen 1 ile 36 arası bir tahmin yapınız");
                        game.rouletteGuess = scanner.nextInt();
                        System.out.println("Top Dönüyor...");
                        Thread.sleep(2000);
                        game.RouletteGuess();
                    } else if (answer == 2) {
                        System.out.print("Lütfen oynamak istediğiniz bahis miktarını giriniz");
                        game.bet = scanner.nextInt();
                        if (game.bet > game.balance) {
                            System.out.println("Bakiyenizde " + game.bet + "$ kadar para bulunmuyor tekrar deneyiniz");
                            continue;
                        }
                        System.out.println("");
                        System.out.print("Lütfen 1,2 veya 3. alanlardan bir tanesini seçiniz");
                        game.area = scanner.nextInt();
                        System.out.println("Top Dönüyor...");
                        Thread.sleep(2000);
                        System.out.println("");
                        game.RouletteArea();
                    } else if (answer == 3) {
                        System.out.print("Lütfen oynamak istediğiniz bahis miktarını giriniz");
                        game.bet = scanner.nextInt();
                        if (game.bet > game.balance) {
                            System.out.println("Bakiyenizde " + game.bet + "$ kadar para bulunmuyor tekrar deneyiniz");
                            continue;
                        }
                        System.out.println("");
                        System.out.print("Lütfen alanlardan 1 veya 2 olanını seçiniz");
                        game.twoPlace = scanner.nextInt();
                        System.out.println("Top Dönüyor...");
                        Thread.sleep(2000);
                        System.out.println("");
                        game.RouletteTwoPlace();

                    } else if (answer == 4) {
                        System.out.print("Lütfen oynamak istediğiniz bahis miktarını giriniz");
                        game.bet = scanner.nextInt();
                        if (game.bet > game.balance) {
                            System.out.println("Bakiyenizde " + game.bet + "$ kadar para bulunmuyor tekrar deneyiniz");
                            continue;
                        }
                        System.out.println("");
                        System.out.println("Lütfen kırmızı için '1' siyah için '2' yi seçiniz ");
                        game.blackOrRed = scanner.nextInt();
                        System.out.println("Top Dönüyor...");
                        Thread.sleep(2000);
                        System.out.println("");
                        game.RouletteBlackOrRed();

                    }
                    if (game.balance >= 200) {
                        System.out.println("TEBRİKLER CASİNODAN TAMI TAMINA " + game.balance + "$ İLE AYRILABİLİRSİNİZ İYİ GÜNLER DİLERİZ");
                        break;
                    } else if (game.balance <= 0) {
                        System.out.println("ÜZGÜNÜZ BÜTÜN PARANIZI KAYBETTİNİZ SİZİ CASİNODAN ÇIKARMAK ZORUNDAYIZ İYİ GÜNLER DİLERİZ");

                    }
                    System.out.println("Menüye Çıkış yapmak için 'Çıkış' yazınız aksi halde 'Hayır' yazıp 'Enter' a basmanız yeterli");
                    innerExit = scanner.next();
                    if (innerExit.equalsIgnoreCase("çıkış")){
                        break;
                    }
                }

            } else if (gameDecision == 2) {
                while (game.balance > 0 && game.balance <= 200) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println(welcomeBaccarat);
                    System.out.println("Lütfen bahis koymak istediğiniz miktarı yazınız :");
                    gameB.bet = scanner.nextInt();
                    System.out.println("Bahis sisteme aktarılıyor lütfen bekleyiniz...");
                    Thread.sleep(3000);
                    System.out.println("Lütfen tercihinizi giriniz : ");
                    gameB.baccaratGuess = scanner.nextInt();
                    gameB.BaccaratPlayer();
                    Thread.sleep(2000);
                    gameB.BaccaratBank();
                    Thread.sleep(2000);
                    gameB.BaccaratRunner();
                    Thread.sleep(2000);
                    System.out.println("Yeni bakiyeniz : " + gameB.balance + "$");
                    Thread.sleep(2000);


                    if (gameB.balance >= 200) {
                        System.out.println("TEBRİKLER CASİNODAN TAMI TAMINA " + gameB.balance + "$ İLE AYRILABİLİRSİNİZ İYİ GÜNLER DİLERİZ");
                        break;
                    } else if (gameB.balance <= 0) {
                        System.out.println("ÜZGÜNÜZ BÜTÜN PARANIZI KAYBETTİNİZ SİZİ CASİNODAN ÇIKARMAK ZORUNDAYIZ İYİ GÜNLER DİLERİZ");

                    }
                    System.out.println("Menüye Çıkış yapmak için 'Çıkış' yazınız aksi halde 'Hayır' yazıp 'Enter' a basmanız yeterli");
                    innerExit = scanner.next();
                    if (innerExit.equalsIgnoreCase("çıkış")){
                        break;
                    }
                }

            } else if (gameDecision == 3) {
                while (game.balance > 0 && game.balance <= 200) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println(welcomeWheel);
                    System.out.print("Lütfen oynamak istediğiniz bahis miktarını giriniz");
                    gameWheel.bet = scanner.nextInt();
                    if (gameWheel.bet > gameWheel.balance) {
                        System.out.println("Bakiyenizde " + game.bet + "$ kadar para bulunmuyor tekrar deneyiniz");
                        continue;
                    }
                    System.out.println("");
                    System.out.println("Lütfen kırmızı için '1' siyah için '2' mavi için '3' sarı için ise '4' ü seçiniz ");
                    gameWheel.wheelDecision = scanner.nextInt();
                    System.out.println("Top Dönüyor...");
                    Thread.sleep(2000);
                    System.out.println("");
                    gameWheel.Wheel();
                    Thread.sleep(1000);
                    System.out.println("Menüye Çıkış yapmak için 'Çıkış' yazınız aksi halde 'Hayır' yazıp 'ENTER' a basmanız yeterli");
                    innerExit = scanner.next();
                    if (innerExit.equalsIgnoreCase("çıkış")) {
                        break;
                    }
                    System.out.println("AĞĞĞĞĞĞĞĞĞĞĞĞĞ");


                }
            }else if (gameDecision==4){
                while (game.balance> 0 && game.balance<=200){
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Lütfen bahis giriniz");
                    hilo.bet = scanner.nextInt();
                    hilo.HiloGame();
                    System.out.println("Menüye Çıkış yapmak için 'Çıkış' yazınız aksi halde 'Hayır' yazıp 'Enter' a basmanız yeterli");
                    innerExit = scanner.next();
                    if (innerExit.equalsIgnoreCase("çıkış")){
                        break;
                    }

                }
            }

            System.out.println("Programdan Çıkmak için '5' " + "Hilo oynamak için '4' "+"Rulet oynamak için '1' Baccarat oynamak için '2' yi tercih ediniz 500Wheel için ise '3' ü tercih ediniz");
            gameDecision = scanner.nextInt();



        }while (!(gameDecision==5));

        System.out.println("Programdan Çıkış Yapılıyor İyi Günler Dileriz....");
        Thread.sleep(2000);
    }
}
