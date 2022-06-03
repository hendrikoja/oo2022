public class Sisend implements Loogika{
    boolean kanal1;
    public void signaal(int kanal, boolean seisund) {
        if (kanal == 1) {
            kanal1 = seisund;
        }
    }
    public boolean staatus() {
        return kanal1;
    }
    @Override
    public String toString() {
        return "Signaal: " + kanal1;
    }
}
