package practices;

public class M1 {
	public static void main(String[] args) {
		int i = 115;
		String s = Integer.toBinaryString(i);
		System.out.println(s);
		int j = Integer.parseInt(s, 2);
		System.out.println(j);
		boolean k = true;
		if(k)
		{
			System.out.println("done");
		}
		for( i = 0; i <= 10; i++)
		{
			if(i == 7)
			{
				break;			
			}
		}
	}
}
