public class Demo {
    public static void main(String[] args) {
        // if (args.length == 0)
        // {
        //     printLoop(5);
        // }
        // else {
        //      int i = Integer.parseInt(args[0]);
        //     printLoop(i);
        // }

        int[][] arr6 = {{10, 11, 12, 13},{14, 15, 16, 17}};
        System.out.println(arrayDeepToString(arr6).replace("}, ", "}, \n"));
        System.out.println(arrayDeepToString(create2DArray(3,4,10)));
        System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)));

    }

    public static void printLoop(int n) {
        for (int i = n; i >= 0; i--){
            for (int j = 1; j <= i;j++) {
                System.out.println(j);
            }
            System.out.println();
        }
    }


    public static int[][] combineArray(int[] arr1, int[] arr2) {
        int result[][] = {arr1,arr2};
        return result;
    }

    public static String arrToString(int[] arr){
        if (arr.length == 0) return "{}";
        String output = "{";
        for (int i = 0; i < arr.length-1; i++){
          output = output +  arr[i] + ", ";
        }
        output = output + arr[arr.length-1] + "}";
        return output;
}

    public static String arrayDeepToString(int[][] arr){
        String str = "{";
        if (arr.length == 0) return str+="}";
        for (int i = 0; i < arr.length-1; i++) {
            str= str + arrToString(arr[i]) + ", ";
        }
        str = str + arrToString(arr[arr.length-1]) + "}";
        return str;
    }

    public static int[][] create2DArray(int rows, int cols,int maxValue) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (int) Math.round(Math.random()*(maxValue));
            }
        }
        return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
        int cols2 = (int) Math.round(Math.random()*(cols));
        arr[i] = new int[cols2];
        for (int j = 0; j < cols2; j++)
        {
            arr[i][j] = (int) Math.round(Math.random()*(maxValue));
        }
    }
    return arr;
}

}
