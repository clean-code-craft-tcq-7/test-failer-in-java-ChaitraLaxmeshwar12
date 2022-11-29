public class Tshirts {
    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
        assert(size(37) == "S");
        assert(size(40) == "M");
        assert(size(43) == "L");
        assert(size(50) == "L");
        // If size is 38 cms then it has to be classified as 'S'
        assert(size(38) == "S");
        System.out.println("All is well (maybe!)");
    }
}
