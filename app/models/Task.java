package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Task extends Model {

    public String user;

    public String action;

    public String object;

    public Task(String user, String action, String object){

        this.user = user;
        this.action = action;
        this.object = object;

    }
    
    public static String getUser(String user) {
        String firstName = user.substring(0, 1).toUpperCase() + user.substring(1, user.indexOf("."));
        String lastName = user.substring(user.indexOf(".") + 1, user.indexOf(".") + 2).toUpperCase() + user.substring(user.indexOf(".") + 2, user.indexOf("@") - 2);
        return firstName + " " + lastName;
    }
}

