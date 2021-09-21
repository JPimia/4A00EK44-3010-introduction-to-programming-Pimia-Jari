
class Main {
    public static void main(String [] args) {
       // luodaan taulukko jonka koko on 3. Sisältää 3 nollaa
        int [] taulukko = new int[6];  

        // korvataan nollat arvoilla 101, 200 ja 999     
        taulukko[0] = 12;
        taulukko[1] = 99;
        taulukko[2] = 32;
        taulukko[3] = 44;
        taulukko[4] = 123;
        taulukko[5] = 22;
        
        // tulostetaan arvot
        //System.out.println(taulukko[0]);
        //System.out.println(taulukko[1]);       
        //System.out.println(taulukko[2]);

        /*// yhdellä rivillä taulukon luonti, koon antaminen ja arvojen antaminen
        int [] toinen = {3,4,5,6};
        
        // taulukon koko
        System.out.println(toinen.length);*/

        for(int i = 0; i < taulukko.length; i++){
            System.out.println(taulukko[i]);
        }
    }
}