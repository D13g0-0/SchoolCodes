
package com.mycompany.revisao;

import java.util.Scanner; 

public class ListaDeRevisao {
    
    public static void main(String[] args){
        
        Scanner GG = new Scanner (System.in);
        String Usuario;
        
        System.out.println("Qual seu nome?");
        Usuario=GG.next();
        
        System.out.print("Olá " +Usuario);
        System.out.println("! Seja bem vindo");
        System.out.println("----------------------------");
        
        String aluno;
        int a,b,c,d,resultado;
        
        System.out.println("Qual o seu nome?");
        aluno=GG.next();
        System.out.println("Digite a primeira nota: ");
        a=GG.nextInt();
        System.out.println("Digita a segunda nota: ");
        b=GG.nextInt();
        System.out.println("Digita a terceira nota: ");
        c=GG.nextInt();
        System.out.println("Digita a quarta nota: ");
        d=GG.nextInt();
        
        resultado = ((a+b+c+d) / 4);
        
        System.out.println("A soma dessas notas deu " +resultado);
        System.out.println("----------------------------");
        
        int num_tabuada,tab1,tab2,tab3,tab4,tab5,tab6,tab7,tab8,tab9,tab10;
        //eu sei q tô fazendo do modo mais chato mas tô com preguiça de pensar prof, são 8:30 ;--;
        System.out.println("Escolha um número: ");
        num_tabuada=GG.nextByte();
        tab1= num_tabuada * 1;
        tab2= num_tabuada * 2;
        tab3= num_tabuada * 3;
        tab4= num_tabuada * 4;
        tab5= num_tabuada * 5;
        tab6= num_tabuada * 6;
        tab7= num_tabuada * 7;
        tab8= num_tabuada * 8;
        tab9= num_tabuada * 9;
        tab10= num_tabuada * 10;
        
        System.out.println("A tabuada desse número é: " +tab1+" "+tab2+" "+tab3+" "+tab4+" "+tab5+" "+tab6+" "+tab7+" "+tab8+" "+tab9+" "+tab10+" ");
        System.out.println("----------------------------");
        
        int base, altura;
        double area;
        System.out.println("Qual é a medida da base?");
        base=GG.nextByte();
        
        System.out.println("Qual é a medida da altura?");
        altura=GG.nextByte();
        
        area = ((base*altura)/ 2);
        
        System.out.println("A area desse triangulo é: " +area);
        System.out.println("----------------------------");
        
        double milhas, km;
        System.out.println("Qual a quantidade de Km's? ");
        km=GG.nextByte();
        
        milhas = (km / 1.60934);
        System.out.println("Convertendo para milhas fica: " +milhas);
        System.out.println("----------------------------");
        
        int quantmeses,mes,result;
        //vou fazer como se todos os meses tivessem 30 dias
        mes = 30;
        System.out.println("Quantos meses vão ser convertidos para dias?");
        quantmeses=GG.nextInt();
        
        result= quantmeses * mes;
        
        System.out.println("São "+result+" dias");
        
        
        
        
    }
    
}
