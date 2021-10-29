package Observer;
import java.util.Vector;

public aspect ObserverPatternImpl extends ObserverPattern{
	declare parents: Boton implements Subject;
	 public Object Boton.getData() { return this; }
	 declare parents: VentanaObserver implements Observer;
	 public void VentanaObserver.update() {
	 click();
	 }
	 pointcut stateChanges(Subject s): target(s) &&
	 call(void Boton.setNombre(..));
}
