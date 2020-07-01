package editor;

import java.util.ArrayList;

public class Autenticator {
	String[] users = {"pepe", "maria"};
	String[] pass = {"123", "321"};
	
	public Autenticator() {
		users=this.users;
		pass=this.pass;
	}
	public String[] getUser() {
		return users;	
	}
	public String[] getPass() {
		return pass;	
	}
	
	public boolean Initializer(String userTF,String passTF) {
		if(userTF==users[0] && passTF==pass[0]) {
			return true;
		}else if(userTF==users[1] && passTF==pass[1]) {
			return true;
		}else {
			return false;
		}
	}
}
