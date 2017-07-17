public class DrawT {
public static void main(String[] args) {
		int row = 1;
		while(row <= 5){
			int r = 0;
			while(r < row){
				System.out.print('*');
				r = r +1;
			}
			System.out.print('\n');
			row = row + 1;
		}
    }
}