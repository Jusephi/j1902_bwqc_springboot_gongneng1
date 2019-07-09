package com.zn.j1902.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by 正宁 on 2019/7/5.
 */
@Data
public class MsgResult {
    private int status;//响应的状态码
    private String message;//短消息
    private List<?> data;//传递的对象
}
