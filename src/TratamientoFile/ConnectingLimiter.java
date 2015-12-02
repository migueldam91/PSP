package TratamientoFile;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Semaphore;

public class ConnectingLimiter {
	   private final Semaphore semaphore;

	   private ConnectingLimiter(int maxConcurrentRequests) {
	       semaphore = new Semaphore(maxConcurrentRequests);
	   }

	   public URLConnection acquire(URL url) throws InterruptedException,
	                                                IOException {
	       semaphore.acquire();
	       return url.openConnection();
	   }

	   public void release(URLConnection conn) {
	       try {
	           /*
	           * ... clean up here
	           */
	       } finally {
	           semaphore.release();
	       }
	   }
	}