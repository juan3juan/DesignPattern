package Builder;

public class LunchOrder {
	// ~~~ purpose ~~~
	// 1. Handle complex constructors
	// 2. Large number of params
	// 3. Immutability
	// ~~~ example ~~~
	// StringBuilder
	
	public static class Builder{
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public Builder() {
			
		}
		
		public LunchOrder build() {
			// this refer to Builder class instance
			return new LunchOrder(this);
		}
		
		public Builder setBread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder setCondiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		
		public Builder setDressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public Builder setMeat(String meat) {
			this.meat = meat;
			return this;
		}
	}
	
	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;
	
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}
	
	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}
	
	public String getDressing() {
		return dressing;
	}
	
	public String getMeat() {
		return meat;
	}
}
