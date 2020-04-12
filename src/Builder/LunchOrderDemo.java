package Builder;

public class LunchOrderDemo {
	
	public static void main(String args[]) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.setBread("Wheat").setDressing("Mayo").setMeat("Turkey").setCondiments("pepper");
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());	
	}
}
