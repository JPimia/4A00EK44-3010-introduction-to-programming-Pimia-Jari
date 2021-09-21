
class Main {
    public static void main(String [] args) {
       // luodaan taulukko jonka koko on 3. Sisältää 3 nollaa
        String [] taulukko = new String[6];  

        // korvataan nollat arvoilla 101, 200 ja 999
        taulukko[0] = "jussi";
        taulukko[1] = "jarmo";
        taulukko[2] = "jeesus";
        taulukko[3] = "juudas";
        taulukko[4] = "mooses";
        taulukko[5] = "bin laden";
        
        // tulostetaan arvot
        //System.out.println(taulukko[0]);
        //System.out.println(taulukko[1]);
        //System.out.println(taulukko[2]);

        /*// yhdellä rivillä taulukon luonti, koon antaminen ja arvojen antaminen
        int [] toinen = {3,4,5,6};
        
        // taulukon koko
        System.out.println(toinen.length);*/

        for(int i = taulukko.length-1; i >= 0; i-=2){
            System.out.println(taulukko[i]);
        }
    }
}