public class Main {
    public static void main(String[] args) {

        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: " + temelBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + temelBilgisayar.aciklama());

        // Ram Eklenmiş(8 GB)
        Bilgisayar ramBilgisayar = new RamEkleDecorator(new TemelBilgisayar(), 8);
        System.out.println("Fiyat: " + ramBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());

        // Ram Eklenmiş (32 GB)
        Bilgisayar ram32Bilgisayar = new RamEkleDecorator(new TemelBilgisayar(), 32);
        System.out.println("Fiyat: " + ram32Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + ram32Bilgisayar.aciklama());

        // Depolama Birimi ve Ram Eklenen
        Bilgisayar depolamaRamliBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(), 16), 2);
        System.out.println("Fiyat: " + depolamaRamliBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + depolamaRamliBilgisayar.aciklama());

        // Sadece Depolama Birimi Eklenen
        Bilgisayar depolamaBilgisayar = new DepolamaBirimEkleDecorator(new TemelBilgisayar(), 512);
        System.out.println("Fiyat: " + depolamaBilgisayar.fiyat() + " TL");
        System.out.println("Açıklama: " + depolamaBilgisayar.aciklama());
    }
}
