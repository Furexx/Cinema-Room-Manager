class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        int myArr = twoDimArray.length;
        
        for(int row = 0; row < twoDimArray.length;row++){
            int index = twoDimArray[row].length;
            int[] reversedItems = new int[index];
            for(int item = 0;item < twoDimArray[row].length;item++){
                reversedItems[index -1] = twoDimArray[row][item];
                index--;
            }
             twoDimArray[row] = reversedItems;
        }
    }
}
