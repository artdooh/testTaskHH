package dooh.hh.test2;

public abstract class CarParam implements Car {
    protected int amortization;
    protected int repair;

    public CarParam(int amortization, int repair) {
        this.amortization = amortization;
        this.repair = repair;
    }

    public int getAmortization() {
        return amortization;
    }

    public int getRepair() {
        return repair;
    }

    public void setAmortization(int amortization) {
        this.amortization = amortization;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }
}
