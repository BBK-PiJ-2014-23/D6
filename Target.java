public class Target {
    int[][][] array;

    public Target(int x, int y, int z) {
        array = new int[x][y][z];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = 0;
                }
            }
        }
    }

    public void init() {
        int x = (int) Math.abs(array.length * Math.random());
        int y = (int) Math.abs(array[x].length * Math.random());
        int z = (int) Math.abs(array[x][y].length * Math.random());

        array[x][y][z] = 1;
    }

    public Result fire (int x, int y, int z) {
        //HIT, FAIL_LEFT, FAIL_RIGHT, FAIL_HIGH, FAIL_LOW, FAIL_SHORT, FAIL_LONG, OUT_OF_RANGE
        if (array[x][y][z] == 1) {
            return Result.HIT;
        } else {
            return Result.OUT_OF_RANGE;
        }
    }
}

