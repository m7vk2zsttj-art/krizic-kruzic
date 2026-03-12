import java.util.Scanner;

public class Igra {

    Ploca ploca = new Ploca();
    Scanner scanner = new Scanner(System.in);

    char trenutniIgrac = Igrac.PLAYER1;

    public void pokreni() {

        boolean igraTraje = true;

        while (igraTraje) {

            ploca.ispisiPlocu();

            System.out.println("Igrac " + trenutniIgrac + " je na potezu");

            System.out.print("Unesi red (0-2): ");
            int red = scanner.nextInt();

            System.out.print("Unesi stupac (0-2): ");
            int stupac = scanner.nextInt();

            if (ploca.polje[red][stupac] == '-') {

                ploca.polje[red][stupac] = trenutniIgrac;

                if (trenutniIgrac == Igrac.PLAYER1) {
                    trenutniIgrac = Igrac.PLAYER2;
                } else {
                    trenutniIgrac = Igrac.PLAYER1;
                }

            } else {
                System.out.println("Polje je zauzeto!");
                scanner.close();
            }

        }
    }
    }

