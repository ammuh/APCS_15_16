/**
 * 
 * @author Your name
 * Period #
 *
 */
public class CheckerDriver {
	public static void main(String[] args) {
		Checker myChecker = new SubstringChecker("broccoli");
		System.out.println("broccoli:" + myChecker.accept("broccoli"));
			System.out.println("I like broccoli:" + myChecker.accept("I like broccoli"));
		System.out.println("carrots are great:" + myChecker.accept("carrots are great"));
		System.out.println("Broccoli Bonanza:" + myChecker.accept("Broccoli Bonanza"));
		
		Checker bChecker = new SubstringChecker("beets");
		Checker cChecker = new SubstringChecker("carrots");
		Checker bothChecker= new AndChecker(bChecker, cChecker);
		
		System.out.println("I love beets and carrots:" + bothChecker.accept("I love beets and carrots"));
		System.out.println("beets are great:" + bothChecker.accept("beets are great"));
		System.out.println("artichokes, beets, and carrots:" + bothChecker.accept("artichokes, beets, and carrots"));
		
		Checker aChecker = new SubstringChecker("artichokes");
		Checker kChecker = new SubstringChecker("kale");
		Checker chChecker = new SubstringChecker("chocolate");

		System.out.println("chocolate truffles:" + bothChecker.accept("I love beets and carrots"));
		System.out.println("kale is great:" + bothChecker.accept("beets are great"));
		System.out.println("Yuck: artichokes & kale:" + bothChecker.accept("artichokes, beets, and carrots"));
	}

}
