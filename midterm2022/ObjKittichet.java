package obj008;

public class ObjKittichet {
    private static String id008;

    private String nameKittichet;

    private double value008;


    // Constructor
    public ObjKittichet(String id008 ,String nameKittichet, double value008) {
        ObjKittichet.id008 = id008;
        this.nameKittichet = nameKittichet;
        this.value008 = value008;
    }

    // Getter , Setter

    public static String getId008() {
        return id008;
    }

    public static void setId008(String id008) {
        ObjKittichet.id008 = id008;
    }

    public String getNameKittichet() {
        return nameKittichet;
    }

    public void setNameKittichet(String nameKittichet) {
        this.nameKittichet = nameKittichet;
    }

    public double getValue008() {
        return value008;
    }

    public void setValue008(double value008) {
        this.value008 = value008;
    }

    @Override
    public String toString() {
        return "ObjKittichet{" + "id008=" + id008 + " nameKittichet='" + nameKittichet + '\'' +
                ", value008=" + value008 +
                '}';
    }

    public static int compare(ObjKittichet o1 , ObjKittichet o2){
        if (o1.value008 == o2.value008) return 0;
        if (o1.value008 < o2.value008) return -1;
        return 1;
    }

    public boolean isGreaterThan(ObjKittichet o){
        if (value008 > o.value008 ) return true;
        return false;
    }

}
