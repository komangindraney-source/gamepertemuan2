import java.util.Scanner;

public class ArenaPertarungan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Musuh[] gelombangMonster = new Musuh[3];
        gelombangMonster[0] = new slime();
        gelombangMonster[1] = new naga();
        gelombangMonster[2] = new zombi();

        System.out.println("===========================");
        System.out.println("Selamat datang di Arena RPG");
        System.out.println("===========================\n");

        boolean isBermain = true;

        while (isBermain) {

            System.out.println("Pilihan Monster:");

            for (int i = 0; i < gelombangMonster.length; i++) {
                System.out.println((i + 1) + ". "
                        + gelombangMonster[i].namaMusuh
                        + " (HP : "
                        + gelombangMonster[i].healthPoint + ")");
            }

            System.out.println("4. Kabur dari pertarungan");
            System.out.println("Pilih target monster (1/2/3) atau 4 untuk menyerah:");

            int pilihanTarget = input.nextInt();

            if (pilihanTarget == 4) {
                System.out.println("Anda menyerah dari pertarungan!");
                isBermain = false;
                continue;
            }

            if (pilihanTarget < 1 || pilihanTarget > 3) {
                System.out.println("Pilihan tidak valid!");
            } else {

                System.out.println("Masukkan kekuatan serangan anda (10 - 100):");
                int power = input.nextInt();

                System.out.println("\n>>> HASIL SERANGAN <<<");

                int indeksMonster = pilihanTarget - 1;

                gelombangMonster[indeksMonster].terimaDamage(power);
            }

            System.out.println("\n>>> GILIRAN MONSTER <<<");

            for (int i = 0; i < gelombangMonster.length; i++) {

                if (gelombangMonster[i].healthPoint > 0) {

                    gelombangMonster[i].Bersuara();
                    gelombangMonster[i].serangpemain();

                } else {

                    System.out.println(
                            gelombangMonster[i].namaMusuh
                            + " sudah mati dan tidak bisa menyerang.");
                }
            }

            System.out.println("----------------------");
        }

        input.close();

        System.out.println("Permainan berakhir");
    }
}