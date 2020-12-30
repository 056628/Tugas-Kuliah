import java.util.Scanner;
class GarisPersegi {
  
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
  int building= input.nextInt();
      
for (int i = 1; i<=building; i++) {
for (int j = 1; j<=building; j++) 
        {
        if ((j==1||j==building)||(i==1||i==building))
        System.out.print("#");
        else
        System.out.print("");
        }
        System.out.println();
        }
            } 
        }
