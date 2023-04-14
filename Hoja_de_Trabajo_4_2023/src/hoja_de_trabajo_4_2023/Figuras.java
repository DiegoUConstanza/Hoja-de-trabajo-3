package hoja_de_trabajo_4_2023;
import java.lang.Math;
import java.util.Scanner;

public class Figuras {
    
    Scanner sc = new Scanner(System.in);
    /*Esfera
    Paralepípedo
    Cono
    Cilindro*/
    double esfera(double radio, double volumen, double perimetro, double area){
        volumen = (4*Math.PI*Math.pow(radio,3)/3);
        System.out.println("El volumen es = " + volumen + " u^3");
        area = 4*Math.PI*Math.pow(radio,2);
        System.out.println("El area superficial es = " + area + " u^3");
        perimetro = 2*Math.PI*radio;
        System.out.println("El perimetro en un plano 2D es = " + perimetro + " u^3");
        
        return volumen;
    }
    
    double paralelepipedo(double base, double largo, double altura, double volumen, double perimetro, double area){
        volumen = base*largo*altura;
        System.out.println("El volumen es = " + volumen + " u^3");
        area = base*2+largo*2+altura*2;
        System.out.println("El area superficial es = " + area + " u^3");
        perimetro = (2*largo+2*altura)*4+(2*base+2*altura)*2;
        System.out.println("El perimetro en un plano 2D es = " + perimetro + " u^3");   
        
        return volumen;
    }
    
    double cono (double radio, double altura, double volumen, double perimetro, double area){
        volumen = (Math.PI*Math.pow(radio,2)*altura)/3;
        System.out.println("El volumen es = " + volumen + " u^3");
        area = Math.PI*Math.pow(radio,2) + 2*Math.PI*radio*Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2));
        System.out.println("El area superficial es = " + area + " u^3");
        perimetro = 4*Math.PI*radio + Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2));
        System.out.println("El perimetro en un plano 2D es = " + perimetro + " u^3");   
        //P =  4πr+ √h² + r²
        return volumen;
    }
    
    double cilindro (double altura, double radio, double volumen, double perimetro, double area){
        volumen = Math.PI*Math.pow(radio,2)*altura;
        System.out.println("El volumen es = " + volumen + " u^3");
        area = 2*Math.PI*Math.pow(radio,2) + 2*Math.PI*radio*altura;
        System.out.println("El area superficial es = " + area + " u^3");
        perimetro = 2*altura+2*radio + 2*Math.PI*radio;
        System.out.println("El perimetro en un plano 2D es = " + perimetro + " u^3");  
        
        return volumen;
    }
    
}
