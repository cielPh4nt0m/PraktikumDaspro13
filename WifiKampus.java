import java.util.Scanner;

public class WifiKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Akses WiFi Kampus ===");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lain): ");
        String jenis = input.nextLine().toLowerCase();

        if (jenis.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenis.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = input.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses WiFi ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses WiFi ditolak");
        }

        input.close();
    }
}