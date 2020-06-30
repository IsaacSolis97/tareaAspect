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
		if(userTF=="pepe" && passTF=="123") {
			return true;
		}else if(userTF=="maria" && passTF=="321") {
			return true;
		}else {
			return false;
		}
	}
}
