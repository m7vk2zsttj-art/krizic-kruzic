public class Ploca {
    char[][] polje = new char[3][3];
     public Ploca() {
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                    polje[i][j] = '-';
                }
            }
        }

        public void ispisiPlocu() {

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {
                    System.out.print(polje[i][j] + " ");
                }

                System.out.println();
            }
        }


}
