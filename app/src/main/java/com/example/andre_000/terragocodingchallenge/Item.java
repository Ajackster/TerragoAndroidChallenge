package com.example.andre_000.terragocodingchallenge;

/**
 * Created by andre_000 on 5/12/2016.
 */
public class Item
{

    private String userID;
    private String firstName;
    private String lastName;
    private String username;

    public Item(String userID, String firstName, String lastName, String username)
    {
        super();
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
