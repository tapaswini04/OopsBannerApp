public class UC5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*   * *", "*     *", "*      "),
            String.join("  ", "*     *", "*  *  *", "*     *", "*      "),
            String.join("  ", "*     *", "* *   *", "*****  ", " ***** "),
            String.join("  ", "*     *", "**    *", "*      ", "      *"),
            String.join("  ", "*     *", "*     *", "*      ", "*     *"),
            String.join("  ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}