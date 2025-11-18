package tp2_bieres_chiera.escoffier;

public class TP2_Bieres_CHIERA {
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Rose" , (float) 7.0,"Paillettes");
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneSecondeBiere=new BouteilleBiere("Violet", (float) 6.0,"Strass");
        uneSecondeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere=new BouteilleBiere("Bleu", (float) 5.0,"Sequin");
        troisiemeBiere.lireEtiquette();
        
        BouteilleBiere quatriemeBiere=new BouteilleBiere("Jaune", (float) 4.0,"Soleil");
        quatriemeBiere.lireEtiquette();
        
        BouteilleBiere cinquiemeBiere =new BouteilleBiere("Vert", (float) 3.0, "Souris");
        cinquiemeBiere.lireEtiquette();
        
        uneBiere.Decapsuler();
        System.out.println(uneBiere);
        System.out.println(uneSecondeBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(cinquiemeBiere);
    }
}