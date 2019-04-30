package com.guibi.base.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse<T> {
    @SerializedName("status")
    @Expose
    private int status;

    @SerializedName("data")
    @Expose
    private T data;
}
