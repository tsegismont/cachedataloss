package sample;

import org.infinispan.health.ClusterHealth;
import org.infinispan.manager.DefaultCacheManager;

import java.util.Scanner;

/**
 * @author Thomas Segismont
 */
public class NewMemberWithStatusCheck {

  public static void main(String[] args) throws Exception {

    DefaultCacheManager cacheManager = new DefaultCacheManager("infinispan.xml", true);

    System.out.println("Started");

    ClusterHealth clusterHealth = cacheManager.getHealth().getClusterHealth();
    System.out.println("clusterHealth.getHealthStatus() = " + clusterHealth.getHealthStatus());

    System.out.println("Press ENTER to stop");
    new Scanner(System.in).nextLine();
    System.out.println("Stopping");
    cacheManager.stop();
  }

}
