package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenerucsExempleList {

    public static void main(String[] args) {

        //Exemplo sem Generics
        List listasemGanerics = new ArrayList();
        listasemGanerics.add("Elemento 1");
        listasemGanerics.add(10);


        //Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Iterando sobre a lista com Generics
        for(String elemento: listaGenerics){
            System.out.println(elemento);
        }

        //Iterando sobre a lista sem Generucs (necessário fazer cast)
        for(Object elemento : listasemGanerics){
            String str = (String) elemento;
            System.out.println(str);
         }

    }
}
