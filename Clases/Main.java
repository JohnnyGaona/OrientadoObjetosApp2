package Clases;
import java.util.Scanner;
import Interfaces.Operaciones;
import Interfaces.OperacionesAhorro;
import java.util.*;

class Main {
   
   
  public static void main(String[] args) {
  int ans =0;
  float interes;
  float Saldo = 0;
	int NCta;
  String Cedula;
	String Nombre;
  float Costo;
  Scanner ing = new Scanner (System.in);   
  Operaciones op1 = new OperacionesAhorro();
  Cuenta obj; 
    List <Cuenta> cta = new ArrayList<Cuenta>();
  
    
    
    do{
      op1.añadir();
      System.out.println("Bienvenido ");
      System.out.println("Por favor seleccione el tipo de cuenta...");
      System.out.println("1) Ahorro / 2) Corriente / 3) Mostrar las cuentas /4) Mostrar Cuantas de ahorro /5) Mostrar cuentas corrientes / 6) Salir ");
        ans = ing.nextInt(); 
      
    if (ans != 3 && ans != 4){
      System.out.print("Ingrese nombre del titula: ");
        Nombre = ing.next();
      System.out.print("Ingrese cedula del titula: ");
        Cedula = ing.next();
      System.out.print("Ingrese numero Cta. del titula: ");
        NCta = ing.nextInt();
      System.out.print("Ingrese saldo del titula: ");
        Saldo = ing.nextFloat();
    if(ans==1){
      System.out.print("Ingrese interes del titula: ");
        interes = ing.nextFloat();
      obj = new Ahorros(interes, Saldo, NCta, Cedula, Nombre);
      obj.calcularPorcentaje();
      cta.add(obj);
              
    }else{
      
      System.out.print("Ingrese costo del titula: ");
        Costo = ing.nextFloat();
      obj = new Corrientes(Costo, Saldo, NCta, Cedula, Nombre);
      
      obj.calcularPorcentaje();
      cta.add(obj);
    }
   }

      if(ans == 3){
      if (!cta.isEmpty()){
      System.out.println(cta.toString());
      }else{
        System.out.println("Aun no hay cuentas.....");
      }
    }
      
    }while(ans != 4);


    // 
    
  }
  

}

