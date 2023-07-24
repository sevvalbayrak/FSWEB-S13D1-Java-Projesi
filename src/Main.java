import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("-------shouldWakeUp-------");

        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

        System.out.println("-------hasTeen-------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("-------isCatPlaying-------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("-------rectangleArea-------");
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Kısa kenarı giriniz:");
            double x = scan.nextDouble();
            System.out.println("Uzun kenarı giriniz:");
            double y = scan.nextDouble();
            System.out.println("Dikdörtgenin Alanı= " + area(x, y));
        }catch (Exception ex){
            System.out.println("Hatalı giriş yapıldı");
        }


        System.out.println("-------circleArea-------");
        try{
            System.out.println("Yarıçapı giriniz: ");
            double radius = scan.nextDouble();
            System.out.println("Dairenin Alanı= " + area(radius));
        } catch (Exception ex){
            System.out.println("Hatalı giriş yapıldı");
        }

    }

    public static boolean shouldWakeUp(boolean isBarking, int time){
        if(time<0 || time>23) return false;
        if(!isBarking) return false;
//        if(time<8 || time>=20) {
//            return true;
//        }
        return time <8 || time >= 20;
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        return (age1 >= 13 && age1 <= 19) ||
                (age2 >= 13 && age2 <= 19) ||
                (age3 >= 13 && age3 <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            return temp > 25 && temp <= 45;
        }
        return temp > 25 && temp <= 35;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            System.out.println("Kenar uzunlukları 0'dan büyük olmalıdır.");
            return -1;
        }
        return x * y;
    }

    public static double area(double radius) {
        if(radius < 0){
            System.out.println("Yarıçap 0'dan büyük olmalıdır.");
            return -1;
        }
        return radius * radius * Math.PI;
    }
}








