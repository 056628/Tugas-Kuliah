import java.util.Scanner;

class MenghitungJumlahPerbaris {
    public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      
      int matriks[][] = new int[5][5];
      
      for (int baris = 0; baris <5; baris++){
        for (int kolom = 0; kolom <5; kolom++){
          matriks[baris][kolom] = n.nextInt();
        }
      }
      int res = 0;
       for (int baris = 0; baris <5; baris++){
        for (int kolom = 0; kolom <5; kolom++){
          res += matriks[baris][kolom];
          
        }
        System.out.println(res);
        res = 0;
       }
    }
}
