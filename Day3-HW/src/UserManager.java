
public class UserManager {
	private User user;

	public UserManager(User user) {
		super();
		this.user = user;
	}
	
	public void logIn(User user) {
		//logIn func
	};
	public void changePassword(User user) {
		//change password
	}
	public void logOut(User user) {
		//logOut Func
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
