package _10_memoria_arrays_lista._95_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println("-------------------------------------------");
        System.out.println("Adicionando itens na lista:");
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Henry");
        list.add("Ferdinand");
        list.add("Fabian");
        list.add("Henio");
        list.add(2, "Marco");//adicionar na posicao2

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------------------------");

        System.out.println("Tamanho da lista: " + list.size());

        System.out.println("-------------------------------------------");

        System.out.println("Removendo itens da lista...");
        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("-------------------------------------------");
        System.out.println("Lista atualizada:");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob")); //Localizar o indice;
        System.out.println("Index of Marco: " + list.indexOf("Marco"));//-1 no caso de não existir na lista;

        System.out.println("-------------------------------------------");

        //Declarar uma nova lista -> List<String> result =

        //Converter a lista para stream -> list.stream()

        //Chamar a função filter ->  .filter(x -> x.charAt(0) == 'A')

        //Connverter de stream para list -> .collect(Collectors.toList());

        System.out.println("Filtrar os nomes iniciados com H");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Filtrar os nomes que atendam a um predicado");

        String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("-------------------------------------------");

        sc.close();
    }
}
