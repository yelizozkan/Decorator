public class DepolamaBirimEkleDecorator extends BilgisayarDecorator {

    public DepolamaBirimEkleDecorator(Bilgisayar bilgisayar) {
        super(bilgisayar);
    }

    @Override
    public double fiyat(){
        return super.fiyat() + 4999;
    }

    @Override
    public String aciklama(){
        return super.aciklama() + " 2 TB SSD Disk Eklendi. ";
    }
}
