import java.util.Scanner;
class GanjilGenap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        if ( angka % 2 == 0 ) { // habis dibagi 2 = genap
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

    }
}