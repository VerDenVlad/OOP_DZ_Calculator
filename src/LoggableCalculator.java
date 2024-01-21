public class LoggableCalculator implements Calculable{

    protected Calculable calc;
    Loggable calcLogger = new CalcLogger();


    public LoggableCalculator(Calculable calc) {
        calcLogger.saveLog("" + calc.getResult());
        this.calc = calc;
    }


    @Override
    public Calculable plus(int arg) {
        calcLogger.saveLog(calc.getResult() + " + " + arg);
        return this.calc.plus(arg);
    }

    @Override
    public Calculable minus(int arg) {
        calcLogger.saveLog(calc.getResult() + " - " + arg);
        return this.calc.minus(arg);
    }

    @Override
    public Calculable multiply(int arg) {
        calcLogger.saveLog(calc.getResult() + " * " + arg);
        return this.calc.multiply(arg);
    }

    @Override
    public Calculable share(int arg) {
        calcLogger.saveLog(calc.getResult() + " / " + arg);
        return this.calc.share(arg);
    }

    @Override
    public int getResult() {
        int result = this.calc.getResult();
        calcLogger.saveLog(" = " + result);
        return this.calc.getResult();
    }
}