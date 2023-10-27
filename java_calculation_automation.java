import java.util.Scanner;
public class calculation_automation {

    //Função que calcula o dobro 
    public static int dobro (int n1) {
        int resultado;

        resultado = n1*2;
        return resultado;
    }

    //Função que calcula o maior
    public static int maior (int n1, int n2) {
        int maior;
        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }
        return maior;
    }

    //Função que calcula a media
    public static int media (int n1, int n2, int n3) {
        int media, soma;
        soma = n1+n2+n3;
        media = soma / 3;
        return media;
    }

    //Função que fatoriza um numero
    public static int fatoriza (int n1) {
        int mult;
        mult = 1;
        for (int i=1; i <= n1; i++) {
            mult = mult * i;
        }
        return mult;
    }

    //Função que soma a fatorização de um numero
    public static int fatosoma (int n1) {
        int soma;
        soma = 0;
        for (int i=1; i <= n1; i++) {
            soma = soma + i;
        }
        return soma;
    }

    //Tela do usuário
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);

        int alternativas;

        //Swich case com as opções para o usuário
        System.out.println ("O que você quer fazer?");
        System.out.println ("1 - Calcular o dobro de um número");
        System.out.println ("2 - Mostrar o maior de 2 números");
        System.out.println ("3 - Fazer a média de 3 números");
        System.out.println ("4 - Fatorização de um número");
        System.out.println ("5 - Soma entre 1 e um número");
        alternativas = input.nextInt ();

        //Execução das opções que puxa o resultado nas funções e retorna o resultado
        switch (alternativas)
        {
            case 1:
                int n1;
                System.out.println ("Qual número você quer dobrar?");
                n1 = input.nextInt ();
                System.out.println ("O dobro de " + n1 + " é " + dobro (n1));
                break;

            case 2:
                int n2;
                System.out.println ("Qual o primeiro número?");
                n1 = input.nextInt ();
                System.out.println ("Qual o segundo número?");
                n2 = input.nextInt ();
                System.out.println ("O maior número entre " + n1 + " e " + n2 + " é " + maior (n1, n2));
                break;
            case 3:
                int n3;
                System.out.println ("Qual o primeiro número?");
                n1 = input.nextInt ();
                System.out.println ("Qual o segundo número?");
                n2 = input.nextInt ();
                System.out.println ("Qual o terceiro número?");
                n3 = input.nextInt ();
                System.out.println ("A média de "+n1+", "+n2+" e "+n3+" é " + media (n1, n2, n3));
                break;
            case 4:
                System.out.println ("Qual número você quer fatorar?");
                n1 = input.nextInt ();
                System.out.println ("A fatorização é: ");
                for (int i = 1; i < n1; i++) {
                    System.out.print (i + "*");
                }
                System.out.println (n1 + " = " + fatoriza (n1));
                break;
            case 5:
                System.out.println ("Qual número você quer a soma entre ele e 1?");
                n1 = input.nextInt ();
                System.out.println ("O resultado é: ");
                for (int i = 1; i < n1; i++) {
                    System.out.print (i + "+");
                }
                System.out.println (n1 + " = " + fatosoma (n1));
                break;
        }
    }
}