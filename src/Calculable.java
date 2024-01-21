public interface Calculable {
    Calculable plus(int arg);
    Calculable minus(int arg);
    Calculable multiply(int arg);
    Calculable share(int arg);
    int getResult();
}