package com.yyl.web.frontend;

import com.yyl.api.ModelApi;
import com.yyl.entity.Hotel;
import com.yyl.entity.Scenicspot;
import com.yyl.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {
    private static Logger LOG = LoggerFactory.getLogger(OrderController.class);

    @Resource
    ModelApi modelApi;

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String book(@RequestParam("scenId") String scenId, @RequestParam("hotelId") String hotelId, Model model){
        LOG.info("接收到请求,请求订单页面,参数,景点ID:{},酒店ID:{}", scenId, hotelId);
        Map<String, Object> scenicspotById = null;
        if(null != scenId){
            scenicspotById = modelApi.getScenicareaApi().getScenicspotById(Integer.parseInt(scenId));
        }
        Scenicspot scenicspot= (Scenicspot) scenicspotById.get(Constants.MAP_SCEN);
        List<Hotel> hotelList = (List<Hotel>) scenicspotById.get(Constants.MAP_HOTEL);
        Hotel hotel = null;
        for (Hotel hotelElem : hotelList) {
            if(hotelId.equals(hotelElem.getId().toString())){
                hotel = hotelElem;
            }
        }
        model.addAttribute("scenicspot", scenicspot);
        model.addAttribute("hotel", hotel);
        LOG.info("处理请求,请求订单页面,结果,\n景点信息:{},\n酒店信息:{}", scenicspot, hotel);
        return "frontend/route_order_page";
    }

}
