package com.loiane.exerc.modulo2;

import java.util.Scanner;

/*
 * Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.),
 * se digitar outro valor deve aparecer valor inválido.
 */

public class Exerc13 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana (1 a 7): ");
		int diaSemana = leia.nextInt();
		
		switch (diaSemana) {
		case(1): System.out.println("Domingo"); break;
		case(2): System.out.println("Segunda"); break;
		case(3): System.out.println("Terça"); break;
		case(4): System.out.println("Quarta"); break;
		case(5): System.out.println("Quinta"); break;
		case(6): System.out.println("Sexta"); break;
		case(7): System.out.println("Sábado"); break;
		default: System.out.println("Valor inválido!!");
		}
	}

}
