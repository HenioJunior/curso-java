package boxing_unboxing;

public class Program {

    public static void main(String[] args) {

//        int x = 20;
//
//        Object obj = x;
//
//        System.out.println(obj);
//
//        int y = (int)obj; // os tipos não são necessariamente compativeis. Necessário o casting;
//
//        System.out.println(y);

        //Wrapper---------------------------------------------------------------------------------

        int x = 20;
        Integer obj = x;

        System.out.println(obj);

        int y = obj * 2;

        System.out.println(y);

    }
}