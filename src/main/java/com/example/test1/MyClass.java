package com.example.test1;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("asdas")).forEach(line -> System.out.println(line));

        List<String> list = Arrays.asList("sds");
        Collections.sort(list, (String a, String b)-> a.compareTo(b));

//        Date date = new Date();
//
//        System.out.println(date.toString());
//        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
//        System.out.println(f.format(date));


        String a = "Bericht(id=1, data=05.03.2017, weight=55)";

        int p = a.indexOf(" ")+6;
        int o = a.lastIndexOf( " ")-1;
        String i = a.substring(p, o);

        int l = a.lastIndexOf(" ")+8;
        int k = a.length()-1;
        String j = a.substring(l,k);

        String r ="{\n" +
                "  \"cols\": [\n" +
                "    {\"id\": \"\", \"label\": \"data\", \"type\": \"string\"},\n" +
                "    {\"id\": \"\", \"label\": \"weight\", \"type\": \"number\"}\n" +
                "  ],\n" +
                "  \"rows\": [\n" +
                "    {\"c\": [{\"v\": \""+i+"\", \"f\": null}, {\"v\":"+j+", \"f\": null}]},";




        //System.out.println(r);

        List<String> list = new ArrayList<>();

        list.add("Bericht(id=1, data=05.03.2017, weight=55)");
        list.add("Bericht(id=2, data=04.03.2017, weight=57)");
        list.add("Bericht(id=3, data=03.03.2017, weight=56)");
        list.add("Bericht(id=4, data=02.03.2017, weight=54)");



        int ein = 0;
        int zwei = 0;
        int drei = 0;
        int vier = 0;

        String d = "";
        String c = "";

        String df = "";
        for(String g: list){
            ein = g.indexOf(" ")+6;
            zwei = g.lastIndexOf( " ")-1;
            drei = g.lastIndexOf(" ")+8;
            vier = g.length()-1;

            d = g.substring(ein, zwei);
            c = g.substring(drei, vier);

            df = df + "{\"c\": [{\"v\": \""+d+"\", \"f\": null}, {\"v\":"+c+", \"f\": null}]},"+"\n";
        }

        String temp = "{\n" +
                "  \"cols\": [\n" +
                "    {\"id\": \"\", \"label\": \"data\", \"type\": \"string\"},\n" +
                "    {\"id\": \"\", \"label\": \"weight\", \"type\": \"number\"}\n" +
                "  ],\n" +
                "  \"rows\": ["+df+"]\n" +
                "}";


        //System.out.println(temp);



//        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/static/text.json"));
//        bw.write(temp);
//        bw.close();
    }
}
