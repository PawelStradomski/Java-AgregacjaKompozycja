
package agregacjaikompozycja;


public class AgregacjaiKompozycja {

    
    public static void main(String[] args) {
        Pracownik umyslowy = new Pracownik("Pawel", new Adress("Sezamkowa", 7));
        System.out.println(umyslowy);
       
    }
    
}
class Pracownik
{
    String imie;
    Adress adresZamieszkania; // stworzono agregacje - polaczenie

    public Pracownik(String imie, Adress adresZamieszkania) 
    {
        this.imie = imie;
        this.adresZamieszkania = adresZamieszkania;
    }

    @Override
    public String toString() {
        return this.imie + adresZamieszkania.ulica+adresZamieszkania.nrDomu;
    }
    
    
    
}

class Adress
{
    String ulica;
    int nrDomu;

    public Adress(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }
    
}