package operaciones;

import java.util.Scanner;
public class Operaciones 
{
    public static void main(String[] args) 
    {
     Scanner entrada = new Scanner(System.in);
     
      int respuesta;
      int num1;
      int num2;
      float resultado;
      
      System.out.print("Ingresar primer numero:");
      num1=entrada.nextInt();
      
      System.out.print("Ingresar segundo numero:");
      num2=entrada.nextInt();
      
      System.out.println("ingrese un Numero de la operacion que desea");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Division");
      System.out.println("4. Multiplicacion");
      
      respuesta = entrada.nextInt();
      
      switch(respuesta)
           {
          case 1:
             resultado=num1+num2;
             System.out.println("La Suma es: " + resultado);
                break;
          case 2:
             resultado=num1-num2;
             System.out.println("La Resta es: " + resultado);
                break;
          case 3:
            if(num2!=0)
            {
             resultado=num1/num2;
             System.out.println("La Division es: " + resultado);
            }
            else
             System.out.println("no se puede dividir entre cero");
                break;
          case 4:
            resultado=num1*num2;
            System.out.println("La Multiplicacion es: " + resultado);
                break;
          default:
            System.out.println("resultado no valido");
                break;
               }
        }
    }
    
