package Ex_01;

public class GenericsEx <T>{
	private T object;
	
	
	public T getObject() {
		return object;
	}
	
	public void print(T obje) {
		System.out.println("This Object is a : " + obje.getClass().getName());
	}

}
