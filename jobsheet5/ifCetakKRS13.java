import java.util.Scanner;

public class ifCetakKRS13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = input.nextBoolean(); //Nama variabel yang benar

        if (uktLunas) { //Gunakan nama yang sama persis
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA ");
        }

         input.close(); // opsional, untuk menutup Scanner

    }
}
