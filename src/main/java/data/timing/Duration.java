package data.timing;

public class Duration {

    private Integer from;
    private Integer to;

    public Duration(Integer from, Integer to) {
        this.from = from;
        this.to =to;
    }

    @Override
    public String toString() {
        return ""+from.toString()+"-"+to.toString();
    }
}
