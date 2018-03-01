package sample;

import org.infinispan.manager.DefaultCacheManager;

import java.util.Scanner;

/**
 * @author Thomas Segismont
 */
public class NewMember {

  public static void main(String[] args) throws Exception {

    DefaultCacheManager cacheManager = new DefaultCacheManager("infinispan.xml", true);

    System.out.println("Started");

    System.out.println("Press ENTER to stop");
    new Scanner(System.in).nextLine();
    System.out.println("Stopping");
    cacheManager.stop();
  }

}
