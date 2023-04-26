package com.mycompany.palindromo;

/**
 *
 * @author brandon Hernandez Moreno
 * @email. beu7www@gmail.com
 */
import java.util.*;

public class Palindromo{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = entrada.nextInt();

        if (esPalindromo(numero)) {
            System.out.println(numero + " El número que ingresaste es un palindromo");
        } else {
            System.out.println(numero + " El número que ingresaste no es un palindromo");
        }
    }

    public static boolean esPalindromo(int numero) {
        Deque<Integer> cola = new ArrayDeque<>();
        int temp = numero;
        while (temp > 0) {
            cola.addLast(temp % 10);
            temp /= 10;
        }

        while (cola.size() > 1) {
            if (!cola.removeFirst().equals(cola.removeLast())) {
                return false;
            }
        }

        return true;
    }
}