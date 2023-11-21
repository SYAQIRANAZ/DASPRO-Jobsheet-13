import java.util.Scanner;

/**
 * ModifUcapanTerimaksih_28
 */
public class ModifUcapanTerimaksih_28{
    public static String PenerimaUcapan(){
        Scanner sc28 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc28.nextLine();
        sc28.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you for being the best teacher in the world. \n " + 
                "you inspired in me a love for learning and made me feel like I could ask you everything");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan("Terima Kasih telah membantu kesulitanku. Semoga selalu sehat dan bahagia selalu ><");
    }
}