
import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.File;

public class ReadText {
    public static void main(String [] args) throws IOException {
        String textFileName = "input.txt";
        List<String> allLines = Files.readAllLines(new File(textFileName).toPath(), Charset.defaultCharset());
        int pieninLuku = 0;

        for(int i=0; i<allLines.size(); i++) {
            int rivinLuku = Integer.parseInt(allLines.get(i));

            if(rivinLuku < pieninLuku){
                pieninLuku = rivinLuku;
            }
        }

        for(int i=0; i<allLines.size(); i++) {
            int rivinLuku = Integer.parseInt(allLines.get(i));

            if(rivinLuku >= 0){ 
                for(int z = pieninLuku; z < 0; z++){
                    System.out.print(" ");
                }
                System.out.print("|");
                for(int j = 0; j < rivinLuku; j++){

                    System.out.print("+");
                }
            } else {
                for(int k = pieninLuku - rivinLuku; k < 0; k++){
                    System.out.print(" ");
                }
                for(int x = rivinLuku; x < 0; x++){
                    System.out.print("-");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
