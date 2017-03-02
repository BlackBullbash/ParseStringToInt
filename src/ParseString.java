public class ParseString {

    String str = "12345";

    public static void main(String[] args) {
        ParseString parse = new ParseString();
        parse.run();
    }

    private void run() {
        getArr();
        printArr(getArr());
        System.out.println();
        System.out.println("Here is your array of integer values");
    }

    private int[] getArr() {
        int[] arr = new int[str.length()];
        char[]a = str.toCharArray();
        /*String[] Res = new String[a.length];  // from char to string
        for(int b = 0; b < a.length; b++) {
            Res[b] = Character.valueOf(a[b]).toString();
        } */

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(Character.valueOf(a[i]).toString());
        }
        return arr;
    }


    private void printArr(int[] mas) {
        for (int i : mas) {
            System.out.print(i + "|");
        }
    }
}