
package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Recursion {

    public static void main(String[] args) {
    Integer max = 0;
    ArrayList<Integer> ints = new ArrayList();
    for(int i = 0; i < 10; i ++){
       ints.add((int) (Math.random() * 1000));
//        System.out.println((Math.random() * 1000));
     }
//        Collections.shuffle(ints);
        System.out.println(ints);
        
        for (int i = 0; i < ints.size(); i++) {
            if(ints.get(i) > max){
                max = ints.get(i);
            }
        }
        System.out.println("Max is: " + max);
    }
}
