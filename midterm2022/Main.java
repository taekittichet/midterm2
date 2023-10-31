import obj008.ObjKittichet;
import utill.kittichet.Util008;

public class Main {
    public static void main(String[] args) {
        testKittichet();
        testComputeArea();
        testEvaluate();
        testMagic();
        testObjKittichet();
        testCompare();
        testIsGreaterThan();


    }

    public static void testKittichet(){
        System.out.println("3.1: " + Util008.Kittichet) ;
    }

    public static void testComputeArea(){
        System.out.println("3.2: " + Util008.compute008RightTriangleArea(5.0,9.0));
    }

    public static void testEvaluate(){
        System.out.println("3.3: " + Util008.eveluate008(65));
    }

    public static void testMagic(){
        System.out.println("3.4: " + Util008.computeMagicKittichet(1,2,3));
    }

    public static void testObjKittichet(){
        var o = new ObjKittichet("id008" , "Tae",999.99);
        var p = new ObjKittichet("id010" , "Tiean",999.09);
        System.out.println("4.2,4.4, : " + o);
        System.out.println("4.2,4.4, : " + p);
    }

    public static void testCompare(){
        var o = new ObjKittichet("id999","Kriengkrai",900.99);
        var p = new ObjKittichet("id000","Porkaew",999.09);
        System.out.println(ObjKittichet.compare(o,p));
    }

    public static void testIsGreaterThan(){
        var o = new ObjKittichet("id008" , "Tae",999.99);
        var p = new ObjKittichet("id007" , "Tiean",999.09);
        System.out.println("4.6: isGreaterThan: " + o.isGreaterThan(p));

    }
}