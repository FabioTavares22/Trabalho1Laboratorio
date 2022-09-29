package trabalho;

import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {
		Scanner poli = new Scanner(System.in);
		int menu = 0;
		do {
			menu();
			menu = poli.nextInt();
			if(menu == 1) {
				poligonoRegular();
			} else if(menu == 2) {
				poligonoIrregular();
			} else if(menu == 3) {
				poligono2p1();
			} else if(menu == 4) {
				poligonodd();
			} else if(menu == 9) {
				System.out.println("Obrigado por utilizar nossa calculadora de polígonos!");
			}
		}while(menu != 9);
	}

	private static void poligono2p1() {
		Scanner poli3 = new Scanner(System.in);
		System.out.print("Informe o valor da base maior: ");
		int b1 = poli3.nextInt();
		System.out.print("Informe o valor da base menor: ");
		int b2 = poli3.nextInt();
		System.out.print("Informe o valor da altura: ");
		int a = poli3.nextInt();
		if(b1 < b2) {
			System.out.println("Algo está errado! A primeira base não é menor que a segunda, informe primeiro o valor da maior base.");
		}else {
			int area = ((b1 + b2) * a) / 2;
			System.out.println("A área do polígono com 2 bases e 1 altura é igual a: " + area);
		}
	}

	private static void poligonodd() {
		Scanner poli4 = new Scanner(System.in);
		System.out.print("Informe o valor da diagonal maior: ");
		int d1 = poli4.nextInt();
		System.out.print("Informe o valor da diagonal menor: ");
		int d2 = poli4.nextInt();
		if(d1 < d2) {
			System.out.println("Algo está errado! O primeira diagonal não é menor que a segunda, informe primeiro o valor da maior diagonal.");
		} else {
			int area = (d1 * d2) / 2;
			System.out.println("A área do polígono com 2 diagonais é igual a: " + area);
		}
	}

	private static void poligonoRegular() {
		Scanner poli1 = new Scanner(System.in);
		System.out.print("Informe o valor da base do polígono: ");
		int b = poli1.nextInt();
		System.out.print("Informe o valor da altura do poligono: ");
		int h = poli1.nextInt();
		int area = b * h;
		System.out.println("A área do Polígono Regular é igual a: " + area);
	}

	private static void poligonoIrregular() {
		System.out.println("Caso seu polígono não tenha 5 coordenadas informe 0 para as coordenadas inexistentes.");
		Scanner poli2 = new Scanner(System.in);
		System.out.print("Informe a coordenada A1: ");
		int a1 = poli2.nextInt();
		System.out.print("Informe a coordenada A2: ");
		int a2 = poli2.nextInt();
		System.out.print("Informe a coordenada B1: ");
		int b1 = poli2.nextInt();
		System.out.print("Informe a coordenada B2: ");
		int b2 = poli2.nextInt();
		System.out.print("Informe a coordenada C1: ");
		int c1 = poli2.nextInt();
		System.out.print("Informe a coordenada C2: ");
		int c2 = poli2.nextInt();
		System.out.print("Informe a coordenada D1: ");
		int d1 = poli2.nextInt();
		System.out.print("Informe a coordenada D2: ");
		int d2 = poli2.nextInt();
		System.out.print("Informe a coordenada E1: ");
		int e1 = poli2.nextInt();
		System.out.print("Informe a coordenada E2: ");
		int e2 = poli2.nextInt();
		int calc1 = (a1 * b2) + (b1 * c2) + (c1 * d2) + (d1 * e2) + (e1 * a2);
		int calc2 = (a2 * b1) + (b2 * c1) + (c2 * d1) + (d2 * e1) + (e2 * a1);
		if( calc1 < 0) {
			int refactor1 = calc1 * -1;
			int calc = (refactor1 + calc2) / 2;
			System.out.println("A área do Polígono Irregular com 5 coordenadas é igual a: " + calc);
		} else if (calc2 < 0) {
			int refactor2 = calc2 * -1;
			int calc3 = (refactor2 + calc1) / 2;
			System.out.println("A área do Polígono Irregular com 5 coordenadas é igual a: " + calc3);
		} else if(calc1 > 0 && calc2 > 0) {
			int calcTotal1 = (calc1 + calc2) / 2;
			System.out.println("A área do Polígono Irregular com 5 coordenadas é igual a: " + calcTotal1);
		}
	}

	public static void menu() {
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("1- Polígono Triângulo");
		System.out.println("2- Polígono Quadrilatero Irregular com 5 Coordenadas");
		System.out.println("3- Polígono Trapézio");
		System.out.println("4- Polígono Losango");
		System.out.println("9- Sair");
	}

}
