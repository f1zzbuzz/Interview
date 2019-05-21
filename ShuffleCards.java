import java.util.*;

public class ShuffleCards {
	
	public static void shuffle(int[] cards) {
		Random r = new Random();
		int n = cards.length, k = cards.length - 1;
		while(k >= 0) {
			int idx = r.nextInt(n);
			int temp = cards[idx];
			cards[idx] = cards[k];
			cards[k] = temp;
			k--;
			n--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = new int[52];
		for(int i = 0; i < 52; i++)
			cards[i] = i + 1;
		shuffle(cards);
		System.out.println(Arrays.toString(cards));
	}

}
