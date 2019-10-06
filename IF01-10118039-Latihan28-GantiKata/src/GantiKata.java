
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang dapat mengganti kata yang diinginkan   
 */
public class GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimatawal, kalimatbaru, cari, ganti;
        Scanner masuk = new Scanner(System.in);
        //input
        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("Masukkan Kalimat\t: ");
        kalimatawal = masuk.nextLine();
        System.out.print("Ganti Kata\t\t: ");
        cari = masuk.nextLine();
        System.out.print("Menjadi Kata\t\t: ");
        ganti = masuk.nextLine();

        //output
        kalimatbaru = kalimatawal.replace(cari, ganti);
        System.out.println("\n======Hasil Formatting=====");
        System.out.printf("Kalimat awal\t: %s%n", kalimatawal);
        System.out.printf("Kalimat baru\t: %s%n", kalimatbaru);

    }

}
