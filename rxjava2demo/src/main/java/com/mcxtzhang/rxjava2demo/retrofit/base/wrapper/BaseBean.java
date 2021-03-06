package com.mcxtzhang.rxjava2demo.retrofit.base.wrapper;

import com.google.gson.annotations.SerializedName;

/** 用于接受接口返回的没有data结构的bean
 * Created by zhangxutong .
 * Date: 16/04/10
 */
public class BaseBean<T> {

    /**
     *
     * flag : 1
     * message : 成功
     * result : true
     */

    @SerializedName("flag")
    private String flag;
    @SerializedName("message")
    private String message;
    @SerializedName("result")
    private boolean result;
    /**
     * status : 0
     * number : 10
     */

    @SerializedName("data")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                ", result=" + result +
                ", data=" + data +
                '}';
    }
}
