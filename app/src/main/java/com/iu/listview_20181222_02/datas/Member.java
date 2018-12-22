package com.iu.listview_20181222_02.datas;

public class Member {
    private String name;
    private String address;
    private String profileImageUrl;

    public Member(String name, String address, String profileImageUrl){
        this.name = name;
        this.address = address;
        this.profileImageUrl = profileImageUrl;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
