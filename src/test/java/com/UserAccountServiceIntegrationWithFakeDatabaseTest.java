package com;

import com.dao.UserAccountDAO;
import com.domain.UserAccount;
import com.service.UserAccountService;
import org.junit.jupiter.api.Test;

public class UserAccountServiceIntegrationWithFakeDatabaseTest {

    @Test
    public void should_Register_User_If_Username_Does_Not_Exist() {
        //arrange
        final UserAccountDAO userAccountDAO = new FakeUserAccountInMemoryDatabase();

        //act
        UserAccountService userAccountService = new UserAccountService(userAccountDAO);
        userAccountService.registerUser("lord_snow", "password", "Jon", "Snow");

        //assert
        final UserAccount jonsUserAccount = new UserAccount("lord_snow", "password", "Jon", "Snow");
        userAccountDAO.getUserAccount(jonsUserAccount.getUserName());
    }
}



