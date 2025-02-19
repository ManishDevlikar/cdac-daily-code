package programming.coding;

// 1)There are N houses in a city. Houses are located in a single line at a
// particular distance from origin. We have to place the antennas on the houses.
// The range of antennas is a K unit. Find out the minimum number of antennas
// required so that each house is in range of at-least one antenna.

// For eg : 2 , 4, 5, 6,9 ,11, 15 , k = 2
// Number of antennas required : 3
public class PlaceAntenna {
	public static int placedAntenna(int arr[], int k) {
		int antenna = 0;
		int i = 0;
		while (i < arr.length) {
			antenna++;
			int loc = arr[i] + k;
			while (i < arr.length && arr[i] <= loc) {
				i++;
			}
			loc = arr[i - 1] + k;
			while (i < arr.length && arr[i] <= loc) {
				i++;
			}
		}
		return antenna;
	}

	public static void main(String[] args) {
		System.out.println(placedAntenna(new int[] { 2, 4, 5, 6, 11, 15, 16, 17, 18, 19, 20 }, 2));
	}
}
