class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // no flower to plant
        if(n == 0) return true;

        int l = flowerbed.length;

        for(int i=0; i<l ; i++){
            if(flowerbed[i] == 0){
                // this means we are on the very first index
                boolean left = (i == 0) || (flowerbed[i-1] == 0);

                // this means we are on the last index
                boolean right = (i == l-1) || (flowerbed[i+1] == 0);

                if(left && right){
                    flowerbed[i] = 1;
                    n--;

                    if(n == 0) return true;
                }

            }
        }
        return false;
    }
}
