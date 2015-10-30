 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wijzer;

/**
 *
 * @author janjaap
 */
public class Kijkwijzer {
    String genre; //horror, detective, actie, romantisch, komisch
    
    public Kijkwijzer(String genre) {
        this.genre = genre;
    }
    
    public String getPlaatjes() {
        String pre = "<img class='kijkwijzer' src='images/";
        String post = ".jpg'>";
        if (genre.equals("horror")) {
            return pre + "5" + post + pre + "4" + post + pre + "3" + post;
        } else if (genre.equals("detective")) {
            return pre + "5" + post + pre + "6" + post;
        } else if (genre.equals("actie")) {
            return pre + "3" + post + pre + "4" + post + pre + "16" + post;
        } else if (genre.equals("romantisch")) {
            return pre + "1" + post + pre + "6" + post;
        } else if (genre.equals("komisch")) {
            return pre + "1" + post;
        } else {
            return "";
        }
    }

    
}
