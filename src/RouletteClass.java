import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class RouletteClass implements CasinoInterface {

    Random random = new Random();
    int rouletteGuess = 0;
    int area = 0;
    int twoPlace = 0;
    int blackOrRed = 0;

    int balance = 100;
    int bet = 0;



    @Override
    public void RouletteGuess() {
        Random randomGuess = new Random();
        int num = randomGuess.nextInt(36);
        if (rouletteGuess == num){
            balance += 36*bet;
            System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
        }
        else {
            balance -= bet;
            System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " + num + " yeni bakiyeniz " + balance);
        }

    }

    @Override
    public void RouletteArea() {
        Random randomGuess = new Random();
        int num = randomGuess.nextInt(36);
        if (area == 1){
            if (num<=12 && num>0){
                balance+= 2*bet;
                System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
            }else{
                balance -=bet;
                System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
            }
        }else if (area == 2){
            if (num<=24 && num >=13){
                balance+= 2*bet;
                System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
            }else{
                balance -=bet;
                System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
            }
        } else if (area == 3) {
            if (num<=36 && num>=25){
                balance+= 2*bet;
                System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
            }else{
                balance -=bet;
                System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
            }

        }


    }

    @Override
    public void RouletteTwoPlace() {
        Random randomGuess = new Random();
        int num = randomGuess.nextInt(36);
        if (twoPlace==1){
            if (num<=36 && num>=19){
                balance+=bet;
                System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
            }
            else{
                balance -=bet;
                System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
            }
        } else if (twoPlace==2) {
            if (num<=18 && num>=1){
                balance+=bet;
                System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
            }
            else{
                balance -=bet;
                System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
            }

        }


    }

    @Override
    public void RouletteBlackOrRed() {
        int [] kirmizi = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
        LinkedList<Integer> Red = new LinkedList<Integer>();
        for(int k:kirmizi){
            Red.add(k);
        }

        int [] siyah = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
        ArrayList<Integer> Black = new ArrayList<Integer>();
        for(int s:siyah){
            Black.add(s);
        }

        Random randomGuess = new Random();
        int num = randomGuess.nextInt(36);
        if (blackOrRed == 1){
            if (Red.contains(num)){
                balance+=bet;
                System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
            }
            else {
                balance -=bet;
                System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);
            }

        } else if (blackOrRed == 2) {
            if (Black.contains(num)){
                balance+=bet;
                System.out.println("Winner winner doğru tahmin yaptınız sayı " + num + "yeni bakiyeniz "+ balance);
            }else {
                balance -=bet;
                System.out.println("Üzgünüm yaptığınız tahmin yanlış sayı " +num+ " yeni bakiyeniz "+ balance);

            }
        }


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
