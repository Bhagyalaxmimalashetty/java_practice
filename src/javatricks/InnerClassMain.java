package javatricks;

/*class Base {
	final public void demo() {
		System.out.println("inside base class");
	}
}

class child extends Base{
 public void demo() {
	 System.out.println("inside child class");
 }
}*/

class A{}
class B extends A{}
class C extends B{}


public class InnerClassMain {

	public static void main(String[] args) {
		
		/*
		 * Base b=new child(); b.demo();
		 */
		B b =new B();
		A a =new A();
		C c=new C();
		 if ((b instanceof B) &&( b instanceof A) && (b instanceof C)) {
			B new_name = (B) b;
		System.out.println("its b and A instance");	
		}
	}

}
