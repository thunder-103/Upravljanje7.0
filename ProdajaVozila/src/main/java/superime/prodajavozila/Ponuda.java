package superime.prodajavozila;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Ponuda")
public class Ponuda implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("PonudaID")
   private java.lang.Long ponudaID;
   @org.kie.api.definition.type.Label("KupacID")
   private Kupac kupacID;

   @org.kie.api.definition.type.Label("VoziloID")
   private superime.prodajavozila.Vozilo voziloID;

   @org.kie.api.definition.type.Label("NarudzbaVozila")
   private Narudzba narudzba_vozila;

   @org.kie.api.definition.type.Label("NastavakPregovora")
   private String nastavak_pregovora;

   @org.kie.api.definition.type.Label("Placeno")
   private String placeno;

   @org.kie.api.definition.type.Label("Isporuceno")
   private String isporuceno;

   public Ponuda()
   {
   }

   public java.lang.Long getPonudaID()
   {
      return this.ponudaID;
   }

   public void setPonudaID(java.lang.Long ponudaID)
   {
      this.ponudaID = ponudaID;
   }

   public superime.prodajavozila.Vozilo getVoziloID()
   {
      return this.voziloID;
   }

   public void setVoziloID(superime.prodajavozila.Vozilo voziloID)
   {
      this.voziloID = voziloID;
   }

   public java.lang.String getNastavak_pregovora()
   {
      return this.nastavak_pregovora;
   }

   public void setNastavak_pregovora(java.lang.String nastavak_pregovora)
   {
      this.nastavak_pregovora = nastavak_pregovora;
   }

   public java.lang.String getPlaceno()
   {
      return this.placeno;
   }

   public void setPlaceno(java.lang.String placeno)
   {
      this.placeno = placeno;
   }

   public java.lang.String getIsporuceno()
   {
      return this.isporuceno;
   }

   public void setIsporuceno(java.lang.String isporuceno)
   {
      this.isporuceno = isporuceno;
   }

   public superime.prodajavozila.Kupac getKupacID()
   {
      return this.kupacID;
   }

   public void setKupacID(superime.prodajavozila.Kupac kupacID)
   {
      this.kupacID = kupacID;
   }

   public superime.prodajavozila.Narudzba getNarudzba_vozila()
   {
      return this.narudzba_vozila;
   }

   public void setNarudzba_vozila(superime.prodajavozila.Narudzba narudzba_vozila)
   {
      this.narudzba_vozila = narudzba_vozila;
   }

   public Ponuda(java.lang.Long ponudaID, superime.prodajavozila.Kupac kupacID,
         superime.prodajavozila.Vozilo voziloID,
         superime.prodajavozila.Narudzba narudzba_vozila,
         java.lang.String nastavak_pregovora, java.lang.String placeno,
         java.lang.String isporuceno)
   {
      this.ponudaID = ponudaID;
      this.kupacID = kupacID;
      this.voziloID = voziloID;
      this.narudzba_vozila = narudzba_vozila;
      this.nastavak_pregovora = nastavak_pregovora;
      this.placeno = placeno;
      this.isporuceno = isporuceno;
   }

}