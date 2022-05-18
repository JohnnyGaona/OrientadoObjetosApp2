package Clases;

import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="Titular")
@XmlType(propOrder=("Cedula","Nombre"))
public class Titular {
	private String Cedula;
	private String Nombre;
	private Titular tit;
	/**
	 * @param cedula
	 * @param nombre
	 */
	public Titular(String cedula, String nombre) {
		super();
		Cedula = cedula;
		Nombre = nombre;
	}
	/**
	 * 
	 */
	public Titular() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public Titular getTit() {
		return tit;
	}
	public void setTit(Titular tit) {
		this.tit = tit;
	}
	@Override
	public String toString() {
		return "Titular [Cedula=" + Cedula + ", Nombre=" + Nombre + "]";
	}	
}