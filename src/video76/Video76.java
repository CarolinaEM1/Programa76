
package video76;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a[],b[],c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        System.out.println("Digite el primer arreglo");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero ");
            a[i] = teclado.nextInt();
        }
        System.out.println("Digite el segundo arreglo");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero ");
            b[i] = teclado.nextInt();
        }
        
        int j=0;
        for (int i=0;i<10;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        
        System.out.print("\nEl tercer arreglo es: ");
        for (int i=0;i<20;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        
    }
    
}
