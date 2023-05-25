package pack1;
class A
{
	public A() {
		this(10);
		System.out.println("A()");
	}

	public A(int i) {
		System.out.println("A(int i)");
	}
	{
		System.out.println("IIB");
	}
}
class B extends A
{
	public B() {
		System.out.println("B()");
	}
}

public class C extends B{
	C()
	{
		System.out.println("C()");
	}
	public static void main(String[] args) {
		C c1 = new C();
	}
}
