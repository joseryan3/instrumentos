import  java.util.Scanner;
public class Instrumentos {
    Scanner vj = new Scanner(System.in);
    int tocar;

        public void instrumento () {

        switch (tocar) {
            case 1:
                System.out.println("O violão faz " + Violão.tocar());

                break;

            case 2:

                System.out.println("O piano faz " + Piano.tocar());
                break;


            case 3:

                System.out.println("A bateria faz " + Bateria.tocar());
                break;


            case 4:
                System.out.println("O mestre cavaquinho faz" + Cavaquinho.tocar());

                break;


            case 5:
                System.out.println("saindo....");
                System.exit(0);
                break;
            default:
                System.out.println("digite uma das opções descritas");
        }
        }

        }






