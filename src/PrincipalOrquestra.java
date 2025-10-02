import java.util.Scanner;
public class PrincipalOrquestra {

    public static void main(String[] args) {
        Scanner fv = new Scanner(System.in);
        PrincipalOrquestra orquestra = new PrincipalOrquestra();
        Instrumentos instrumentos = new Instrumentos();
        while (true) {
            System.out.println(" ==== Olá, seja bem vindo a instrumentisssimos ==== ");
            System.out.println("Escolha uma das opções de instrumentos para cantar");
            System.out.println("Violão - (1)");
            System.out.println("Piano - (2)");
            System.out.println("Bateria - (3)");
            System.out.println("Cavaquinho - (4)");
            System.out.println("Sair - (5)");
            instrumentos.tocar = fv.nextInt();
            instrumentos.instrumento();
        }

    }
}