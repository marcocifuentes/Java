package com.loiane.exercicios;

import java.util.Scanner;

/*
 * Faça um Programa que converta metros para centímetros.
 */

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor do metro: ");
		double metro = scan.nextDouble();

		double centimetro = metro * 100;
		
		System.out.println("");
		System.out.print("O valor do metro corresponde a: " + centimetro + " cm");
		
		
	}

}