package practices;
import java.util.HashSet;

class B{
	int i, j;
	B(int i, int j){
		this.i = i;
		this.j = j;
	}
	public String toString() {
		System.out.println(i +", "+ j);
		return "(" + i + ", " + j + ")";
	}
	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		System.out.println(hash);
		hash += s2.hashCode();
		System.out.println(s2.hashCode());
		return hash;
	} 
	public boolean equals(Object obj) {
		System.out.println(obj);
		return (i == ((B)obj).i && j == ((B)obj).j);
	}
}
public class M6 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(10,90)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,11)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,11)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,11)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,10)));
		System.out.println("-------------");
		System.out.println(set.add(new B(90,12)));
		System.out.println("-------------");
		System.out.println(set);
	}
}