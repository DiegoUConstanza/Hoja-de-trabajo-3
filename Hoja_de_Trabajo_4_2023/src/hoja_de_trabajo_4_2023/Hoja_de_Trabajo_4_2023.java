package hoja_de_trabajo_4_2023;
import java.util.Scanner;

public class Hoja_de_Trabajo_4_2023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funciones fn = new Funciones();
        
        int op;
        
        do {
            fn.menu();
            op=sc.nextInt();
            fn.menu_opciones(op);
        } while(op!=5);
    }
    
}
