package com.netease.accidence.entity;

public class Pet {

private String nickname;

private String strain2;

public String getNickname() {
    
    return nickname;
}

public void setNickname(String nickname) {
    
    this.nickname = nickname;
}

public String getStrian() {
    
    return strain2;
}

public void setStrian(String strain2) {
    
    this.strain2 = strain2;
}

@Override
public String toString() {
    
    return "Pet{" + "nickname='" + nickname + '\'' + ", strain2='" + strain2 + '\'' + '}';
}

}
