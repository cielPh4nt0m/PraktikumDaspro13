import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Akses Perpustakaan ===");
        System.out.print("Apakah Anda mahasiswa aktif? (ya/tidak): ");
        String aktif = input.nextLine().toLowerCase();

        System.out.print("Apakah Anda sudah registrasi online? (ya/tidak): ");
        String registrasi = input.nextLine().toLowerCase();

        if (aktif.equals("ya") || registrasi.equals("ya")) {
            System.out.println("Akses perpustakaan diberikan.");
        } else {
            System.out.println("Akses perpustakaan ditolak.");
        }

        input.close();
    }
}
