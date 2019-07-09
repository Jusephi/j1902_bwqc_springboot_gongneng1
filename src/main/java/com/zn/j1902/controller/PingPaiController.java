package com.zn.j1902.controller;

import com.zn.j1902.service.PingPaiService;
import com.zn.j1902.vo.EasyuiDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by 正宁 on 2019/7/5.
 */
@Controller
public class PingPaiController {
    @Autowired
    private PingPaiService pingPaiService;
    @RequestMapping(value="/pingpai",method = RequestMethod.POST)
    @ResponseBody
    public Object fetchPingPais(@RequestParam(value="page",defaultValue = "1") Integer page,
                             @RequestParam(value="rows",defaultValue = "5") Integer pageSize,
                             @RequestParam(value="pingpai",defaultValue="") String pingpai
    ){
        EasyuiDataGridResult pingpais = pingPaiService.findPingpai(page,pageSize,pingpai);
        return  pingpais;
    }

   /* @RequestMapping(value="/pingpaibianji",method = RequestMethod.POST)
    public String bianjipingpai(@RequestParam(value="id") long id,
                                @RequestParam(value="pingpai" ) String pingpai,
                                @RequestParam(value="changshang") String changshang,
                                @RequestParam(value="chexi") String chexi,
                                @RequestParam(value="leixing") String leixing,
                                @RequestParam(value="chexing") String chexing,
                                @RequestParam(value="niankuan") String niankuan,
                                @RequestParam(value="status") Byte status,
                                @RequestParam(value="created") Date created
                                ){
        pingPaiService.updatePingpai()
        return "redirect:pingpai";
    }*/
}
