public class StringUtils {

    // Մեթոդ 1: Կտրում է նշված տառից մինչև վերջ
    public static String cutString(String text, char target) {
        if (text == null) return "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return text.substring(i);
            }
        }
        return "";
    }

    // Մեթոդ 2: Կտրում է երկու տառերի միջև ընկած հատվածը
    public static String cutString(String text, char first, char second) {
        if (text == null) return "";

        int start = text.indexOf(first);
        if (start == -1) return "";

        int end = text.indexOf(second, start + 1);
        if (end == -1) return "";

        return text.substring(start, end + 1);
    }

    // Main մեթոդ (ծրագիրը run անելու համար)
    public static void main(String[] args) {
        System.out.println(cutString("hello world", 'o'));
        System.out.println(cutString("hello world", 'h', 'o'));
    }
}