package fundamentos;

import java.util.stream.IntStream;

public class ExSozinho1 {
	
	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1, 3).map(i -> i * i)
				.map(i -> i * i).sum();
		System.out.println(sum);
	}

}
