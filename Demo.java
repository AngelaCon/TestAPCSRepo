public class Demo {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            printLoop(5);
        }
        else {
             int i = Integer.parseInt(args[0]);
            printLoop(i);
        }
    }

    public static void printLoop(int n) {
        for (int i = n; i >= 0; i--){
            for (int j = 1; j <= i;j++) {
                System.out.println(j);
            }
            System.out.println();
        }
    }


}
