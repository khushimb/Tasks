package com.xworkz.ObjectToString.internal;

public class Profile {
    private String username;
    private String email;
    private String role;

    public Profile(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Username:" + username + " Email:" + email + " Role:" + role;
    }

    @Override
    public int hashCode() {
        return 40;
    }
}
