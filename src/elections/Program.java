package elections;


public class Program {
    public static void main(String[] args) {
        Elections elections = new Elections();
        Vote vote1 = new Vote("Alexey");
        Vote vote2 = new Vote("Yossi");
        Vote vote3 = new Vote("Koby");
        Envelope envelope1 = new Envelope("12",vote1);
        Envelope envelope2 = new Envelope("12",vote2);
        Envelope envelope3 = new Envelope("12",vote2);
        Envelope envelope4 = new Envelope("12",vote1);

        elections.makeVote(envelope1);
        elections.makeVote(envelope2);
        elections.makeVote(envelope3);
        elections.makeVote(envelope4);

        elections.calculate();
    }
}
