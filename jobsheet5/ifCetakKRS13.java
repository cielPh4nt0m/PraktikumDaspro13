import java.util.Scanner;

public class ifCetakKRS13 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false):");
        boolean uktLunas = input.nextBoolean(); //Nama variabel yang benar

        // Modifikasi IF-ELSE menjadi Ternary Operator
        String hasil = (uktLunas) ? "KRS berhasil dicetak." : "KRS tidak dapat dicetak karena UKT belum lunas.";
        System.out.println(hasil);


        if (uktLunas) { //Gunakan nama yang sama persis
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA ");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        
        }

         input.close(); // opsional, untuk menutup Scanner

    }
}
