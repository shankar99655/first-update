package practices;
class H
{
	int i;
	H(int i) {
		this.i = i;
	}
//	@Override
//	public boolean equals(Object obj) {
//		return i == ((H)obj).i;
//	}
}
public class G {
	public static void main(String[] args) {
		H a1 = new H(90);
		H a2 = new H(90);
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
