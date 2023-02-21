package pr6.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Number construct(int rel, int im, int j) {
        return builder.createRealPart(rel).createImPart(im).createLastPart(j).build();
    }
}
