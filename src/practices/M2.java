package practices;


class V <Z extends Integer>
{
	
}
public class M2 {
	
	public static void main(String[] args) {
		V<Integer> a1 = new V<Integer>();
		boolean f= false;
		if(f = true || false)
		{
			System.out.println(f);
		}
		int i = 0;
		i = i++;
		i = --i;
//		int j = 13 + (i = 2) + i;
		System.out.println(i);
//		System.out.println(j);
//		float i = 100.90;
//		A<String> a2 = new A<String>();
//		System.out.println(i);
	}
}
