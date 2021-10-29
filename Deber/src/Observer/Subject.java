package Observer;
import java.util.Vector;

public interface Subject {
	public void add(Observer obs);
	public void remove(Observer obs);
	Observer[] getObservers();
	Object getData();
}
