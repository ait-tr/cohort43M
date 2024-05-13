package code.programmingPrincipals;

public class NonOpenClosePrincipal {

    public boolean badPractice() {
        int x = 10;
        int y = 20;

        if ((x + y) < 50) {
            return false;
        }
        return true;
    }

    public boolean badPractice(int x, int y) {

        if ((x + y) < 50) {
            return false;
        }
        return true;
    }

    public boolean goodPractice(int x, int y, int compareCriteria){
        if (x + y < compareCriteria) {
            return false;
        }
        return true;
    }
}
