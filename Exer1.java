import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        int n1;
        Scanner LerTeclado = new Scanner(System.in);
        System.out.println("Digite o número: ");
        n1 = LerTeclado.nextInt();
        if (n1 >= 100 && n1 <= 200){
            System.out.println("Esta entre 100 e 200");
        }else
            System.out.println("Não esta entre 100 e 200");
    }
}
