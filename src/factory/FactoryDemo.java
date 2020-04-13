package factory;

public class FactoryDemo {
	// ~~~ purpose ~~~
	// 1. Common interface(when add new type, only need add one more class, don't need to change the interface)
	// 2. Doesn't expose instantiation logic
	// 3. Specified by architecture, implemented by user
	// ~~~ example ~~~
	// Calendar(different time zone, date format)
	// this example use pages and website(blog & shop)
	
	public static void main(String[] args) {
		// create BOLG type site
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(site.getPages());
		
		// create SHOP type site
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(site.getPages());
	}
}
