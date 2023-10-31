package displayDetial;

public class Display091 {
    public static String nameDisplay(String name) {
        return name;
    }
    public static int ageDisplay(int age) {
        return age;
    }
    public static char groupBloodDisplay(char group) {
        if (group != 'A' && group !='B' && group != 'O'){
            throw new RuntimeException("This is not bloodgroup");
        }
        return group;
    }
    public static String allValue(String name, int age, char blood) {
        return name + " " + age + " " + blood;
    }
}
