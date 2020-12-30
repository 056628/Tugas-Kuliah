import java.util.Scanner;

public class LulusatauGagal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();
        if (nilai > 55) {
            System.out.println("LULUS");
        } else {
            System.out.println("GAGAL");
        }

    }
}