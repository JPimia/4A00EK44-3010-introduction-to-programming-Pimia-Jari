
class Laskin {
    public static void main(String [] args) {

        if(args.length == 3){
            int lukuA = Integer.parseInt(args[0]);
            int lukuB = Integer.parseInt(args[2]);

            switch(args[1]) {
                case "+":
                    System.out.println("tulos on: " + (lukuA + lukuB));
                    break;
                case "-":
                    System.out.print("tulos on: " + (lukuA - lukuB));
                    break;
                case "/":
                    System.out.print("tulos on: " + (lukuA / lukuB));
                    break;
                case "x":
                    System.out.print("tulos on: " + (lukuA * lukuB));
                    break;
                default:
                    System.out.print("tuetut operaattorit ovat: +-/x");
            } 
        } else {
            System.out.println("hallelujah");
        }
    }
}