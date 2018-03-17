package arrays;

public class Card {
    public String suite;
    public int value;
    public Card(int suite, int value ) {
        if(suite==0) {
            this.suite = "hearts";
        }else if (suite == 1){
            this.suite ="diamonds";
        }else if (suite==2){
            this.suite ="spades";
        }else if(suite ==3){
            this.suite ="jocker";
        }
        else if(suite==4){
            this.suite="clubs";
        }
        this.value = value;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
