import java.util.Scanner;

public class Tugas2 {
    
    // Fungsi untuk menghitung kecepatan (v = s / t)
    public static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }

    // Fungsi untuk menghitung jarak (s = v * t)
    public static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    // Fungsi untuk menghitung waktu (t = s / v)
    public static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan;
    }

    // Fungsi untuk menampilkan menu dan menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("\n=== Program Perhitungan Fisika ===");
            System.out.println("1. Hitung Kecepatan (v)");
            System.out.println("2. Hitung Jarak (s)");
            System.out.println("3. Hitung Waktu (t)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Hitung Kecepatan
                    System.out.print("Masukkan jarak (s) dalam meter: ");
                    double jarak1 = scanner.nextDouble();
                    System.out.print("Masukkan waktu (t) dalam detik: ");
                    double waktu1 = scanner.nextDouble();
                    System.out.println("Kecepatan (v) = " + hitungKecepatan(jarak1, waktu1) + " m/s");
                    break;

                case 2:
                    // Hitung Jarak
                    System.out.print("Masukkan kecepatan (v) dalam m/s: ");
                    double kecepatan2 = scanner.nextDouble();
                    System.out.print("Masukkan waktu (t) dalam detik: ");
                    double waktu2 = scanner.nextDouble();
                    System.out.println("Jarak (s) = " + hitungJarak(kecepatan2, waktu2) + " meter");
                    break;

                case 3:
                    // Hitung Waktu
                    System.out.print("Masukkan jarak (s) dalam meter: ");
                    double jarak3 = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (v) dalam m/s: ");
                    double kecepatan3 = scanner.nextDouble();
                    System.out.println("Waktu (t) = " + hitungWaktu(jarak3, kecepatan3) + " detik");
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu 1-4.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}

