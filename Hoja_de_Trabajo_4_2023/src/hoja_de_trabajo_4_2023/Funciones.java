package hoja_de_trabajo_4_2023;    
import java.util.Scanner;

public class Funciones {
    
    Scanner sc = new Scanner (System.in);
    
    public int op;
    public double radio,volumen,area,perimetro;
    public double base,altura,largo;
    Figuras fg = new Figuras();
    
    //Funciones
    
    int menu_opciones(int op){
        /*Opcional
        if (op==5){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                System.out.println("Nos vemos pronto!");
                System.exit(0);
        }*/
        switch(op){
            case 1:
                System.out.println("_____Has elegido el area de la esfera_____");
                System.out.println("Por favor ingrese el valor del radio");
                radio=sc.nextDouble();
                fg.esfera(radio, volumen, area, perimetro);
            break;
            
            case 2:
                System.out.println("_____Has elegido el area del paralelepipedo_____");
                System.out.println("Por favor ingrese el valor de la base");
                base=sc.nextDouble();
                System.out.println("Por favor ingrese el valor del largo");
                largo=sc.nextDouble();
                System.out.println("Por favor ingrese el valor de la altura");
                altura=sc.nextDouble();
                fg.paralelepipedo(base, largo, altura, volumen, area, perimetro);
            break;
            
            case 3:
                System.out.println("_____Has elegido el area del cono_____");
                System.out.println("Por favor ingrese el valor del radio");
                radio=sc.nextDouble();
                System.out.println("Por favor ingrese el valor de la altura");
                altura=sc.nextDouble();
                fg.cono(radio,altura,volumen,perimetro,area);
            break;
            
            case 4:
                System.out.println("_____Has elegido el area del cilindro_____");
                System.out.println("Por favor ingrese el valor del radio");
                radio=sc.nextDouble();
                System.out.println("Por favor ingrese el valor de la altura");
                altura=sc.nextDouble();
                fg.cilindro(radio,altura,volumen,perimetro,area);
            break;
            
            case 5:
                System.out.println("Nos vemos pronto :D!");
            break;
            
            default: 
                System.out.println("Por favor seleccione una opción valida");
            break;
        }
        return 0;
    }
           
    //Metodos
    public void menu(){
        System.out.println("_____Areas de figuras_____");
        System.out.println("1.Esfera");
        System.out.println("2.Paralelepipedo");
        System.out.println("3.Cono");
        System.out.println("4.Cilindro");
        System.out.println("5.Salir");
        System.out.println("Ingresa una opcion");
    }
    
    //No funciona :c
    /*public void limpiarconsola()
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }1*/
}
