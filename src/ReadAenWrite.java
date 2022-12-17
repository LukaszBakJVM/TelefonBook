import java.io.*;

import java.util.HashMap;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;


public class ReadAenWrite {
    private static final  String filename = "contact.txt";

    public static void write(TeleBook teleBook) {
        try (
                var file =new FileWriter(filename);
                var buffer=new BufferedWriter(file)
                ){
            for (Contack c:teleBook
                 ) {
                buffer.write(c.toCSV());
                buffer.newLine();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static TeleBook read(){
        try (
                var file=new FileReader(filename);
                var buffer=new BufferedReader(file)
                ){
            Map<String,Contack>contackMap=buffer.lines()
                    .map(lines->lines.split(" "))
                    .map(split->new Contack(split[0],split[1],Integer.parseInt(split[2])))
                    .collect(Collectors.toMap(Contack::key,Function.identity()));

return new TeleBook(new HashMap<>(contackMap));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    }