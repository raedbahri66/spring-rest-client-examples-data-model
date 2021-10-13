package com.bahri.springrestclientexamples;

import com.bahri.api.domain.UserData;

public interface ApiService {

    UserData getUsers(Integer limit);
}
