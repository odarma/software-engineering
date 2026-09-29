package controllers;

import io.javalin.http.*;
import modules.Kurs;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class KursController {
    public search(Context ctx){
        try{
            String navn = Objects.requireNonNull(ctx.formParam("navn"));
            String kategori = Objects.requireNonNull(ctx.formParam("kategori"));

            ctx.json(searchKurs(navn, kategori));
    } catch (Exception e){
            ctx.status(400).result("Invalid input: " + e.getMessage());
        }
    }

    public addKurs(Context ctx){
        try{
            String navn = Objects.requireNonNull(ctx.formParam("navn"));
            Kategori kategori = Objects.requireNonNull(ctx.formParam("kategori")).toUpperCase(Locale.of("nb", "NO"));
            int startTime = Integer.parseInt(Objects.requireNonNull(ctx.formParam("start-time")));
            int startMinutt = Integer.parseInt(Objects.requireNonNull(ctx.formParam("start-minutt")));
            int startDag = Integer.parseInt(Objects.requireNonNull(ctx.formParam("start-dag")));
            int startMaaned = Integer.parseInt(Objects.requireNonNull(ctx.formParam("start-måned")));
            int startAar = Integer.parseInt(Objects.requireNonNull(ctx.formParam("start-år")));
            int sluttTime = Integer.parseInt(Objects.requireNonNull(ctx.formParam("slutt-time")));
            int sluttMinutt = Integer.parseInt(Objects.requireNonNull(ctx.formParam("slutt-minutt")));
            int sluttDag = Integer.parseInt(Objects.requireNonNull(ctx.formParam("slutt-dag")));
            int sluttMaaned = Integer.parseInt(Objects.requireNonNull(ctx.formParam("slutt-måned")));
            int sluttAar = Integer.parseInt(Objects.requireNonNull(ctx.formParam("slutt-år")));
            String beskrivelse = Objects.requireNonNull(ctx.formParam("beskrivelse"));

            Kurs kurs = new Kurs(navn, LocalDate.of(startAar, startMaaned, startDag).atTime(startTime, startMinutt),
                    LocalDate.of(sluttAar, sluttMaaned, sluttDag).atTime(sluttTime, sluttMinutt), beskrivelse, kategori);

            addkurs(kurs);
        } catch (Exception e){
            ctx.status(400).result("Invalid input: " + e.getMessage());
        }
    }

    public remove(Context ctx){
        try{
            int id = Integer.parseInt(ctx.formParam("id"));
            removeKurs(id);
        } catch (Exception e) {
            ctx.status(400).result("Invalid input: " + e.getMessage());
        }
    }
}
