package rec_backtracking.rec;

public class TowerOfHanoi {
	public static void main(String[] args) {
		towerOfHanoi(3, 'a', 'b', 'c');
	}
	
	public static void towerOfHanoi(int n ,char frompeg , char topeg,char auxpeg) {
		if(n==1) {
			System.out.println("move  disk 1 from peg "+frompeg+ " to pege "+ topeg);
			return;
		}
		towerOfHanoi(n-1, frompeg, auxpeg, topeg); 
		System.out.println("move disk from peg "+ frompeg+ " to peg "+topeg);
		towerOfHanoi(n-1, auxpeg, topeg, frompeg);
	}
}
