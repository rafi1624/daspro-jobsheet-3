import java.util.Scanner;

public class HitungGajiBulanan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam kerja: ");
        double jumlahJamKerja = scanner.nextDouble();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = scanner.nextDouble();
        
        double gajiKotor = jumlahJamKerja * upahPerJam;
        double bonus = 0.10 * gajiKotor;
        double gajiDanBonusSebelumPajak = gajiKotor + bonus;
        double pajak = 0.05 * gajiDanBonusSebelumPajak;
        double gajiBersih = gajiDanBonusSebelumPajak - pajak;
        
        System.out.printf("Gaji Kotor: Rp %.2f%n", gajiKotor);
        System.out.printf("Bonus: Rp %.2f%n", bonus);
        System.out.printf("Gaji dan Bonus Sebelum Pajak: Rp %.2f%n", gajiDanBonusSebelumPajak);
        System.out.printf("Pajak: Rp %.2f%n", pajak);
        System.out.printf("Gaji Bersih: Rp %.2f%n", gajiBersih);
    }
}