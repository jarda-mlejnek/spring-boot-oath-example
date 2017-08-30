package com.jmlejnek.spring.oauth.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(AccountController.MAPPING)
public class AccountController {

    public static final String MAPPING = "/accounts";

    @RequestMapping(method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return Arrays.asList(new Account("test", "Jan", "Novak"));
    }

    class Account {

        private String login;
        private String firstName;
        private String lastName;

        public Account(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
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
    }
}
