public class TruthTable {
    public static void main(String[] args) {
        //вывод на экран таблицы истинности логических операторов

        boolean p, q;
        System.out.println("| P\t\t\t| Q\t\t\t| AND\t\t| OR\t\t| XOR\t\t| NOT\t\t|");

        p = true; q = true;
        System.out.print("| " + p + "\t\t| " + q + "\t\t| ");
        System.out.print((p&q) + "\t\t| ");
        System.out.print((p|q) + "\t\t| ");
        System.out.print((p^q) + "\t\t| ");
        System.out.println(!p + "\t\t|");

        p = true; q = false;
        System.out.print("| " + p + "\t\t| " + q + "\t\t| ");
        System.out.print((p&q) + "\t\t| ");
        System.out.print((p|q) + "\t\t| ");
        System.out.print((p^q) + "\t\t| ");
        System.out.println(!p + "\t\t|");

        p = false; q = true;
        System.out.print("| " + p + "\t\t| " + q + "\t\t| ");
        System.out.print((p&q) + "\t\t| ");
        System.out.print((p|q) + "\t\t| ");
        System.out.print((p^q) + "\t\t| ");
        System.out.println(!p + "\t\t|");

        p = false; q = false;
        System.out.print("| " + p + "\t\t| " + q + "\t\t| ");
        System.out.print((p&q) + "\t\t| ");
        System.out.print((p|q) + "\t\t| ");
        System.out.print((p^q) + "\t\t| ");
        System.out.println(!p + "\t\t|");

    }
}
