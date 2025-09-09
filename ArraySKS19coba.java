import java.util.Scanner;
public class ArraySKS19coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 2, 3, 2, 3, 2, 1}; // Tambahkan jumlah SKS untuk masing-masing mata kuliah
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double totalBobotKaliSks = 0;
        int totalSks = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] >= 85) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A-";
                bobotNilai[i] = 3.7;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            }

            totalBobotKaliSks += bobotNilai[i] * sks[i]; // Hitung total bobot * SKS
            totalSks += sks[i]; // Hitung total SKS
        }

        double ipSemester = totalBobotKaliSks / totalSks;

        System.out.println("\n=======================");
        System.out.println("Hasil Konversi Nilai:");
        System.out.println("=========================");
        System.out.printf("%-40s %-10s %-10s %-10s %-10s\n", "MK", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-10d %-10.2f %-10s %-10.2f\n", mataKuliah[i], sks[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("======================");
        System.out.printf("Total SKS : %d\n", totalSks);
        System.out.printf("IP : %.2f\n", ipSemester);
    }
}
