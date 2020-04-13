package abstractFactory;

public class AbstractFactoryDemo {
	// ~~~ purpose ~~~
	// 1. Factory of Factories
	// 2. Factory of related objects
	// 3. Common Interface
	// 4. Framework pattern
	// ~~~ example ~~~
	// very good explanation: https://www.zhihu.com/question/20367734
	
	
	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card2.getClass());
	}
}
