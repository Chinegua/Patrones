package singleton.factory.solucion;

import java.util.HashMap;
import java.util.Map;

public class ReferenceFactory {

    private static final ReferenceFactory referenceFactory =  new ReferenceFactory();

    private Map<String, Integer> references;

    private int reference;
    
    private ReferenceFactory(){
        this.references = new HashMap<>();
        this.reference = 0;
    }
    
    public static ReferenceFactory getReferenceFactory(){
        return referenceFactory;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }
}
