package modules;

import java.time.LocalDate;
import java.util.ArrayList;

enum kategori{
    STRIKKING,
    VEVING,
    SYING
}

public class Kurs {
    public Kurs (int id, String navn, LocalDate startTid, LocalDate startDato, LocalDate sluttTid, LocalDate sluttDato,
                 ArrayList<Deltager> deltagerListe, String beskrivelse, Kategori kategori){
        setId(id);
        super(String navn, LocalDate startTid, LocalDate startDato, LocalDate sluttTid, LocalDate sluttDato,
                ArrayList<Deltager> deltagerListe, String beskrivelse, Kategori kategori)
    }
    public Kurs (String navn, LocalDate startTid, LocalDate startDato, LocalDate sluttTid, LocalDate sluttDato,
                 ArrayList<Deltager> deltagerListe, String beskrivelse, Kategori kategori){

    }
}
