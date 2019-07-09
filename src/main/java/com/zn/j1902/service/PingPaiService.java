package com.zn.j1902.service;

import com.zn.j1902.vo.EasyuiDataGridResult;
import org.springframework.context.annotation.Primary;

import java.util.Date;

/**
 * Created by 正宁 on 2019/7/5.
 */
@Primary
public interface PingPaiService {
    public EasyuiDataGridResult findPingpai(Integer page,Integer pageSize);
    public EasyuiDataGridResult findPingpai(Integer page,Integer pageSize,String pingpai);
    public void updatePingpai(Long id,String pingpai,String changshang,
                                              String chexi,String leixing,String chexing,
                                              String niankuan,Byte status,Date created);

    public void deletePingPaiById(long id);
}
