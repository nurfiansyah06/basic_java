public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "a";
        stringArray[1] = "b";
        stringArray[2] = "c";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "z";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "a", "v", "c"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        long[] arrayLong = {
                10L, 29L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"arep", "arif"},
                {"nur", "muhamad"},
                {"joko"},
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
