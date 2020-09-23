package com;

import com.domain.UserAccount;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserAccountTest {
    @Test
    void should_create_user_account_successfully(){
        UserAccount userAccount = new UserAccount("lord_snow","password","Jon","Snow");
        assertThat(userAccount.getUserName()).isEqualTo("lord_snow");
        assertThat(userAccount.getPassword()).isEqualTo("password");
        assertThat(userAccount.getFirstName()).isEqualTo("Jon");
        assertThat(userAccount.getLastName()).isEqualTo("Snow");
    }
}
