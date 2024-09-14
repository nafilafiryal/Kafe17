<<<<<<< HEAD
import java.util.Scanner;

/**
 * Kafe17
 */
public class Kafe17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jumlahKopi, jumlahTeh, jumlahRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        double totalHarga;
        double nominalBayar;

        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi:");
        jumlahKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jumlahTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jumlahRoti = input.nextInt();

        totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (jumlahRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jumlahKopi + " kopi, " + jumlahTeh + " teh, " + jumlahRoti + " roti");
        System.out.println("Nominal bayar RP " + nominalBayar);


    }
=======
import java.util.Scanner;

/**
 * Kafe17
 */
public class Kafe17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jumlahKopi, jumlahTeh, jumlahRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        double totalHarga;
        double nominalBayar;

        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi:");
        jumlahKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jumlahTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jumlahRoti = input.nextInt();

        totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (jumlahRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jumlahKopi + " kopi, " + jumlahTeh + " teh, " + jumlahRoti + " roti");
        System.out.println("Nominal bayar RP " + nominalBayar);


    }
>>>>>>> 72e86a131c9e5525645f429186864773f93e6208
}