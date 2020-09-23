package com;

import com.dao.UserAccountDAO;
import com.domain.UserAccount;

import java.util.HashMap;
import java.util.Map;

public class FakeUserAccountInMemoryDatabase implements UserAccountDAO {
    private final Map<String, UserAccount> userAccountMap = new HashMap<>();

    @Override
    public boolean isAccountExist(final String username) {
        return userAccountMap.containsKey(username);
    }

    @Override
    public void create(final UserAccount account) {
        userAccountMap.put(account.getUserName(), account);
    }

    @Override
    public UserAccount getUserAccount(final String username) {
        return userAccountMap.get(username);
    }
}
