import java.util.Scanner;
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
  
    List <Cuenta> cta = new ArrayList<Cuenta>();

    Cuenta obj; 
    do{
      System.out.println("Bienvenido a la banca movil....");
      System.out.println("Por favor seleccione el tipo de cuenta...");
      System.out.println("1) Ahorro / 2) Corriente / 3) Mostrar las cuentas / 4) Salir ");
        ans = ing.nextInt(); 
      
    if (ans != 3 && ans != 4){
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
              
    }else{
      
      System.out.print("Ingrese costo del titula: ");
        Costo = ing.nextFloat();
      obj = new Corrientes(Costo, Saldo, NCta, Cedula, Nombre);
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


    
    
  }
  

}

