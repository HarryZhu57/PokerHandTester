public class Card {
    private int num;
    private String suite;

    public Card() {

    }

    public Card(int numG, String suiteG) {
        num = numG;
        suite = suiteG;
    }

    public int getCardNum() {
        return num;
    }
    public String getCardSuite() {
        return suite;
    }
}