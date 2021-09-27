import java.io.Console;

class Main {
    public static void main(String [] moooorjesta) {
        Console c = System.console();
        String longestName = "";
        String name = "";

        // annetaan nimet ja taulukon paikkojen määrä
        System.out.print("Number of names? ");
        int numberOfNames = Integer.parseInt(c.readLine());
        String [] taulukko = new String[numberOfNames +1];

        // katsotaan taulukosta pisin nimi
        for(int i = 1; i <= numberOfNames; i++){
            System.out.print(i + ". " + "name: ");
                name = c.readLine();
                taulukko[i] += name;

            if(longestName.length() < taulukko[i].length()){
                longestName = name;
            }
        }
        System.out.print("Longest name is: " + longestName);
    }
}