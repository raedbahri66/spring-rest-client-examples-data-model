package com.bahri.springrestclientexamples;

import com.bahri.api.domain.UserData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest{
    @Autowired
    ApiService apiService;

    public void setUp() throws Exception {
    }

    @Test
    public void testGetUsers() {

        UserData userData = apiService.getUsers(3);
        assertEquals(3,userData.getData().size());
        System.out.println(userData);
    }
}