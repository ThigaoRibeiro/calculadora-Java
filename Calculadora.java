import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Calculadora {
    
    public float soma(float n1 , float n2){
            return n1 + n2;
        }    
    public float subtracao(float n1 , float n2){
            return n1 - n2;
        }    
    public float multiplicacao(float n1 , float n2){
            return n1 * n2;
        }    
    public float divisao(float n1 , float n2){
            return n1 / n2;
        }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Calculadora c = new Calculadora();
        
        float n1;
        float n2;   
        char opcao;
        float resultado;        
        Scanner ler = new Scanner (System.in);            
        
        
do {
    System.out.println("==========Calculadora==========");        

    System.out.print("informe o 1º número: ");
        n1 = ler.nextFloat();        
     System.out.print("Informe o 2º número: ");
        n2 = ler.nextFloat();

    System.out.println("Informe qual a operação desejada:");        
    System.out.println("Para somar escolha: + ");
    System.out.println("Para subtrair escolha: - ");
    System.out.println("Para multiplicar escolha: *");
    System.out.println("Para dividir escolha: /");
    System.out.println("Para sair escolha: 0");
    opcao = (char) System.in.read();
                
        switch(opcao){
        case '+':
            resultado = c.soma(n1, n2);
            System.out.println("O resultado da soma é" +resultado);
        break;
            
        case '-':
            resultado = c.subtracao(n1, n2);
            System.out.println("O resultado da subtração é" +resultado);
        break;
            
        case '*':
            resultado = c.multiplicacao(n1, n2);
            System.out.println("O resultado da multiplicação é" +resultado);
        break;
            
        case '/':
            resultado = c.divisao(n1, n2);
            System.out.println("O resultado da divisão é" +resultado);
        break;
                
        case '0':
            System.out.println("Saindo da calculadora...");
        break;
            
        default:
            System.out.println("Opção inválida! Favor escolher uma das opções indicadas anteriormente!");
               }
}while (opcao !='0');
       }
    }