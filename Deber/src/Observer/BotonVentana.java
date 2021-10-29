package Observer;

public class BotonVentana extends VentanaObserver{
		  public void click(){
		  System.out.println("color"+
		  getBoton().getNombre());
		  }
}
