import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        // Array satu dimensi untuk kode plat nomor
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array dua dimensi untuk nama kota
        String[] kota = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };

        // Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);

        // Mencari kota yang sesuai dengan kode plat nomor
        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.println("Kota dari plat nomor " + inputKode + " adalah " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        // Jika kode tidak ditemukan
        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

        // Menutup Scanner
        scanner.close();
    }
}
