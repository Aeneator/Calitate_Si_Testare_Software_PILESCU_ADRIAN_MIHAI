package cts.pilescu.adrian.g1097.models;

public class MobilityX implements Subscription {

    private float costLunar = (float)2.0;
    private String voiceServices;

    protected MobilityX(float costLunar) {
        this.voiceServices = "Voce nationala";
        this.costLunar = costLunar;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths * costLunar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MobilityX{");
        sb.append("costLunar=").append(costLunar);
        sb.append(", voiceServices='").append(voiceServices).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
