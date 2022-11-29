public class Misaligned {
    
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
    
      static int printColorMap() {
         int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.printf(fetchColorPair(i * 5 + j, majorColors[i], minorColors[i]));
            }
        }
        return i * j;
    }
    static String fetchColorPair(int index, String majorColor, String minorColor) {
        return String.format("%d | %s | %s\n", i * 5 + j, majorColors[i], minorColors[i])
    }
    public static void main(String[] args) { 
        int result = printColorMap();
        assert(result == 25);
        assert(fetchColorPair(1, "White", "Orange").split("|")[0].length() == etColorPairString(20, "Yellow", "Slate").split("|")[0].length());
        System.out.println("All is well (maybe!)");
    }
}
