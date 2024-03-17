import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("Geben Sie eine Zahl von 1 bis 7 ein, um herauszufinden, welchem Wochentag sie entspricht.");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Montag");
                        break;
                    case 2:
                        System.out.println("Dienstag");
                        break;
                    case 3:
                        System.out.println("Mittwoch");
                        break;
                    case 4:
                        System.out.println("Donnerstag");
                        break;
                    case 5:
                        System.out.println("Freitag");
                        break;
                    case 6:
                        System.out.println("Samstag");
                        break;
                    case 7:
                        System.out.println("Sonntag");
                        break;
                    default:
                        System.out.println("Sie haben eine falsche Nummer eingegeben");
                }
            } while (choice < 1 || choice > 7);
        }
    }


