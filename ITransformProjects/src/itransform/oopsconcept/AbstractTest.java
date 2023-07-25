package itransform.oopsconcept;

//gives compile time error if abstract is not put before class
abstract class AbstractDemo{

	//an abstract method
	public abstract void doNothing();
}

//can declare a class as abstract without any abstract methods in it
abstract class AbstractDemo2{
	
	public void doSomething() {
		System.out.println("Method in abstract class");
	}
	
}
public class AbstractTest extends AbstractDemo{

	public static void main(String[] args) {
		
		//cannot instantiate the type AbstractDemo, other way is to create anonymous inner class to parent class reference
		//AbstractDemo demo = new AbstractDemo();
		AbstractDemo ob = new AbstractTest();
		ob.doNothing();
	}

	//should override to complete unimplemented methods of abstract class when extended in subclass
	@Override
	public void doNothing() {
		System.out.println("Abstract method invoked...using subclass object");
		
	}

}

//not allowed because if a method of a class is private, you cannot access it outside the current class, not even from the child classes of it.
//But, incase of an abstract method, you cannot use it from the same class, you need to override it from subclass and use.
//abstract private class AbstractDemo3{
//	public abstract void someMethod();
//}
