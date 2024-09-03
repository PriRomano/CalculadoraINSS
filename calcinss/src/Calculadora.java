// escreva um programa em java que solicite dois números e exiba a soma,
//subtração, multiplicação e divisão desses números
 
// meu código GPT
import java.util.Scanner;
 
public class Calculadora {
    public static void main(String[] args) throws Exception {
        //esse objeto vai ler a entrada do usuário
        Scanner scanner = new Scanner (System.in);
 
        //solicita o imput do 1 número
        System.out.print ("Digite o primeiro número: ");
        double primeironum = scanner.nextDouble();
 
        // solicita o imput do 2 número
        System.out.print ("Digite o segundo número: ");
        double segundonum = scanner.nextDouble();
 
 
        //código do prof
        import java.util.Scanner;
        public static void calcular(); {
            float ent1;
            float ent2;
            Scanner sc = new Scanner (System.in);
 
            System.out.print("Digite o primeiro número: ");
            ent1 = sc.nextFloat();
            System.out.print ("Digite o segundo número: ");
            ent2 = sc.nextFloat();
 
            System.out.print ("A soma é: " + (ent1+ent2));
            System.out.print ("A subtração é: " + (ent1-ent2));
            System.out.print ("A multiplicação é: " + (ent1*ent2));
            System.out.print ("A divisão é: " + (ent1 / ent2));

        }
 
    }
}
