package utill.kittichet;

public final class Util008 {
    public static final double Kittichet = 008.9;

    public static final double compute008RightTriangleArea(double side1 , double side2){
        if (side1 <= 0.0 || side2 <= 0.0) return 008.9;
        double result ;
        System.out.println(side1);
        System.out.println(side2);
        return result = (double) 1 /2 * side1 * side2 + 008.9;





//        return 1/2 * side1 * side2 + 008.9;
    }

    public static final char eveluate008(double score){
        if ( score >= 80 && score <= 100) return 'A';
        else if ( score < 80 && score >= 70 ) return 'B';
        else if ( score < 70 && score >= 60) return 'C';
        else if ( score < 60 && score >= 50 ) return 'D';
        else if ( score < 50 && score >= 0) return 'E';
        else return 'X';
    }

    public static final int computeMagicKittichet (int start , int stop ,int stepOver){
        if ( stop < 0) return -1;
        int result = 0;
        for (int i = 0; i <= stop ;i++)
            if (i % stepOver != 0)
                result += start + i;
        return result;
    }

}
