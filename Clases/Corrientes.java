package Clases;
public class Corrientes extends Cuenta{
	private float Costo;

	
	/**
	 * 
	 */
	public Corrientes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param costo
	 */
	public Corrientes(float costo, float saldo, int nCta, String cedula, String nombre) {
		super(saldo,nCta, cedula, nombre);
		Costo = costo;
	}
   public void calcularPorcentaje(){
    debitar(getSaldo()*(getCosto()/100));
    }
	public float getCosto() {
		return Costo;
	}

	public void setCosto(float costo) {
		this.Costo = costo;
	}

	@Override
	public String toString() {
    System.out.println("");
		return super.toString()+" Corriente [Costo=" + Costo + "]";
    //System.out.println("");
	}
	
	

}
