public class ReverseArray {

    public static void main(String[] args) {

        String[] arrayToReverse = {"Mein", "Name", "ist", "Max", "Mustermann"};
        String[] test = reverseArray(arrayToReverse);

    }

    public static String[] reverseArray(String[] arrayToReverse) {

        for (int i = 0; i < arrayToReverse.length; i++) {
            if (arrayToReverse[i] == arrayToReverse[0])
                System.out.print("Input -> ");
            if (arrayToReverse[i] == arrayToReverse[arrayToReverse.length - 1]) {
                System.out.println(arrayToReverse[i]);
            } else
                System.out.print(arrayToReverse[i] + ", ");
        }
        System.out.println();

        for (int i = arrayToReverse.length - 1; i >= 0; i--) {
            if (arrayToReverse[i] == arrayToReverse[arrayToReverse.length - 1])
                System.out.print("Output -> ");
            if (arrayToReverse[i] == arrayToReverse[0]) {
                System.out.println(arrayToReverse[i]);
            } else
                System.out.print(arrayToReverse[i] + ", ");
        }
        return arrayToReverse;
    }
}
