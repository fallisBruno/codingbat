package solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Logic2 {

    public static void main(String[] args) {
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a,b,c);
        Collections.sort(list);
        return list.get(0) - list.get(1) == list.get(1) - list.get(2);
    }

    public static int makeChocolate(int small, int big, int goal) {
        if(big * 5 + small < goal) return -1;
        if(goal % 5 > small) return -1;


        if(big * 5 > goal){
            return goal - (goal/5 * 5);
        }

        return goal - (big * 5);
    }

}
