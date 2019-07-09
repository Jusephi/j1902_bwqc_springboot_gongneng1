package com.zn.j1902.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zn.j1902.mapper.ChexingkuguanliMapper;
import com.zn.j1902.pojo.Chexingkuguanli;
import com.zn.j1902.pojo.ChexingkuguanliExample;
import com.zn.j1902.service.PingPaiService;
import com.zn.j1902.vo.EasyuiDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by 正宁 on 2019/7/5.
 */
@Service
public class PingPaiServiceImpl implements PingPaiService {
    @Autowired
    private ChexingkuguanliMapper chexingkuguanliMapper;
    @Override
    public EasyuiDataGridResult findPingpai(Integer page, Integer pageSize) {
        EasyuiDataGridResult dataGridResult=new EasyuiDataGridResult();
        ChexingkuguanliExample example=new ChexingkuguanliExample();
        PageHelper.startPage(page,pageSize);
        List<Chexingkuguanli> chexingkuguanlis=chexingkuguanliMapper.selectByExample(example);
        PageInfo<Chexingkuguanli> pageInfo=new PageInfo<>(chexingkuguanlis);//从数据集合中提取分页信息
        dataGridResult.setRows(chexingkuguanlis);//设置当前页结果集
        long total=pageInfo.getTotal();//获取总记录数
        dataGridResult.setTotal(total);
        return dataGridResult;
    }

    @Override
    public EasyuiDataGridResult findPingpai(Integer page, Integer pageSize, String pingpai) {
        EasyuiDataGridResult dataGridResult=new EasyuiDataGridResult();
        ChexingkuguanliExample example=new ChexingkuguanliExample();
        ChexingkuguanliExample.Criteria criteria=example.createCriteria();
        if(!StringUtils.isEmpty(pingpai)){
            criteria.andPingpaiLike("%"+pingpai+"%");
        }
        PageHelper.startPage(page,pageSize);
        List<Chexingkuguanli> chexingkuguanlis=chexingkuguanliMapper.selectByExample(example);
        PageInfo<Chexingkuguanli> pageInfo=new PageInfo<>(chexingkuguanlis);//从数据集合中提取分页信息
        dataGridResult.setRows(chexingkuguanlis);//设置当前页结果集
        long total=pageInfo.getTotal();//获取总记录数
        dataGridResult.setTotal(total);
        return dataGridResult;
    }
   /* @Override
    public EasyuiDataGridResult updatePingpai(Long id, String pingpai, String changshang, String chexi, String leixing, String chexing, String niankuan, Byte status, Date created) {
        EasyuiDataGridResult dataGridResult=new EasyuiDataGridResult();
        ChexingkuguanliExample example=new ChexingkuguanliExample();

        chexingkuguanliMapper.updateByExample(example);
        return null;
    }*/
}
