package application;

import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private Button loginCloseBtn;

	@FXML
	private Button loginSubmitBtn;

	@FXML
	private Button loginNewUserBtn;

	@FXML
	private TextField loginUsername;

	@FXML
	private TextField loginPassword;
	
	private String username;
	private String password;

	@FXML
	public void handleSubmitAction(ActionEvent event) {
		username = loginUsername.getText().trim();
		password = loginPassword.getText().trim();
		System.out.println("username=" + username);
		System.out.println("password=" + password);
		if (username.length() > 0 && password.length() > 0) {

			String sql = "select * from user where user_name='" + username + "' and user_pass = '" + password + "'";
			ResultSet res = ConnectDB.executeQuery(sql);
			try {
				if (res.next()) {
					System.out.println("login success");
				} else {
					System.out.println("login fail");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@FXML
	public void handleNewUserAction(ActionEvent event) {
		username = loginUsername.getText().trim();
		password = loginPassword.getText().trim();

		if (username.length() > 0 && password.length() > 0) {

			String sql = "select * from user where user_name='" + username + "' and user_pass = '" + password + "'";
			ResultSet res = ConnectDB.executeQuery(sql);
			try {
				if (res.next()) {
					System.out.println("The user already exists");
				} else {
					System.out.println("login fail");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
