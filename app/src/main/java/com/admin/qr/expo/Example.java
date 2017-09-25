package com.admin.qr.expo;

/**
 * Created by Севастьян on 25.09.2017.
 */
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("ticket_pk")
    @Expose
    private Integer ticketPk;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getTicketPk() {
        return ticketPk;
    }

    public void setTicketPk(Integer ticketPk) {
        this.ticketPk = ticketPk;
    }

}
