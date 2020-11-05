import java.util.Arrays;

public class numeroFaltante {

    public static void main(String[] args) {

        int [] arreglo=new int[]{1,2,3,5};

        int desaparecido=getNumeroDesaparecido(arreglo,5);
        System.out.printf("numeroFaltante.main en arreglo: " + desaparecido);


    }

    private static int getNumeroDesaparecido(int [] numeros,int totalCount) {

        int sumaEsperada=totalCount * ((totalCount + 1)/2);
        int actualSum=0;
        for (int i: numeros){
            actualSum +=i;
        }
        return  sumaEsperada-actualSum;


    }

}
