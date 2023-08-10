
/**
 * Salida
 */

import java.util.Scanner;


public class Lab {

    public static void main(String[] args) {
        int ns;
        int ks;
        System.out.println("─────────────────────────────");
        Scanner entrada = new Scanner(System.in);
        System.out.print("hola dame el valor n: ");
        ns = (entrada.nextInt());
        System.out.print("hola dame el valor k: ");
        ks = (entrada.nextInt());
        System.out.println("─────────────────────────────");
        partik(ns, ks);
        System.out.println("\n─────────────────────────────");
    }

    /**
     * @param n
     * @param k
     */
    static void partik(int n, int k){
        if(n % k == 0){
            Scanner numero = new Scanner(System.in);
            int[] vec = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("dame el " + (i+1) + " valor: ");
                vec[i] = numero.nextInt();
            }
            System.out.println("─────────────────────────────");
            int q = 0;
            int zero = 0;
            for(int j = 0; j < (n/k);j++){
            q = q + k;
            // bucle de para imprimir
                for(int v = q - k;v < q; v++){
                    System.out.print(vec[v] + " ");
                } 
                for(int y = q - k;y < q; y++){
                    if (vec[y] == 0) {
                        zero += 1;
                        System.out.print("V");
                        break;
                    }
                    else{
                        System.out.print("F");
                    }
                }  
                System.out.print("|");
            }
            if (zero == n/k) {
                System.out.print("True");
            }
            else{
                System.out.print("False");
            }
    }
}
}
