//Import class untuk generate nomor Random dan Scanner untuk Input
import java.util.Random;
import java.util.Scanner;

public class KertasGuntingBatu {
    public static void main(String[] args){
        //Memanggil Scanner Input Baru
        Scanner input = new Scanner(System.in);
        //Looping Permainan
        while(true) {
            String[] kgb = {"k", "g", "b"}; //Array untuk Kertas(k), Gunting(g) dan Batu(b)
            String computer = kgb[new Random().nextInt(kgb.length)]; //Generate random k/g/b untuk Computer
            String player = ""; //Deklarasi variable player
            System.out.println("=================Selamat datang di Permainan Kertas, Gunting, Batu=================");
            System.out.println();

            //Pengulangan untuk inputan player, jika inputan selain k/g/b maka input ulang
            while (true) {
                System.out.print("Masukkan Pergerakan [Kertas(k) / Gunting(g) / Batu (b)]: ");
                player = input.nextLine(); //Input dari pemain
                if (player.equals("k") || player.equals("g") || player.equals("b")) {
                    break;
                }
                System.out.println("Input yang Anda masukkan salah, mohon Input antara [Kertas(k) / Gunting(g) / Batu (b)]");
            }
            //Output Hasil dari Pemain dan Komputer
            System.out.println("Output Pemain: " + player);
            System.out.println("Output Komputer: " + computer);

            //Proses untuk menghasilkan keputusan menang atau kalah
            if (player.equals(computer)) {
                System.out.println("Permainan Imbang");
            } else if (player.equals("k")) {
                if (computer.equals("g")) {
                    System.out.println("Anda Kalah");
                } else if (computer.equals("b")) {
                    System.out.println("Anda Menang");
                }
            } else if (player.equals("g")) {
                if (computer.equals("b")) {
                    System.out.println("Anda Kalah");
                } else if (computer.equals("k")) {
                    System.out.println("Anda Menang");
                }
            } else if (player.equals("b")) {
                if (computer.equals("k")) {
                    System.out.println("Anda Kalah");
                } else if (computer.equals("g")) {
                    System.out.println("Anda Menang");
                }
            }
            System.out.println("Apakah Anda ingin mengulang? (y/t)");
            String ulang = input.nextLine();
            if (!ulang.equals("y")){ //Jika pengguna menginput selain "y" maka permainan berakhir
                break;
            }
        }
    }
}