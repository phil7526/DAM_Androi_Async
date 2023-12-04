package com.example.dam_androi_async;

public class Connexion_Response {
    private String received_data;
    private int receiver_error_code;

    public Connexion_Response() {
    }

    public String getReceived_data() {
        return received_data;
    }

    public void setReceived_data(String received_data) {
        this.received_data = received_data;
    }

    public int getReceiver_error_code() {
        return receiver_error_code;
    }

    public void setReceiver_error_code(int receiver_error_code) {
        this.receiver_error_code = receiver_error_code;
    }
}
