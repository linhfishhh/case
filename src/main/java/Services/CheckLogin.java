package Services;

import Daos.AdminDao;
import Models.admin;
import Models.user;

import javax.swing.*;
import java.sql.SQLException;

public class CheckLogin {
    public static boolean CheckAdminLogin(String username, String passwd) throws SQLException {
        admin admin=AdminDao.selectadmin();

        if(username.equals(admin.getUsername()) && passwd.equals(admin.getPasswd())){
            return true;
        }
        return false;
    }
    public static boolean CheckUserLogin(String username, String passwd) throws SQLException {
        user user=AdminDao.selectloginUser(username);
        if(user.getUsername().equals(username) && user.getPasswd().equals(passwd)){
            return true;
        }
        return false;
    }
}
