public class Main {
    public static void main(String[] args) {


        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: " +  temelBilgisayar.fiyat() + "TL");
        System.out.println("Açıklama: " + temelBilgisayar.aciklama());

        //Ram Eklenmiş
        Bilgisayar ramBilgisayar = new RamEkleDecorator(new TemelBilgisayar());
        System.out.println("Fiyat: " + ramBilgisayar.fiyat() + "TL");
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());

        // Depolama Birimi ve Ram Eklenen
        Bilgisayar depolamaRamliBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(new TemelBilgisayar()));
        System.out.println("Fiyat: " + depolamaRamliBilgisayar.fiyat() +"TL");
        System.out.println("Açıklama: " + depolamaRamliBilgisayar.aciklama());

        //Sadece Depolama Birimi Eklenen
        Bilgisayar depolamaBilgisayar = new DepolamaBirimEkleDecorator(new TemelBilgisayar());
        System.out.println("Fiyat: " + depolamaBilgisayar.fiyat() +"TL");
        System.out.println("Açıklama: " + depolamaBilgisayar.aciklama());

    }
}