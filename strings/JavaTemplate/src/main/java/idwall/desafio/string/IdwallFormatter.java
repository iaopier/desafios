package idwall.desafio.string;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public class IdwallFormatter extends StringFormatter {

    /**
     * Should format as described in the challenge
     *
     * @param text
     * @return
     */
    @Override
    public String format(String text) {
        String output = "";
        int countChar = 0;
        int limit = getLimit();
        for (; countChar < text.length(); ++countChar) {
            if ((countChar % getLimit()) == 0 && limit < text.length()) {
                if (text.charAt(limit) == ' ') {
                    output = output + text.substring(countChar, limit) + "\n";
                    limit += getLimit();
                }else{
                    output = output + text.substring(countChar, limit) + "\n";
                    limit += getLimit();
                }

            }
        }
        System.out.println(output);
        throw new UnsupportedOperationException();
    }

}
