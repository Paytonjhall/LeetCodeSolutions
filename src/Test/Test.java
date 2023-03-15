package Test;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class Test {
    public static void main(String[] args) {
        OperatingSystemMXBean operatingSystemMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        String name = operatingSystemMXBean.getName();
        String version = operatingSystemMXBean.getVersion();
        String architecture = operatingSystemMXBean.getArch();
        int availableProcessors = operatingSystemMXBean.getAvailableProcessors();
        System.out.print(name);
        System.out.print(" " + version);
        System.out.print(" " + architecture);
        System.out.println(" " + availableProcessors);

        System.gc();
    }
}
