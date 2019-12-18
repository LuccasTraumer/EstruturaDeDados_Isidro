import java.util.ArrayList;
public class Array{
	public static void main(String[] args){
		ArrayList<Integer> test = new ArrayList<Integer>();

		test.add(5);
		test.add(25);
		test.remove(1);
		System.out.println(test.toString());
	}
}