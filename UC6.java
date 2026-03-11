public class UC6 {
     

    // Method to create pattern for O
    static String getOPattern(int line) {
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
        return O[line];
    }

    // Method to create pattern for P
    static String getPPattern(int line) {
        String[] P = {
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };
        return P[line];
    }

    // Method to create pattern for S
    static String getSPattern(int line) {
        String[] S = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
        return S[line];
    }

    public static void main(String[] args) {

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    getOPattern(i),
                    getOPattern(i),
                    getPPattern(i),
                    getSPattern(i));
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

