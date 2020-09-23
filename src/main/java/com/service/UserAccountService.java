package com.service;

import com.dao.UserAccountDAO;
import com.domain.UserAccount;

public class UserAccountService {

    private UserAccountDAO userAccountDAO;

    public UserAccountService(final UserAccountDAO userAccountDAO) {
        this.userAccountDAO = userAccountDAO;
    }

    public void registerUser(final String username, final String password, final String firstName, final String lastName) {
        if(userAccountDAO.isAccountExist(username)){
            throw new IllegalArgumentException("Username already exists");
        }
        userAccountDAO.create(new UserAccount(username, password, firstName, lastName));
    }

    public String getFullName(final String username) {
        UserAccount userAccount = userAccountDAO.getUserAccount(username);
        return userAccount.fullName();
    }
}
