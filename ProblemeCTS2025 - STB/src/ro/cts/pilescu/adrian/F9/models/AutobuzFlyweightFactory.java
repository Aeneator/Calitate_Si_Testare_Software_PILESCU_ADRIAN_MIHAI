package ro.cts.pilescu.adrian.F9.models;

import java.util.HashMap;
import java.util.Map;

public class AutobuzFlyweightFactory {

    private Map<String, AutobuzFlyweight> cache = new HashMap<>();

    public AutobuzFlyweight getAutobuz(String modelAutobuz, int anFabricatie, int nrLocuri){
        String key = modelAutobuz + "_" + anFabricatie + "_" + nrLocuri;
        if (!cache.containsKey(key)){
            cache.put(key, new AutobuzFlyweight(modelAutobuz,anFabricatie,nrLocuri));
        }
        return cache.get(key);
    }
}
