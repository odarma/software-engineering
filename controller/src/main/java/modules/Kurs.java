package modules;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

enum kategori{
    STRIKKING,
    VEVING,
    SYING
}

public class Kurs {
    private String navn;
    private int id;
    private LocalDateTime startDato;
    private LocalDateTime sluttDato;
    private ArrayList<Deltager> deltagerListe;
    private String beskrivelse;
    private static final DateTimeFormatter correctFormat = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");


    public Kurs (int id, String navn, LocalDateTime startDato, LocalDateTime sluttDato, ArrayList<Deltager> deltagerListe, String beskrivelse, Kategori kategori){
        setId(id);
        setNavn(navn);
        setStartDato(startDato);
        setSluttDato(sluttDato);
        setDeltagerListe(deltagerListe);
        setBeskrivelse(beskrivelse);

    }

    public String getNavn() {return navn;}
    public void setNavn(String navn) {this.navn = navn;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public LocalDateTime getStartDato() {return startDato;}
    public void setStartDato(LocalDateTime startDato) {this.startDato = startDato;}
    public LocalDateTime getSluttDato() {return sluttDato;}
    public void setSluttDato(LocalDateTime sluttDato) {this.sluttDato = sluttDato;}
    public ArrayList<Deltager> getDeltagerListe() {return deltagerListe;}
    public void setDeltagerListe(ArrayList<Deltager> deltagerListe) {this.deltagerListe = deltagerListe;}
    public String getBeskrivelse() {return beskrivelse;}
    public void setBeskrivelse(String beskrivelse) {this.beskrivelse = beskrivelse;}
}
