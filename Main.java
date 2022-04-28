import java.util.Scanner;
import java.util.*;

class Main {
   
   
  public static void main(String[] args) {
  int ans;
  float interes;
  float Saldo = 0;
	int NCta;
  String Cedula;
	String Nombre;
  float Costo;
  Scanner ing = new Scanner (System.in);   
  
    List <Ahorros> cta = new ArrayList();
    List <Corrientes> ctc = new ArrayList();
    Ahorros obj; 
    Corrientes obj_2;
    System.out.println("Bienvenido a la banca movil....");
    System.out.println("Por favor seleccione el tipo de cuenta...");
    System.out.println("1) Ahorro / 2) Corriente");
    ans = ing.nextInt();
    System.out.print("Ingrese nombre del titula: ");
    Nombre = ing.next();
    System.out.print("Ingrese cedula del titula: ");
    Cedula = ing.next();
    System.out.print("Ingrese numero Cta. del titula: ");
    NCta = ing.nextInt();
    
    if(ans==1){
    System.out.print("Ingrese interes del titula: ");
    interes = ing.nextFloat();
      obj = new Ahorros(interes, Saldo, NCta, Cedula, Nombre);              
      cta.add(obj);
      System.out.println(cta.toString());

    }else{
      
      System.out.print("Ingrese costo del titula: ");
      Costo = ing.nextFloat();
      obj_2 = new Corrientes(Costo, Saldo, NCta, Cedula, Nombre);
      ctc.add(obj_2);
      System.out.println(ctc.toString());
    }
    
  //Cuenta obj = new Cuenta();
    
  }
  
    public void leer(){

  }

}

