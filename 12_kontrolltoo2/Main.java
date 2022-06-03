import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Loogika> LoogikaAndmed = new ArrayList<>();

        Loogika sisend1 = new Sisend();
        Loogika sisend2 = new Sisend();
        Loogika ortest = new LoogikaOR("OR1", sisend1, sisend2);

        Loogika sisend3 = new Sisend();
        sisend3.signaal(1, true);
        Loogika ortest2 = new LoogikaOR("OR2", ortest, sisend3);

        Loogika nottest = new LoogikaNOT("NOT1", ortest2);

        Loogika sisend4 = new Sisend();
        sisend4.signaal(1, true);

        Loogika andtest = new LoogikaAND("AND1", sisend4, nottest);

        LoogikaAndmed.add(sisend1);
        LoogikaAndmed.add(sisend2);
        LoogikaAndmed.add(ortest);
        LoogikaAndmed.add(sisend3);
        LoogikaAndmed.add(ortest2);
        LoogikaAndmed.add(nottest);
        LoogikaAndmed.add(sisend4);
        LoogikaAndmed.add(andtest);

        for (Loogika andmed: LoogikaAndmed) {
            System.out.println(andmed);
        }

    }
}
