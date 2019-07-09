package com.zn.j1902.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by 正宁 on 2019/7/5.
 */
@Data
public class EasyuiDataGridResult {
    private long total;//总记录数
    private List<?> rows;//返回当前页结果集
}
