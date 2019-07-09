package com.zn.j1902.mapper;

import com.zn.j1902.pojo.Chexingkuguanli;
import com.zn.j1902.pojo.ChexingkuguanliExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChexingkuguanliMapper {
    int countByExample(ChexingkuguanliExample example);

    int deleteByExample(ChexingkuguanliExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Chexingkuguanli record);

    int insertSelective(Chexingkuguanli record);

    List<Chexingkuguanli> selectByExample(ChexingkuguanliExample example);

    Chexingkuguanli selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Chexingkuguanli record, @Param("example") ChexingkuguanliExample example);

    int updateByExample(@Param("record") Chexingkuguanli record, @Param("example") ChexingkuguanliExample example);

    int updateByPrimaryKeySelective(Chexingkuguanli record);

    int updateByPrimaryKey(Chexingkuguanli record);
    public void updatePingpai(@Param("id") Long id,
                              @Param("pingpai") String pingpai,
                              @Param("changshang") String changshang,
                              @Param("chexi") String chexi,
                              @Param("leixing") String leixing,
                              @Param("chexing") String chexing,
                              @Param("niankuan") String niankuan,
                              @Param("status") Byte status,
                              @Param("created") Date created);
    public void deletePingPaiById(long id);
}