package org.example.one;

public class Auth {
    public User login() {
        int n = 0;
        if (n > 0) {
            return new MyTwitterUser(new TwitterUser());
        } else {
            return new MyFacebookUser(new FacebookUser());
        }
    }
    public void processDatA(User user) {
        if (user instanceof TwitterUser) {
            String country = user.getCountry();
        }

    }
}