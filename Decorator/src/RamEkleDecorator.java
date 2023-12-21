public class RamEkleDecorator extends BilgisayarDecorator {

    private int ramBoyutu;

    public RamEkleDecorator(Bilgisayar bilgisayar, int ramBoyutu) {
        super(bilgisayar);
        this.ramBoyutu = ramBoyutu;
    }

    @Override
    public double fiyat() {
        if (ramBoyutu == 8) {
            return super.fiyat() + 2500;
        } else if (ramBoyutu == 16) {
            return super.fiyat() + 5000;
        } else if (ramBoyutu == 32) {
            return super.fiyat() + 10000;
        } else {
            return super.fiyat();
        }
    }

    @Override
    public String aciklama() {
        if (ramBoyutu == 8) {
            return super.aciklama() + " 8 GB RAM eklendi";
        } else if (ramBoyutu == 16) {
            return super.aciklama() + " 16 GB RAM eklendi";
        } else if (ramBoyutu == 32) {
            return super.aciklama() + " 32 GB RAM eklendi";
        } else {
            return super.aciklama();
        }
    }
}
