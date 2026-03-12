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
                if (provjeriPobjedu(trenutniIgrac)) {

                    ploca.ispisiPlocu();
                    System.out.println("Pobjedio je igrac " + trenutniIgrac);

                    igraTraje = false;
                }

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
    public boolean provjeriPobjedu(char znak) {

        char[][] p = ploca.polje;

        for (int i = 0; i < 3; i++) {

            if (p[i][0] == znak && p[i][1] == znak && p[i][2] == znak) {
                return true;
            }

            if (p[0][i] == znak && p[1][i] == znak && p[2][i] == znak) {
                return true;
            }
        }

        if (p[0][0] == znak && p[1][1] == znak && p[2][2] == znak) {
            return true;
        }

        if (p[0][2] == znak && p[1][1] == znak && p[2][0] == znak) {
            return true;
        }

        return false;
    }
    }

