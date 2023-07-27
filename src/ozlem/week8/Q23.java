package ozlem.week8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// List_RemoveNameAhmed
//Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
//Write a java operation to remove all the names named Ahmed
public class Q23 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }


        System.out.println("list = " + list);

    }
}