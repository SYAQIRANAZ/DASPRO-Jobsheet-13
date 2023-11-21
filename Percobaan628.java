import java.util.Scanner;
public class Percobaan628 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,Vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan Lebar");
        l = input.nextInt();
        System.out.println("Masukkan Tinggi");
        t = input.nextInt();

        L=p*l;
        System.out.println("Luas Balok adalah "+L);


        Vol=p*l*t;
        System.out.println("Volume balok adalah "+Vol);
    }
    //Hitung Luas
    static int hitungLuas(int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }
    //Hitung Volume
    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
// Fungsi main
    public static void main(String  args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L, Vol;
        System.out.println("Masukkan Panjang");
        p =  input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan Tinggi");
        t = input.nextInt();
        L=hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " +L);
        Vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah "+Vol);
    }
}