import java.util.Scanner;

public class AreaDeCirculo {

    public static void main(String[] args) {

      Scanner cs=new Scanner(System.in);
      System.out.println(" ingrese el area de circulo");
      int radio=cs.nextInt();

      double area=Math.PI*(radio*radio);

        System.out.println("el area del circulo es"+area);




    }
}
