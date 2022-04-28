
public class Cuenta {

	
	private float Saldo;
	private int NCta;
	private Titular tit;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param saldo
	 * @param nCta
	 */
	
	



	public float getSaldo() {
		return Saldo;
	}

	/**
	 * @param saldo
	 * @param nCta
	 * @param tit
	 */
	public Cuenta(float saldo, int nCta,String cedula, String nombre) {
		super();
		Saldo = saldo;
		NCta = nCta;
		this.tit = new Titular(cedula,nombre);
	}

	public void setSaldo(float saldo) {
		
		Saldo = saldo;
		
	}

	public int getNCta() {
		return NCta;
	}

	public void setNCta(int nCta) {
		NCta = nCta;
	}
	
	public void acreditar(float monto) {
		setSaldo(getSaldo()+monto);
	}
	
	public void debitar(float monto) {
		setSaldo(getSaldo()-monto);
	}

	public Titular getTit() {
		return tit;
	}

	public void setTit(Titular tit) {
		this.tit = tit;
	}

	@Override
	public String toString() {
		return "Cuenta [Saldo=" + Saldo + ", NCta=" + NCta + ", tit=" + tit + "]";
	}	
}
