/**
 * Percobaan528
 */
public class Percobaan528 {
    static void Tampil(String str, int... a){
        System.out.println("String: "+str);
        System.out.println("Jumlah argmen/paramater: "+a.length);

        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
    Tampil("Daspro 2019", 100, 200);
    Tampil("Teknologi Informasi");
    Tampil("Polinema");
    }
}