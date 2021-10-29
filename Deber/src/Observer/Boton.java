package Observer;
import javax.security.auth.Subject;

import principal.Boton;

public class Boton {
	 private String nombre;
	  public String getNombre(){
	  return nombre;
	  }
	  public void setNombre(String nombre){
	  this.nombre = nombre;
	  }
	  public Boton(String nombre){
		this.nombre=nombre;
	  }
	  
	  public static void main(String[] args) {
			Boton bt1=new Boton("rojo");
			Boton bt2=new Boton("naranja");
			Boton bt3=new Boton("amarillo");

		}
}
