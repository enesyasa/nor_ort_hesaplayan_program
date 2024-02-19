import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //değişkenleri oluşturma

        int  mat,fizik,kimya,turkce,tarih,muzik;
        //Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //kullanıcı değerlerini al
        System.out.print("matematik notunuz:");
        mat =inp.nextInt();

        System.out.print("fizik notunuz:");
        fizik =inp.nextInt();

        System.out.print("kimya notunuz:");
        kimya =inp.nextInt();

        System.out.print("turkce notunuz:");
        turkce =inp.nextInt();

        System.out.print("tarih notunuz:");
        tarih =inp.nextInt();

        System.out.print("muzik notunuz: ");
        muzik =inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);

        double ort= toplam/6.0;

        System.out.println("ortalamanız :"+ort);


        // Koşullu ifade ile sınıf geçme durumunu kontrol et
        String durum = (ort > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);


    }

}
