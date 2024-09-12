import java.util.Scanner;

public class siakad24 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama, NIM;
    String kelas;
    byte absen;
    int nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS;
    double nilaiAkhir;

    System.out.println("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.println("Masukkan NIM: ");
    NIM = sc.nextLine();
    System.out.println("Masukkan kelas: ");
    kelas = sc.nextLine();
    System.out.println("Masukkan nomor absen: ");
    absen = sc.nextByte();
    System.out.println("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextInt();
    System.out.println("masukkan nilai tugas: ");
    nilaiTugas = sc.nextInt();
    System.out.println("Masukkan nilai UTS");
    nilaiUTS = sc.nextInt();
    System.out.println("Masukkan nilai UAS");
    nilaiUAS = sc.nextInt();

    nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30 ) + (nilaiUAS * 0.35);
     nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS) / 4;
    System.out.println("Nama: " + nama + " NIM:" + NIM);
    System.out.println("Kelas:" + kelas + " Absen:" + absen);
    System.out.println("Nilai Akhir:" + nilaiAkhir);

    
}
}