import java.util.*; //O * significa tudo.
public class ParOuImpar{
    
    public static void main(String[] args) {
        Scanner valor = new Scanner (System.in); //O scanner só funciona com import e in é de entrada.
        System.out.println("Informe um número inteiro: ");
        int numero = valor.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número digitado é par!");
        }
        else {
            System.out.println("O número digitado é ímpar!");
        }
        System.exit(0);
    }
}