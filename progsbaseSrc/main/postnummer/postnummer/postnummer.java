package postnummer.postnummer;

import references.references.StringReference;

import static postnummer.db.db.hentPostnummerListe;
import static postnummer.db.db.hentPoststedListe;
import static java.lang.Math.*;
import static numbers.StringToDecimal.StringToDecimal.stringToDecimal;

public class postnummer {
    public static char [] hentPoststed(char [] nrString, Success feilmelding){
        double nr;
        char [] respons;
        StringReference [] poststedListe;

        nr = stringToDecimal(nrString).result;
        respons = "".toCharArray();

        if(erGyldigPostnummer(nrString)){
            feilmelding.success = true;
            poststedListe = hentPoststedListe();
            respons = poststedListe[(int)nr].string;
        }else{
            feilmelding.success = false;
            feilmelding.feilmelding = "Postnummer er ikke gyldig.".toCharArray();
        }

        return respons;
    }

    public static boolean erGyldigPostnummer(char [] nrString){
        double nr;
        boolean [] gyldigePostnummer;
        boolean erGyldig;

        nr = stringToDecimal(nrString).result;
        gyldigePostnummer = gyldigPostnummertabell();

        if(nr > 0d && nr < 10000d && erHelttall(nr) && nrString.length == 4d){
            erGyldig = gyldigePostnummer[(int)nr];
        }else{
            erGyldig = false;
        }

        return erGyldig;
    }

    public static boolean erHelttall(double nr) {
        return (nr % 1d) == 0d;
    }

    public static boolean [] gyldigPostnummertabell(){
        double i, maxnummer;
        double [] postnummerliste;
        boolean rev[];

        postnummerliste = hentPostnummerListe();
        maxnummer = 0d;

        for(i = 0d; i < postnummerliste.length; i = i + 1d){
            maxnummer = max(maxnummer, postnummerliste[(int)i]);
        }

        rev = new boolean [(int)(maxnummer + 1d)];

        for(i = 0d; i < maxnummer; i = i + 1d){
            rev[(int)i] = false;
        }

        for(i = 0d; i < postnummerliste.length; i = i + 1d){
            rev[(int)postnummerliste[(int)i]] = true;
        }

        return rev;
    }

}
