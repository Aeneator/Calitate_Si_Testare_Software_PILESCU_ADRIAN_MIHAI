package cts.pilescu.adrian.g1097.models;

public class MobilityZ implements Subscription {
    private float costLunar = (float)3.0;
    private String voiceServices;
    private String dataServices;
    private String tvOnline;

    protected MobilityZ(float costLunar) {
        this.voiceServices = "Voce nationala";
        this.dataServices = "4G";
        this.tvOnline = "TV online";
        this.costLunar = costLunar;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths * costLunar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MobilityZ{");
        sb.append("costLunar=").append(costLunar);
        sb.append(", voiceServices='").append(voiceServices).append('\'');
        sb.append(", dataServices='").append(dataServices).append('\'');
        sb.append(", tvOnline='").append(tvOnline).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
