package dio.java.desafio.desafio2;
import java.util.Scanner;
public class Problem {

    public static class Desafio {
        public void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            while ( leitor.hasNext()) {
                String[] relogio = leitor.nextLine().split(":");
                int hora = Integer.parseInt(relogio[0]);
                int min = Integer.parseInt(relogio[1]);
                switch ( hora) {
                    case(7): System.out.println("Atraso maximo: " + min); break;
                    case(8): System.out.println("Atraso maximo: " +  (min + 60)        ); break;
                    case(9): System.out.println("Atraso maximo: " +   (120+min)        ); break;
                    default: System.out.println("Atraso maximo: 0");
                }
            }
        }

    }
}
