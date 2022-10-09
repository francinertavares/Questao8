package Questao8;

import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

public class Exerc8 {
    public static void main(String[] args){
        float valor, hora, salario;

        Scanner fran = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora e quantas horas trabalho no mês");

        valor = fran.nextFloat();
        hora = fran.nextFloat();
        salario = valor * hora;

        System.out.println("O seu salário do mês será de: " + salario);

        fran.close();
    }

}
