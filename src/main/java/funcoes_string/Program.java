package funcoes_string;

public class Program {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";
        System.out.println("Original: -" + original + "-");

        System.out.println("---------------------------");


        String s01 = original.toLowerCase();
        System.out.println("ToLowerCase: -" + s01 + "-");

        System.out.println("---------------------------");


        String s02 = original.toUpperCase();
        System.out.println("ToUpCase: -" + s02 + "-");

        System.out.println("---------------------------");


        String s03 = original.trim(); //Elimina os espaços nos cantos da String
        System.out.println("Trim: -" + s03 + "-");

        System.out.println("---------------------------");


        String s04 = original.substring(2); //Caracter da posição 02 em diante
        System.out.println("Substring(2): -" + s04 + "-");

        System.out.println("---------------------------");


        String s05 = original.substring(2, 9);  //Recortar apartir do caracter 02 e abaixo do 09
        System.out.println("Substring(2 a 9): -" + s05 + "-");

        System.out.println("---------------------------");


        String s06 = original.replace('a', 'x');
        System.out.println("Replace('a', 'x'): -" + s06 + "-");

        System.out.println("---------------------------");


        String s07 = original.replace("abc", "xy");
        System.out.println("Replace('abc', 'xy'): -" + s07 + "-");

        System.out.println("---------------------------");

        int i = original.indexOf("H");
        System.out.println("Index of 'H': " + i);

        System.out.println("---------------------------");


        int j = original.lastIndexOf("bc");
        System.out.println("Last Index of 'bc': " + j);

        System.out.println("---------------------------");
        System.out.println();


        //Operacao Split
        System.out.println("Operacao Split:");

        String s = "potato apple lemon";

        String[] vect = s.split(" ");

//		String word1 = vect[0];
//		String word2 = vect[1];
//		String word3 = vect[2];
//
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
