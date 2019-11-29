/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author ipampillonvieitez
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static boolean p =false;
    public static void main(String[] arg) {
        // TODO code application logic here
        int numerodeDigitos = 0;
        int numerodeVecesDigitos = 0;
        numerodeDigitos = Integer.parseInt(arg[0]);
        if (numerodeDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int valordelaDivision = 1; valordelaDivision <= 99999; valordelaDivision++) {
            int divisionEntera = valordelaDivision;
            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            numerodeVecesDigitos = contador;

            if (numerodeVecesDigitos == numerodeDigitos) {
                if (valordelaDivision < 4) {
                    p = true;
                } else {
                    if (valordelaDivision % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (valordelaDivision - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }
                        while (i1 <= limite) {
                            if (valordelaDivision % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(valordelaDivision);
                }
            }
        }
    }
    
}
