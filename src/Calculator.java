public final class Calculator implements Calculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable plus(int arg) {
        primaryArg += arg;
        return this;
    }
    @Override
    public Calculable minus(int arg) {
        primaryArg -= arg;
        return this;
    }
    @Override
    public Calculable multiply(int arg) {
        primaryArg *= arg;
        return this;
    }


    @Override
    public Calculable share(int arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}