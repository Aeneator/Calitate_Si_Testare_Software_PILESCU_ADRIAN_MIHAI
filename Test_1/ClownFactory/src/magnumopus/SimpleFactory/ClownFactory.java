package magnumopus.SimpleFactory;

import magnumopus.models.Clown;
import magnumopus.models.HappyClown;
import magnumopus.models.SadClown;
import magnumopus.models.ScaryClown;

public class ClownFactory implements SimpleFactory {

    public Clown createClown(ClownTypes clownType, String costume, String shoes, String nose) {
        switch (clownType){
            case HappyClown:
                return new HappyClown(costume, shoes, nose);
            case SadClown:
                return new SadClown(costume, shoes, nose);
            case ScaryClown:
                return new ScaryClown(costume, shoes, nose);
            default:
                return null;
        }


    }


}
