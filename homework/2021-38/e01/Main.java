
class Main {
    public static void main(String [] args) {
       // luodaan taulukko jonka koko on 3. Sisältää 3 nollaa
        int [] taulukko = new int[3];  

       // korvataan nollat arvoilla 101, 200 ja 999     
        taulukko[0] = 12;
        taulukko[1] = 99;
        taulukko[2] = 32;
        
       // tulostetaan arvot
        System.out.println(taulukko[0]);
        //System.out.println(taulukko[1]);       
        System.out.println(taulukko[2]);

       // yhdellä rivillä taulukon luonti, koon antaminen ja arvojen antaminen
        //int [] toinen = {3,4,5,6};
        
       // taulukon koko
                //System.out.println(toinen.length);
    }
}