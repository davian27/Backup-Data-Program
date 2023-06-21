package Tugas_Acc_Ujian;

public class Pattern {
    public static void main(String[] args) {

        int baris = 7;
        int kolom = 8;

        for (int i = 1; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (j == 0 || j == kolom - 1 || i == j)
                    System.out.print("*");

                else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
}
