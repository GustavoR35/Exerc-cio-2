/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.io.InputStream;
import java.util.Scanner;


public class Atividade2 {

   
    public static void main(String[] args) {
String nome;
float nota1,nota2,nota3,media;
Scanner entrada;
entrada = new Scanner(System.in);
System.out.print("Informa o nome do Aluno: ");
nome = entrada.next();
System.out.println("Informa a primeira nota: ");
nota1 = entrada.nextFloat();
System.out.println("Informa a segunda nota: ");
nota2 = entrada.nextFloat();
System.out.println("Informa a terceira nota: ");
nota3 = entrada.nextFloat();
media = (nota1+nota2+nota3)/3;
System.out.printf("O Aluno:"+nome+"\nmedia:"+media);



    }

    private static Scanner Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
