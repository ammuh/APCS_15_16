
import ;

public class WebsiteDriver {
    public static void main(String [] args)
	{
		viewPage(10);
		addUsers(5);
		System.out.println(getViews());
		System.out.println(getUserCount());
		System.out.println(getViewsPerUser());		
	}
}
