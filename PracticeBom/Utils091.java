package function.utils;

public class Utils091 {
    public static boolean checkString(String checkS) {
        if (checkS == null || checkS.isBlank()) return false;
        return true;
    }
    public static boolean checkInt(int checkI) {
        if (checkI < 0) return false;
        return true;
    }
}
