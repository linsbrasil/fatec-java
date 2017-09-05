/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec;

/**
 *
 * @author a10ceeteps
 */
public class Fatec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Esta é minha primeira versão no GIT.");
       int numeroA = 12;
       int numeroB = 13;
       int soma;
       soma = numeroA + numeroB;
       System.out.println("O valor total é = " + soma);
       int tudo =100; 
       int i;
        for(i = 0; i < 10; i++){
            tudo += i;
            System.out.println("Valor" + (i + 1) + " = " + tudo);
        }
        System.out.println("Este foi nosso primeiro exemplo, até logo.");
    }

}
