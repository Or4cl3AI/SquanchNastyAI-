```java
package com.squanchNastyAI;

import java.util.HashMap;
import java.util.Map;

public class Memory {

    private Map<String, Object> memoryMap;

    public Memory() {
        memoryMap = new HashMap<>();
    }

    public void storeMemory(String key, Object value) {
        memoryMap.put(key, value);
    }

    public Object recallMemory(String key) {
        return memoryMap.get(key);
    }

    public boolean hasMemory(String key) {
        return memoryMap.containsKey(key);
    }

    public void clearMemory(String key) {
        memoryMap.remove(key);
    }

    public void clearAllMemory() {
        memoryMap.clear();
    }
}
```