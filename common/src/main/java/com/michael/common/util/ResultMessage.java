package com.michael.common.util;

import java.io.Serializable;

/**
 * @Package: com.michael.common.util
 * @ClassName: ResultMessage
 * @Author: michael
 * @Date: 22:46
 * @Description: TODO
 */
public class ResultMessage implements Serializable {

    private static final long serialVersionUID = 3235115501112964539L;

    public ResultMessage() {
    }

    public ResultMessage(String message, boolean result) {
        this.message = message;
        this.result = result;
    }

    private String message;
    private boolean result;

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
}
