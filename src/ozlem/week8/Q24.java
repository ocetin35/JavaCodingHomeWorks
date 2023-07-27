package ozlem.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//List_RemoveSomeValues
//Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
public class Q24 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            if(it.next() > 100){
                it.remove();
            }
        }

        System.out.println(list);



    }


}
