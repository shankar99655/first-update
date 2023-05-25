package practices;
class E
{
	int i;
}
class F
{
	int j;
	E e1;
}
public class D {
	public static void main(String[] args) {
		E e = new E();
		e.i = 12;
		F f = new F();
		f.j = 23;
		f.e1 = e;
		System.out.println(e.i);
		System.out.println(f.j);
		System.out.println(e);
		System.out.println(f.e1);
		System.out.println(f);
		String s1 = "java";
		String s2 = "ja";
		String s3 = s2 + "va";
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
	}
}
