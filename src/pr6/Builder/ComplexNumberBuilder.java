package pr6.Builder;

public class ComplexNumberBuilder implements Builder{
    private int rel = 1;
    private int im = 0;
    private int j = 0;

    @Override
    public Builder createRealPart(int rel) {
        System.out.println("Создание целой части");
        this.rel = rel;
        return this;
    }

    @Override
    public Builder createImPart(int im) {
        System.out.println("Создание мнимой части");
        this.im = im;
        return this;
    }

    @Override
    public Builder createLastPart(int j) {
        System.out.println("Создание последней части");
        this.j = 0;
        return this;
    }

    @Override
    public Number build() {
        return new Number(rel, im, j);
    }
}
