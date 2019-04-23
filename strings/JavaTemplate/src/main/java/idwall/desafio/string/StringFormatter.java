package idwall.desafio.string;

/**
 * Created by Rodrigo Catão Araujo on 06/02/2018.
 */
public abstract class StringFormatter {

    private Integer limit;

    public StringFormatter() {
        this.limit = 40;
    }

    /**
     * It receives a text and should return it formatted
     *
     * @param text
     * @return
     */
    
    public abstract String formatHub(String text,boolean justify);
    
    public abstract String format(String text);

    public abstract String justify(String text);

    public abstract String justifyLine(String text);

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
