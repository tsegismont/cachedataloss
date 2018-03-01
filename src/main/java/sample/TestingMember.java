package sample;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

import java.util.Scanner;

/**
 * @author Thomas Segismont
 */
public class TestingMember {

  public static void main(String[] args) throws Exception {

    DefaultCacheManager cacheManager = new DefaultCacheManager("infinispan.xml", true);

    System.out.println("Started");

    Cache<String, String> cache0 = cacheManager.getCache("cache-0");
    System.out.println("cache0.get(\"a\") = " + cache0.get("a"));
    System.out.println("cache0.get(\"b\") = " + cache0.get("b"));
    System.out.println("cache0.get(\"c\") = " + cache0.get("c"));

    Cache<String, String> cache1 = cacheManager.getCache("cache-1");
    System.out.println("cache1.get(\"a\") = " + cache1.get("a"));
    System.out.println("cache1.get(\"b\") = " + cache1.get("b"));
    System.out.println("cache1.get(\"c\") = " + cache1.get("c"));

    Cache<String, String> foo = cacheManager.getCache("foo");
    System.out.println("foo.get(\"a\") = " + foo.get("a"));
    System.out.println("foo.get(\"b\") = " + foo.get("b"));
    System.out.println("foo.get(\"c\") = " + foo.get("c"));

    System.out.println("Press ENTER to stop");
    new Scanner(System.in).nextLine();
    System.out.println("Stopping");
    cacheManager.stop();
  }

}
