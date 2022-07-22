package com.mac.javabasico.exercicios;

/*
 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
   mesmo tipo e tamanho e com os elementos do vetor A multiplicados
   por 2, ou seja: B[i] = A[i] * 2.
 */

import java.util.Scanner;

public class ExercD002 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o tamanho do Vetor A: ");
		int tamanhoVetorA = scan.nextInt();

		System.out.println();

		int[] vetorA = new int[tamanhoVetorA];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do Vetor A: ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}

		System.out.println();

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++)
			System.out.print(vetorA[i] + " ");

		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++)
			System.out.print(vetorB[i] + " ");

	}

}
