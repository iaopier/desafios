package idwall.desafio.string;

import org.apache.commons.lang.WordUtils;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public class IdwallFormatter extends StringFormatter {

    private static final String LINE_BREAK = "\n";

    private static final String BLANK_SPACE = " ";

    private static final char BLANK_CHAR = ' ';

    /**
     * Should format as described in the challenge
     *
     * @param text
     * @param justify
     * @return
     */
    @Override
    public String formatHub(String text, boolean justify){
        if(justify)
            return justify(text);
        else
            return format(text);
    }
    
    @Override
    public String format(String text) {
        String[] splitted = text.split(LINE_BREAK);
        String[] finalTextArray = new String[splitted.length];
        String finalText = "";
        int splittedLineNumbers = 0;
        for (String splittedLines : splitted) {
            finalTextArray[splittedLineNumbers] = WordUtils.wrap(splittedLines, getLimit());
            ++splittedLineNumbers;
        }
        for (String endLine : finalTextArray) {
            finalText = finalText.concat(endLine).concat(LINE_BREAK);
        }
        return finalText;
    }
    
    @Override
    public String justify(String text) {
        String[] splitted = text.split(LINE_BREAK);
        String[] finalTextArray = new String[splitted.length];
        String finalText = "";
        int splittedLineNumbers = 0;
        for (String splittedLines : splitted) {
            finalTextArray[splittedLineNumbers] = justifyLine(splittedLines);
            ++splittedLineNumbers;
        }
        for (String endLine : finalTextArray) {
            finalText = finalText.concat(endLine).concat(LINE_BREAK);
        }
        return finalText;
    }
    
    @Override
    public String justifyLine(String text) {
        String[] splitted = format(text).split(LINE_BREAK);
        int limit = getLimit();
        String output = "";
        for (String line : splitted) {
            if (line.length() != 0) {
                if (line.charAt(line.length() - 1) == BLANK_CHAR) {
                    line = line.substring(0, line.length() - 1);
                }
                line = line.replaceAll("\n", "");

                while (line.length() < limit) {

                    for (int i = 0; i < line.length(); i++) {
                        if (line.length() >= limit) {
                            break;
                        }

                        if (line.charAt(i) == BLANK_CHAR) {
                            line = line.substring(0, i) + line.substring(i, line.length()).replaceFirst(BLANK_SPACE, "  ");
                            i++;
                        }
                    }

                }
            }
            output = output.concat(line);
            
        }
        return output;
    }
}
