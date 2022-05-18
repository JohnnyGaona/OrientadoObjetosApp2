package Clases;
public class Ahorros extends Cuenta{
	
	private float Interes;

	/**
	 * @param interes
	 */
	public Ahorros(float interes, float saldo, int nCta, String cedula, String nombre) {
		super(saldo,nCta, cedula, nombre);
		Interes = interes;
	}

	/**
	 * 
	 */
	public Ahorros() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public float getInteres() {
		return Interes;
	}
   public void calcularPorcentaje(){
    acreditar(getSaldo()*(getInteres()/100));
    }
	public void setInteres(float interes) {
		Interes = interes;
	}

	@Override
	public String toString() {
    System.out.println("");
		return super.toString()+" Ahorros [Interes=" + Interes + "]";
    //System.out.println("");
	}
	
}