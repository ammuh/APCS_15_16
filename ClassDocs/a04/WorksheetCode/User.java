

public class User {
    private String name;
	private int profileViews;
	private int friends;

	public static void main(String [] args)
	{
		System.out.printf("%f", 4.5);		
	}
	public User(String userName){
		name = userName;
		profileViews = 0;
		friends = 0;
	}

	public void viewProfile(int viewCount){
		profileViews += viewCount;
	} 
	public void addFriends(int friendAmount){
		friends += friendAmount;
	}
	public String getName(){
		return name;
	}
	public int getViews(){
		return profileViews;		
	}
	public int getFriends(){
		return friends;
	}
}
