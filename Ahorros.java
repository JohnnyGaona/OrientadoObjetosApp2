
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

	public void setInteres(float interes) {
		Interes = interes;
	}

	@Override
	public String toString() {
		return super.toString()+" Ahorros [Interes=" + Interes + "]";
	}
	
}