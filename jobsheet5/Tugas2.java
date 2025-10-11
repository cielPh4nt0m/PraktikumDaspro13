import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input angka dari pengguna
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Proses pengecekan genap atau ganjil
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        input.close();
    }
}