package subiect1.Ex1.builders;

import subiect1.Ex1.models.IBicicleta;

public interface AbstractBuilder {
  

     AbstractBuilder setMarca(String marca) ;

     AbstractBuilder setPret(Double pret) ;

     AbstractBuilder setDiametruRoti(float diametruRoti);

     AbstractBuilder setTipFrana(String tipFrana) ;

     AbstractBuilder setAreCascaProtectie(Boolean areCascaProtectie);

     AbstractBuilder setAreOchelari(Boolean areOchelari);

     IBicicleta buildBicicleta();
}
