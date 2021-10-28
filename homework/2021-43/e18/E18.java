public class E18 {
    public static void main(String[] args) {
        int[] voittonumerot = new int [4];
        int[] myArgs = new int [4];
        boolean voitto = true;

        System.out.print("Arvotut numerot: ");

        for(int i = 0; i < voittonumerot.length; i++){
            int random = (int) (Math.random() * 10);
            voittonumerot[i] = random;
            System.out.print(voittonumerot[i]);
        }
        System.out.println();

        for(int i = 0; i < args.length; i++){
            myArgs[i] = Integer.parseInt(args[i]);
            if(myArgs[i] != voittonumerot[i]){
                voitto = false;
                break;
            } 
        }
        if(voitto){
            System.out.println("Voitto!");
        } else {
            System.out.println("Havisit!");
        }
    }
}
