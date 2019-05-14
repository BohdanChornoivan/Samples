package com.dan.testregistration.logic;

import android.text.TextUtils;

public class Nickname {

    void nicknameValidation(String nickname) {
        if(TextUtils.isEmpty(nickname)) throw new ValidationExceptionNickname();
        if(nickname.equals("fuck")) throw new ValidationExceptionNickname();
    }

    class ValidationExceptionNickname extends RuntimeException{}
}
