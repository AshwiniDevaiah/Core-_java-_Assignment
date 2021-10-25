package Basic;

import java.time.LocalDateTime;


public class User {

	private final UserType type;
    private final String userName;
    private final LocalDateTime joiningDate;
    
    /*
     * Could add more fields like name, address etc etc.
     */

    public User(UserType type, String userName) {
        this.type = type;
        this.userName = userName;
        joiningDate = LocalDateTime.now();
    }
    
    public User(UserType type, String userName, LocalDateTime joiningDate) {
        this.type = type;
        this.userName = userName;
        this.joiningDate = joiningDate;
    }

	public UserType getType() {
		return type;
	}

	public String getUserName() {
		return userName;
	}

	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}

	
}
