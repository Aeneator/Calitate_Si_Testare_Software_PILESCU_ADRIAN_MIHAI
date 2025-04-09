package magnumopus.SimpleFactory;

import magnumopus.models.Clown;

public interface SimpleFactory {
    Clown createClown(ClownTypes clownType, String costume, String shoes, String nose);
}
