
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

	public float getCosto() {
		return Costo;
	}

	public void setCosto(float costo) {
		this.Costo = costo;
	}

	@Override
	public String toString() {
		return super.toString()+" Corriente [Costo=" + Costo + "]";
	}
	
	

}
