package retrofit2livedataadapter.vn.com.vermoric.retrofit2livedataadapter;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

/**
 * http://innotech.vn
 * Created by Huynh Van Duc on 11/1/2018.
 */
public class User {
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("website")
    private String website;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @NonNull
    @Override
    public String toString() {
        return "id: " + id +"\nname: " + name + "\nusername: " + username + "\nemail: " + email
                + "\nphone: " + phone + "\nwebsite: " + website;
    }
}
