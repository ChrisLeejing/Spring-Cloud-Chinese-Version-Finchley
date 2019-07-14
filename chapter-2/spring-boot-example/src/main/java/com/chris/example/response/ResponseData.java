package com.chris.example.response;

import lombok.Data;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 20:04
 */
@Data
public class ResponseData {
    private Integer code = 200;
    private Boolean status;
    private String message;
    private Object data;

}
