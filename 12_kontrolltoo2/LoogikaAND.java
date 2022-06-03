public class LoogikaAND implements Loogika {
    Loogika kanal1;
    Loogika kanal2;
    String nimi;

    public LoogikaAND(String _nimi, Loogika sis1, Loogika sis2) {
        nimi = _nimi;
        kanal1 = sis1;
        kanal2 = sis2;
    }

    public void signaal(int kanal, boolean seisund) {
        if (kanal == 1) {
            kanal1.signaal(1, seisund);
        }

        if (kanal == 2) {
            kanal2.signaal(1, seisund);
        }

    }

    public boolean staatus() {
        //Kui kanaleid ei ole olemas, siis oletame, et on väärad
        if (kanal1 == null || kanal2 == null) {
            return false;
        }

        return kanal1.staatus() == kanal2.staatus();
    }

    @Override
    public String toString() {
        return ("Nimi: " + nimi + "; Kanali väärtused: " + kanal1.staatus() + ", " + kanal2.staatus() + "; Väärtus: " + staatus());
    }
}
