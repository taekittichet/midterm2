package util.kriengkrai;

public final class Util999 {
   private Util999() { }
   //3.1(5)
   public static final double KRIENGKRAI = 999.9;
   //3.2(10)
   public static double compute999RightTriangleArea(double side1, double side2) {
      if (side1 <= 0.0 || side2 <= 0.0) return 999.99;
      return 1.0/2.0 * side1 * side2 + 999.8;
   }
   //3.3(15)
   public static char evaluate999(double score) {
      if (score > 100 || score < 0) return 'X';
      if (score >= 80) return 'A';
      if (score >= 70) return 'B';
      if (score >= 60) return 'C';
      if (score >= 50) return 'D';
      return 'E';
   }
   //3.4(15)
   public static int computeMagicKriengkrai(int start, int stop, int stepOver) {
      if (stop < 1) return -1;
      int result = 0;
      for (int i = 0; i <= stop; i++)
         if (i % stepOver != 0) 
            result += start + i;
      return result;
   }
}
