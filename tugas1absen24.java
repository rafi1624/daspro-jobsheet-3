import java.util.Scanner;

public class tugas1absen24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tarifListrik = 1500;
        boolean penggunaanListrik;
        double totalTagihan, jumlahPenggunaan;

        System.out.println("Input penggunaan listrik : ");
        jumlahPenggunaan = input.nextDouble();

        penggunaanListrik = jumlahPenggunaan > 500;
        totalTagihan = tarifListrik * jumlahPenggunaan;
        System.out.println(" Jumlah penggunaan " +totalTagihan);
        System.out.println(" Apakah penggunaan listrik 500 " +penggunaanListrik);

    }

    
}