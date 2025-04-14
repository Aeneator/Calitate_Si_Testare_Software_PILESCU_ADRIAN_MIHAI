package cts.pilescu.adrian.g1097.models;

public class MobilityY implements Subscription {
    private float costLunar;
    private String dataServices;

    protected MobilityY(float costLunar) {
        this.dataServices = "4G";
        this.costLunar = costLunar;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths * costLunar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MobilityY{");
        sb.append("costLunar=").append(costLunar);
        sb.append(", dataServices='").append(dataServices).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
