//problem:
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
package arrays;

public class BuyAndSellStock {
	//to get the maximum price of stock after buying price index
	public static int maxPrice(int arr[],int min) {
		int max = 0;
		int si = min;  //here min indicates lowest buying price of the stock
		int ei = arr.length;
		for(int i =si;i<ei;i++) {
			max = Math.max(max, arr[i]); //function to get maximum value
		}
		
		return max;
	}
	
	//to get the index where min and max values are present
	
	public static int getDay(int arr[],int min) {
		int day = 1;  //if we set day =0, it will provide day no. as array index order
		int ei = arr.length;
		
		for(int i = 0;i<ei;i++) {
			if(arr[i]==min) {
				return day;
			}
			day++;
		}
		
		return day;
	}
	
	//to get minimum price 
	public static int minPrice(int arr[]) {
		int min = arr[0];
		for(int i =0;i<arr.length;i++) {
			min = Math.min(min, arr[i]);  //calculating minimum price
		}
		return min;
	}

	public static void main(String[] args) {
	int arr[] = {7,1,5,3,6,4};
	
	//int size = arr.length;
	int min = minPrice(arr);
	int day1 = getDay(arr,min);
	int max = maxPrice(arr,min);
	int day2 = getDay(arr,max);
	System.out.println("The best day to buy the stock is day no:: "+day1+" where price will be:: "+min);
	System.out.println("The best day to sell the stock is day no:: "+day2+" where price will be:: "+max);
	System.out.println("Profit will be::"+(max - min)); 
	}
}
