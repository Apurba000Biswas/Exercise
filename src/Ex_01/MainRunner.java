package Ex_01;

public class MainRunner {
	
	
	public static void main(String[] args) {
		GenericsEx integerObj = new GenericsEx<>();
		
//		GenericsEx<String> stringObj = new GenericsEx<String>("This is Aurba. He testing the Generics Class");
//		
//		System.out.println("Generics Value : " + integerObj.getObject());
//		System.out.println("Generics Value : " + stringObj.getObject());
		integerObj.print("asdsadasda");
		integerObj.print(12);
		Demo demo = new Demo();
		integerObj.print(demo);
		
	}
	
	private static class Demo{
	}
}
