package com.admin.qr.expo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Севастьян on 25.09.2017.
 */
//{
//        "ticket_pk": 50,
//        "result": true,
//        "hash": "ac6fc560c212b77d43ead7216bf230a3",
//        "email": "themezv@gmail.com"
//        }
public class User {
    @SerializedName("ticket_pk")
    @Expose
    private String ticket_pk;

    @SerializedName("result")
    @Expose
    private String result;

    @SerializedName("hash")
    @Expose
    private String hash;

    @SerializedName("email")
    @Expose
    private String email;

    public String getTicket_pk() {
        return ticket_pk;
    }

    public void setTicket_pk(String ticket_pk) {
        this.ticket_pk = ticket_pk;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
