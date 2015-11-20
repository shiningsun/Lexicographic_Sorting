package code;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//testing the sort.
		LexicographicSorting x = new LexicographicSorting();
		System.out.print("test 1: list: ");
		String[] s1 = {"acb", "abc", "bca"};
		String o1 = "abc";
		for(String i:s1){
			System.out.print(i+", ");
		}
		System.out.println("order: "+o1);
		s1 = x.lexiSort(s1, o1);
		for(String i:s1){
			System.out.println(i);
		}
		System.out.print("test 2: list: ");
		String[] s2 = {"acb", "abc", "bca"};
		String o2 = "cba";
		for(String i:s2){
			System.out.print(i+", ");
		}
		System.out.println("order: "+o2);
		s1 = x.lexiSort(s2, o2);
		for(String i:s2){
			System.out.println(i);
		}
		System.out.print("test 3: list: ");
		String[] s3 = {"aaa", "aa", ""};
		String o3 = "a";
		for(String i:s3){
			System.out.print(i+", ");
		}
		System.out.println("order: "+o3);
		s1 = x.lexiSort(s3, o3);
		for(String i:s3){
			System.out.println(i);
		}
	}

}
