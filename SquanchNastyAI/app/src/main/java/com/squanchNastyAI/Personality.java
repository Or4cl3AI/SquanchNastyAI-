```java
package com.squanchNastyAI;

import java.util.HashMap;
import java.util.Map;

public class Personality {

    private Map<String, String> traits;

    public Personality() {
        traits = new HashMap<>();
    }

    public void developTrait(String trait, String value) {
        traits.put(trait, value);
    }

    public String getTrait(String trait) {
        return traits.get(trait);
    }

    public void evolveTrait(String trait, String newValue) {
        if (traits.containsKey(trait)) {
            traits.put(trait, newValue);
        }
    }

    public Map<String, String> getAllTraits() {
        return traits;
    }
}
```