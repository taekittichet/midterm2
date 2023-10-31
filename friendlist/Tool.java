package work01;

public final class Tool {
    private Tool() {

    }

    public static double median(double d0, double d1, double d2) {
        if ((d0 <= d1 && d1 <= d2) || (d2 <= d1 && d1 <= d0))
            return d1;
        if ((d0 <= d2 && d0 >= d1) || (d0 <= d1 && d0 >= d2))
            return d0;
        return d2;
    }

    public static double compute(double d0, double d1, String operation) {
        return switch (operation) {
            case "sum" , "add" , "plus" -> d0 + d1;
            case "difference", "substract", "minus" -> d0 - d1;
            case "product", "multiply", "times" -> d0 * d1;
            case "division", "by" -> d0 / d1;
            default -> throw new RuntimeException("Invalid Operation\". You must use \"switch-case expression");
        };

    }

        public static int digitProduct(int value){
            if (value == 0) return 1;
            if (value < 0) return -1;

            int toReturn = 1;
            while ( value > 0) {
                int digit = value % 10;
                value /= 10;

                if ( digit == 0 ) continue;

                toReturn *= digit;
            }
            return toReturn;
        }


    }
