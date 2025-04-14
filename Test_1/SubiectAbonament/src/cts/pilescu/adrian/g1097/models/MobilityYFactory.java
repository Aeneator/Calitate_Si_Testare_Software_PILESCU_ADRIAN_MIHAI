package cts.pilescu.adrian.g1097.models;

import cts.pilescu.adrian.g1097.factory.SubscriptionFactory;

public class MobilityYFactory implements SubscriptionFactory {
    @Override
    public Subscription createSubscription(float costLunar)  {
        return new MobilityY(costLunar);
    }
}
