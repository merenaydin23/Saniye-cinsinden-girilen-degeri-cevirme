import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Saniye cinsinden girilen değeri dakika,saat,gün,ay,yıl şeklinde dönüstürme
        System.out.println("Saniye cinsi girilen değerinin çevrilmesi programına hoş geldiniz.");
        Scanner klavye = new Scanner(System.in);
        float dk = 0;
        float saat=0;
        float gun=0;
        float ay=0;
        float yil=0;
float  saniye= klavye.nextFloat();
while(saniye>=60){
saniye=saniye-60;
dk++;
}
while(dk>=60){
    dk=dk-60;
    saat++;
}
while(saat>=24) {
    saat = saat - 24;
    gun++;
}
 while (gun>=30){
     gun=gun-30;
     ay++;
 }
while (ay>=12){
    ay=ay-12;
    yil++;
}
System.out.println(saniye+"saniye =");
System.out.println(dk+"dakika");
System.out.println(saat+"saat");
System.out.println(gun+"gün");
System.out.println(ay+"ay");
System.out.println(yil+"yil");



    }
}