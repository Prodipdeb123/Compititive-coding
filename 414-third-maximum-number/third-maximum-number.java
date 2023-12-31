class Solution {
    public int thirdMax(int[] arr) {
    int n = arr.length, posTL = -1;
	int large = Arrays.stream(arr).max().getAsInt();
	int secondLarge = Integer.MIN_VALUE;
    int thirdLarge = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
    if(arr[i] > secondLarge && arr[i] != large) {
        secondLarge = arr[i];
    }
    }

    for (int i = 0; i < n; i++) {
    if(arr[i] >= thirdLarge && arr[i] != secondLarge && arr[i] != large) {
        thirdLarge = arr[i];
        posTL = i;
    }
    }
    if(n == 1){
        return arr[0];
    } else if(posTL == -1) {
        return large;
    }
	return thirdLarge;
    }
}