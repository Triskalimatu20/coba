public class Fungsi19 {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12}, 
            {2, 10, 10, 5},  
            {5, 7, 12, 9}   
        };


        int[] harga = {75000, 50000, 60000, 10000}; 
        int[] bungaMati = {-1, -2, 0, -5}; 

        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatanCabang(stock[i], harga);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }

        System.out.println("\nTotal stok setiap jenis bunga:");
        int[] totalStock = hitungTotalStock(stock);
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < totalStock.length; i++) {
            System.out.println(namaBunga[i] + ": " + totalStock[i]);
        }
        System.out.println("\nStock setelah pengurangan bunga mati:");
        int[][] stockSetelahPengurangan = kurangiStock(stock, bungaMati);
        for (int i = 0; i < stockSetelahPengurangan.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + ": ");
            for (int j = 0; j < stockSetelahPengurangan[i].length; j++) {
                System.out.print(stockSetelahPengurangan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int hitungPendapatanCabang(int[] stockCabang, int[] harga) {
        int pendapatan = 0;
        for (int i = 0; i < stockCabang.length; i++) {
            pendapatan += stockCabang[i] * harga[i];
        }
        return pendapatan;
    }
    public static int[] hitungTotalStock(int[][] stock) {
        int[] totalStock = new int[stock[0].length];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                totalStock[j] += stock[i][j];
            }
        }
        return totalStock;
    }

    public static int[][] kurangiStock(int[][] stock, int[] bungaMati) {
        int[][] updatedStock = new int[stock.length][stock[0].length];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                updatedStock[i][j] = stock[i][j] + bungaMati[j];
                if (updatedStock[i][j] < 0) {
                    updatedStock[i][j] = 0; 
                }
            }
        }
        return updatedStock;
    }
}
