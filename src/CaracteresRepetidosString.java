import java.util.HashMap;
import java.util.Map;

public class CaracteresRepetidosString {

    public static void main(String[] args) {

        imprimirCaracteresDuplicados("nutricionista");


    }

    private static void imprimirCaracteresDuplicados(String palabra) {

        char[] caracteres=palabra.toCharArray();

        Map<Character,Integer> charmap=new HashMap<Character, Integer>();
        for (Character ch: caracteres){
            if(charmap.containsKey(ch)){

                charmap.put(ch,charmap.get(ch)+1);
            }else{
                charmap.put(ch,1);
            }
        }


    }


}
