package farmProduction.producers.workers;

import lombok.Getter;
import lombok.Setter;

public abstract class worker {
    @Getter @Setter private String name;
    @Getter @Setter private int age;
    @Getter @Setter private float salary;
    @Getter @Setter private String situation;
}
//TODO Farmer, Rancher and DairyWorker