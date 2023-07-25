package itransform.oopsconcept;

public class SingletonClass {

	public static SingletonClass single_instance;
	
	public SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
        if (single_instance == null) {
        	single_instance = new SingletonClass();
        }
        return single_instance;
    }

    public void aMethod() {
        System.out.println("A method of the Singleton class.");
    } 
    
    public static void main(String[] args) {

        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();

        // Both objects will reference the same instance to the same memory location
        System.out.println("Both objects point to the same memory location in the heap - " +( singleton1 == singleton2));

        singleton1.aMethod(); 
    }
}
