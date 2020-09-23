package com.dao;

import com.domain.UserAccount;

public interface UserAccountDAO {

    boolean isAccountExist(String username);

    void create(final UserAccount expectedUserAccount);

    UserAccount getUserAccount(String username);
}
