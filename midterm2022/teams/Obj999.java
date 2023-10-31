package obj.kriengkrai;

public class Obj999 {
   //4.1(5)
   private static String id999;
   private String nameKriengkrai;
   private double value999;   
   //4.2(5)
   public Obj999(String id999, String nameKriengkrai, double value999) {
      Obj999.id999 = id999;
      this.nameKriengkrai = nameKriengkrai;
      this.value999 = value999;
   }
   //4.3(5) getters, setters
   public static String getId999() { return id999; }
   public static void setId999(String id999) { Obj999.id999 = id999; }
   public String getNameKriengkrai() { return nameKriengkrai; }
   public void setNameKriengkrai(String nameKriengkrai) { this.nameKriengkrai = nameKriengkrai; }
   public double getValue999() { return value999; }
   public void setValue999(double value999) { this.value999 = value999; }
   //4.4(5)
   @Override
   public String toString() {
      return "Obj999{" + "id999=" + id999
         + ", nameKriengkrai=" + nameKriengkrai 
         + ", value999=" + value999 + '}';
   }
   //4.5(10)
   public static int compare(Obj999 o1, Obj999 o2) {
      if (o1 == null || o2 == null) return 1;
      if (o1.value999 == o2.value999) return 0;
      if (o1.value999 < o2.value999) return -1;
      return 1;
   }
   //4.6(10)
   public boolean isGreaterThan(Obj999 o) {
      return o != null && this.value999 > o.value999;
   }
   
}
