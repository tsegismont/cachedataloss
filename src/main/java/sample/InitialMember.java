package sample;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

import java.util.Scanner;

/**
 * @author Thomas Segismont
 */
public class InitialMember {

  public static void main(String[] args) throws Exception {

    DefaultCacheManager cacheManager = new DefaultCacheManager("infinispan.xml", true);

    System.out.println("Started");

    Cache<String, String> cache0 = cacheManager.getCache("cache-0");
    cache0.put("a", "a");
    cache0.put("b", "b");
    cache0.put("c", "c");

    Cache<String, String> cache1 = cacheManager.getCache("cache-1");
    cache1.put("a", "d");
    cache1.put("b", "e");
    cache1.put("c", "f");

    Cache<String, String> foo = cacheManager.getCache("foo");
    foo.put("a", "g");
    foo.put("b", "h");
    foo.put("c", "i");

    System.out.println("Press ENTER to stop");
    new Scanner(System.in).nextLine();
    System.out.println("Stopping");
    cacheManager.stop();
  }
}
