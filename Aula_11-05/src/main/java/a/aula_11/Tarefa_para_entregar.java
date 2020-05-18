package a.aula_11;

import java.util.Scanner;

public class Tarefa_para_entregar {
    
    public static void main(String[] args){
        
        Scanner A = new Scanner(System.in);
        
        int NumeroEscolhido, div;
        System.out.println("Por favor, digite um número qualquer: ");
        NumeroEscolhido=A.nextInt();
        
        div = NumeroEscolhido % 2;
        
        if(NumeroEscolhido % 2 == 0)
        System.out.println("É par !");

        else
        System.out.println("É impar!");

        System.out.println("--------------------");
        
        int ano;
        System.out.println("Digite um ano: ");
        ano=A.nextInt();
        
        if (ano==2020)
            System.out.println(+ano+" é o presente");
        else{ 
            if (ano>2020)
                System.out.println(+ano+" é do futuro");
            else
                System.out.println(+ano+" é do passado");
            }
        System.out.println("--------------------");
        
        double nota1, nota2, media;
        String nome;
        System.out.println("Qual seu nome?");
        nome=A.next();
        
        System.out.println("Qual sua primeira nota?");
        nota1=A.nextDouble();
        System.out.println("Qual sua segunda nota?");
        nota2=A.nextDouble();
        
        media= (nota1 / nota2);
        
        if(media>0.00 && media<3.99){
            System.out.println("Nome: "+nome+" Média: "+media+" Situação: Reprovado");
        }
        else{
            if (media>=4.00 && media<=5.99){
            System.out.println("Nome: "+nome+" Média: "+media+" Situação: Recuperação");
            }
            else{
                if(media>=6.00 && media<=10.00){
                System.out.println("Nome: "+nome+"/ Média: "+media+"/ Situação: Aprovado");
                }
            }
        }
    }
    
}
