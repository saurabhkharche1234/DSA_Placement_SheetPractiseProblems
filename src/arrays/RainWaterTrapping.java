//rainwater trapping problem= to understand logic and meaning of problem- youtube
//given height is height = [0,1,0,2,1,0,1,3,2,1,2,1]
package arrays;

public class RainWaterTrapping {

	public static int rainWater(int height[],int n) {
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = height[0];
		  	for(int i =1;i<n;i++) {
		  		left[i] = Math.max(left[i-1], height[i]);
		  	}
		right[n-1] = height[n-1];  	
			for(int i = n-2;i>=0;i--) {
				right[i] = Math.max(right[i+1], height[i]);
			}
		int ans = 0;
		
		for(int i =0;i<n;i++) {
			ans = ans + (Math.min(left[i],right[i])-height[i]);
		}
		
		return ans;
	}
	public static void main(String[] args) {
	int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};  
	int n = height.length;
	int ans = rainWater(height, n);
		System.out.println("Water trapped will be::"+ans);
	}

}
