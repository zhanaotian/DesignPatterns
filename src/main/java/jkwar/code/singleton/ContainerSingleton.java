package jkwar.code.singleton;

import javax.management.ObjectInstance;
import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 * 管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，降低用户的使用成本，降低耦合度
 */
public class ContainerSingleton {
    private static Map<String,Object> objectMap=new HashMap<String,Object>();

    public ContainerSingleton() {
    }

    public static void registerService(String key, ObjectInstance instance){
        if (objectMap.containsKey(key)) {
            objectMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }
}
