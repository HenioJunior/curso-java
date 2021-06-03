package tipos_curinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

//        List<Object> myObjs = new ArrayList<Object>();
//        List<Integer> myNumbers = new ArrayList<Integer>();
//        myObjs = myNumbers; // erro de compilação

//        List<?> myObjs = new ArrayList<Object>();
//        List<Integer> myNumbers = new ArrayList<Integer>();
//        myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
