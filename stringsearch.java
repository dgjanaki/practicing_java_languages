public class stringsearch {
    public static void main(String[] args) {

        String name = "janu";
        char target = 'u';

        boolean ans = string(name, target);

        if (ans)
            System.out.println("char found");
        else
            System.out.println("char not found");
    }

    static boolean string(String str, char target) {
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target)
                return true;
        }

        return false;
    }
}