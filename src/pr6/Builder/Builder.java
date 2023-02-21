package pr6.Builder;

public interface Builder {
    Builder createRealPart(int rel);
    Builder createImPart(int im);
    Builder createLastPart(int j);
    Number build();
}
