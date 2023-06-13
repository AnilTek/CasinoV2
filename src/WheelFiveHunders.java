import java.util.LinkedList;
import java.util.Random;

public class WheelFiveHunders implements CasinoInterface{
    RouletteClass values = new RouletteClass();
    int wheelDecision;

    int balance = values.balance;
    int bet = values.bet;



        public void Wheel(){
            int [] red = {4,6,8,14,16,18,24,26,28,30,32,38,40,42,48,50,52,};
            LinkedList<Integer> Red = new LinkedList<Integer>();
            for(int k:red){
                Red.add(k);
            }

            int [] black = {3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53};
            LinkedList<Integer> Black = new LinkedList<Integer>();
            for(int b:black){
                Black.add(b);
            }

            int [] blue = {2,10,12,20,22,34,36,44,46,54};
            LinkedList<Integer> Blue = new LinkedList<Integer>();
            for(int bl:blue){
                Blue.add(bl);
            }

            int [] yellow = {1};
            LinkedList<Integer> Yellow = new LinkedList<Integer>();
            for(int y:yellow){
                Yellow.add(y);
            }

            Random randomGuess = new Random();
            int num = randomGuess.nextInt(54);


            if (wheelDecision==1){
                if (Red.contains(num)){
                    balance+= (2*bet);
                    System.out.println("Winner winner doğru tahmin yaptınız Kırmızı geldi sayı ise "+ num + "yeni bakiyeniz "+ balance);
                }
                else {
                    balance -=bet;
                    System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
                }
            } else if (wheelDecision==2) {
                if (Black.contains(num)){
                    balance+=bet;
                    System.out.println("Winner winner doğru tahmin yaptınız Siyah geldi sayı ise "+ num + "yeni bakiyeniz "+ balance);
                }
                else {
                    balance -=bet;
                    System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
                }

            } else if (wheelDecision==3) {
                if (Blue.contains(num)){
                    balance+= (4*bet);
                    System.out.println("Winner winner doğru tahmin yaptınız Mavi geldi sayı ise "+ num + "yeni bakiyeniz "+ balance);
                }
                else {
                    balance -=bet;
                    System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
                }
            } else if (wheelDecision==4) {
                if (Yellow.contains(num)){
                    balance+=(49*bet);
                    System.out.println("Winner winner doğru tahmin yaptınız Sarı geldi sayı ise "+ num + "yeni bakiyeniz "+ balance);
                }
                else {
                    balance -=bet;
                    System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
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
