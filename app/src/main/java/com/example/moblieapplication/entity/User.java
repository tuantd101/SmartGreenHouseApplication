package com.example.moblieapplication.entity;

public class User {
    private String username;
    private String email;
    private String phone;
    private String role;
    private int deviceCount;

    public User() {
    }

    public User(String username, String email, String phone, String role, int deviceCount) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.deviceCount = deviceCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
    }
}
