public class DepolamaBirimEkleDecorator extends BilgisayarDecorator {

    private int depolamaBoyutu;

    public DepolamaBirimEkleDecorator(Bilgisayar bilgisayar, int depolamaBoyutu) {
        super(bilgisayar);
        this.depolamaBoyutu = depolamaBoyutu;
    }

    @Override
    public double fiyat() {
        if (depolamaBoyutu == 2) {
            return super.fiyat() + 4999;
        } else if (depolamaBoyutu == 1) {
            return super.fiyat() + 2499;
        }  else if (depolamaBoyutu == 512) {
            return super.fiyat() + 3999;
        }else {
            return super.fiyat();
        }
    }

    @Override
    public String aciklama() {
        if (depolamaBoyutu == 2) {
            return super.aciklama() + " 2 TB SSD Disk eklendi";
        } else if (depolamaBoyutu == 1) {
            return super.aciklama() + " 1 TB SSD Disk eklendi";
        } else if (depolamaBoyutu == 512) {
            return super.aciklama() + " 512 GB SSD Disk eklendi";
        } else {
            return super.aciklama();
        }
    }
}
