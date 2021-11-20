class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int n = 0;
        int[][][] cube = new int[3][3][3];

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                for (int k = 0; k < cube.length; k++) {
                    cube[i][j][k] = k + (3 * j);
                }
            }
        }
        return cube;
    }
}

