public class LoogikaNOT implements Loogika {
    Loogika kanal1;
    String nimi;

    public LoogikaNOT(String _nimi, Loogika sis1) {
        nimi = _nimi;
        kanal1 = sis1;
    }

    public void signaal(int kanal, boolean seisund) {
        if (kanal == 1) {
            kanal1.signaal(1, seisund);
        }
    }

    public boolean staatus() {
        //Kui kanalit pole olemas, siis false?
        if (kanal1 == null) {
            System.out.println("teadmata");
            return false;
        }

        return !kanal1.staatus();
    }

    @Override
    public String toString() {
        return ("Nimi: " + nimi + "; Kanali väärtused: " + kanal1.staatus() + "; Väärtus: " + staatus());
    }
}
