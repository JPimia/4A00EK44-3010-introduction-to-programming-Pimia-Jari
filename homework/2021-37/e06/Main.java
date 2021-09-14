
public class Main {
    public static void main(String[] args) {
        double a = 3.3;

        System.out.println(2 + 1); // laskee yhteen kokonaisluvut 2 ja 1
        System.out.println("merkkijono1" + "merkkijono2"); // tulostaa molemmat merkkijonot jonossa
        System.out.println("merkkijono1" + 2); // tulostaa merkkijonon jonka perässä on kokonaisluku 2
        System.out.println("merkkijono1" + a); // tulostaa merkkijonon ja perään desimaaliluvun 3.3
        System.out.println(3.3 + "merkkijono" + 3.3); // tulostaa ensin desimaaliluvun sitten jonoon merkkijonon ja taas jonoon desimaaliluvun
        System.out.println(2 + "merkkijono2"); // tulostaa kokonaisluvun 2 ja perään merkkijonon
        System.out.println("merkkijono1" + 'a'); // tulostaa merkkijonon ja perään merkin char 'a'
        System.out.println('a' + 'b' ); // joo elikkä esim UTF-8 merkkikirjastossa jokasel merkil on oma int arvo ja täs esimerkis 'a' on 97 ja 'b' on 98
    }
}
