/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2dieroll;
import java.util.Random;
/**
 *
 * @author Jaswant Singh Samra
 */
public class Lab2DieRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUMBER = 10000;
        Random generator = new Random();
        Integer die1Value = 0, die2Value = 0, count = 0, snakeEyes = 0, twos = 0, threes = 0,
                fours = 0, fives = 0, sixes = 0;
        for(int i = 0; i < NUMBER; i ++){
        die1Value = generator.nextInt(6) + 1;
        die2Value = generator.nextInt(6) + 1;
        System.out.println("You have rolled: " + die1Value + " and " + die2Value + ".");
             if (die1Value.equals(1) && die2Value.equals(1)){
                 snakeEyes ++;
            } else if (die1Value.equals(2) && die2Value.equals(2)){
                 twos ++;
            } else if (die1Value.equals(3) && die2Value.equals(3)){
                 threes++;
            } else if (die1Value.equals(4) && die2Value.equals(4)){
                 fours ++;
            } else if (die1Value.equals(5) && die2Value.equals(5)){
                 fives ++;
            } else if (die1Value.equals(6) && die2Value.equals(6)){
                sixes ++;
            }
        }
       
        do{
            count ++;
        }while(count <= NUMBER);
        System.out.println("You have rolled " + count + " times.");
       
        System.out.println ("You rolled snake eyes " +
                    snakeEyes + " out of " +
                    count + " rolls.");
System.out.println ("You rolled double twos " +
                    twos + " out of " + count +
                    " rolls.");
System.out.println ("You rolled double threes " +
                    threes + " out of " + count +
                    " rolls.");
System.out.println ("You rolled double fours " +
                    fours + " out of " + count +
                    " rolls.");
System.out.println ("You rolled double fives " +
                    fives + " out of " + count +
                    " rolls.");
System.out.println ("You rolled double sixes " +
                    sixes + " out of " + count +
                    " rolls.");
    }
    private int die1Value, die2Value, snakeEyes, twos, threes, fours, fives, sixes;

    public void setDie1Value(int die1Value){
        this.die1Value = die1Value;
    }
    public int getDie1Value(int die1Value){
        return this.die1Value;
    }
    public void setDie2Value(int die2Value){
        this.die2Value = die2Value;
    }
     public int getDie2Value(int die2Value){
        return this.die2Value;
    }
    public void setSnakeEyes(int snakeEyes){
        this.snakeEyes = snakeEyes;
    }
     public int getSnakeEyes(int snakeEyes){
        return this.snakeEyes;
    }
     public void setTwos(int twos){
        this.twos = twos;
    }
     public int getTwos(int twos){
        return this.twos;
    } 
     public void setThrees(int threes){
        this.threes = threes;
    }
     public int getThrees(int threes){
        return this.threes;
    }
     public void setFours(int fours){
        this.fours = fours;
    }
     public int getFours(int fours){
        return this.fours;
    }
    public void setFives(int fives){
        this.fives = fives;
    }
     public int getFives(int fives){
        return this.fives;
    }
    public void setSixes(int sixes){
        this.sixes = sixes;
    }
     public int getsixes(int sixes){
        return this.sixes;
    }
}
