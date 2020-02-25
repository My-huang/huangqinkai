package io.hqk.jcartadministrayionback.dto.out;

import java.util.Date;

public class AdministratorDTO {

    private Integer administrator_id;
    private String username;
    private String email;
    private String real_name;
    private String encrypted_password;
    private String avatar_url;
    private String status;
    private Date create_time;

    public Integer getAdministrator_id() {
        return administrator_id;
    }

    public void setAdministrator_id(Integer administrator_id) {
        this.administrator_id = administrator_id;
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

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getEncrypted_password() {
        return encrypted_password;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
