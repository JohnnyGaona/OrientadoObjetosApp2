

public class Cuenta
  {
    private int numeroCuen;
    private float saldo;

    public Cuenta (){
      
    }
    public Cuenta (int numeroCuen, float saldo){
      this.numeroCuen = numeroCuen;
      this.saldo = saldo;
    }

    public void setNumeroCuen (int numeroCuen){
      this.numeroCuen = numeroCuen;
    }

    public void setSaldo (float saldo){
      this.saldo = saldo;
    }

    public int getNumeroCuen(){
      return numeroCuen;
    }

    public float getSaldo (){
      return saldo;
    }

    public void acreditar (float val){
      setSaldo(getSaldo()+val);
    }
    public void debitar (float val){
      if(validarSaldo(val)){
        setSaldo(getSaldo()-val);
      }
    }

    public boolean validarSaldo (float val){
      boolean flag = false;
      if(val > getSaldo()){
        System.out.println("Su saldo es insuficiente.....");
      }else{
        flag = true;
      }
      return flag;
    }
    
    
@Override
    public String toString() {
    return "\nCuentaBancaria" +
    "\nNumero de Cuenta = " + numeroCuen +
    "\nsaldo = " + saldo;
    }
  }
    