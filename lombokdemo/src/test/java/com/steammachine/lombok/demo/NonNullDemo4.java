package com.steammachine.lombok.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NonNullDemo4 {

    @NonNull
    private String data;


    public void setData2(String data) {
        this.data = data;
    }
}
