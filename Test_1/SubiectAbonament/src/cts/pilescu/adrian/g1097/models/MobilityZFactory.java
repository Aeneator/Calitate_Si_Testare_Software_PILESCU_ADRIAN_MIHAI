package cts.pilescu.adrian.g1097.models;

import cts.pilescu.adrian.g1097.factory.SubscriptionFactory;

public class MobilityZFactory implements SubscriptionFactory {
    @Override
    public Subscription createSubscription(float costLunar) {
        return new MobilityZ(costLunar);
    }
}
