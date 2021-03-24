package com.joe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EUtazas {
    public static void main(String[] args) throws IOException, ParseException {
       ArrayList<Utas> utasok = readFile();
        System.out.println(utasok.size());
        int db = 0;
        for(Utas utas:utasok ) if(!utazhat(utas)) db++;
        System.out.println(db);

    }
    private static ArrayList<Utas> readFile() throws IOException, ParseException {
        //ebbe rakjuk kesobb az eredmenyeinket
        ArrayList<Utas> list = new ArrayList<>();
        //beolvasunk egy filet
        File file = new File("C:\\Users\\pc 1\\IdeaProjects\\Gyakorlas\\src\\com\\joe\\file\\utasadat.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String sor;
        //soronkent vegig megyunk a fileon
        while ((sor = br.readLine()) != null) {
            // darabjaira bontunk egy sort
            String[] db = sor.split(" ");
            // tipus konverziok
            int megallo = Integer.parseInt(db[0]);
            int azonosito = Integer.parseInt(db[2]);
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            String[] felszallasDbk= db[1].split("-");
            Date felszallasDatuma = format.parse(felszallasDbk[0]);
            String felszallasIdopontja = felszallasDbk[1];
            if(db[3].equals("JGY")){
                list.add(new Utas(megallo,felszallasDatuma,felszallasIdopontja, azonosito, db[3],null,Integer.parseInt(db[4])));
            }else{
                list.add(new Utas(megallo,felszallasDatuma,felszallasIdopontja, azonosito, db[3],format.parse(db[4]),null));
            }
        }

        //file lezarasa
        br.close();
        return list;
    }

    private static boolean utazhat(Utas utas){
        if(utas.getBerletTipus().equals("JGY")&& utas.getDb()>0
        || !utas.getBerletTipus().equals("JGY")&& utas.getFelszallasDatuma().compareTo(utas.getBerletErvenyesseg())<=0){
            return true;
        }else{
            return false;
        }
    }


//   public bool ervenyessegellenorzes()
//        {
//            if (ervdatum.Length <= 2)
//                if (ervdatum == "0") return false;
//                else return true;
//            else
//                if (DateTime.Compare(DateTime.ParseExact(menetdatum.Split('-')[0], "yyyyMMdd", CultureInfo.InvariantCulture), DateTime.ParseExact(ervdatum, "yyyyMMdd", CultureInfo.InvariantCulture)) > 0)
//                    return false;
//            return true;
//        }
}
// ezt a mintat kovetve, ujabb beolvasas skypeban uj packbe
//quick sort partition fuggveny befejezni
//hanoi tornya