package _10_basic_api_class.system_class;

import java.util.Map;
import java.util.Set;

public class SystemEnvExample {

    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME: " + javaHome);
        System.out.println();

        Map env = System.getenv();
        Set keys = env.keySet();
        for (Object key : keys) {
            System.out.println((String)key + ": " + env.get(key));
        }
    }

}
