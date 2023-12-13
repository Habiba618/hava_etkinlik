import java.util.Scanner;

public class Main {
//    Koşullar :
//    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    public static void main(String[] args) {

        double hava;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hava kac derece? ");
        hava = sc.nextDouble();
        if (hava<5){
            System.out.println("Kayak yapmaya git");
        } else if (hava>=5 && hava<=15) {
            System.out.println("Sinemaya git");
        } else if (hava>=15 && hava<=25) {
            System.out.println("Piknik yap");
        }else {
            System.out.println("Yuz");
    }
}}
