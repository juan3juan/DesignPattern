package proxy;

public class TwitterDemo {

	// ~~~ purpose ~~~
	// 1. Interface by wrapping
	// 2. Can add functionality
	// 3. Secutiry, Simplicity, Remote, Cost
	// 4. Proxy called to access real object
	// ~~~ example ~~~
	// java.lang.reflect.Proxy
	// brief example: https://blog.csdn.net/carson_ho/article/details/54910472
	// this twitter example below can't be run, because I didn't config twitter 
	
	public static void main(String[] args) {
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());
		
		System.out.println(service.getTimeline("bh5k"));
		
		service.postToTimeline("bh5k", "Some message that shouldn't go through.");
	}
}
