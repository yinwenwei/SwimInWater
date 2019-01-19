package com.yyl.web.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.yyl.api.ModelApiImpl;
/**
 * 获取主题城市
 * @ClassName: GetThemCity
 * @author lkw
 * @date 2019年1月14日 下午10:14:47
 *
 */
@Component
public class GetThemCity {
	// 主题城市
	public static String themeCity;
	private static final String THEME_CITY_FIRST = "马尔代夫";
	@Resource
	private ModelApiImpl modelApi;
	
	static{
		themeCity = THEME_CITY_FIRST;
	}
	// 开启服务调度器就运行,随机城市主题
//		@Scheduled(cron=" 0 0 0 * * ?")//每天凌晨刷一次
// 	@Scheduled(cron=" 0 0 0/4 * * ?")//4小时刷一次 
	@Scheduled(cron=" 0 0/1 * * * ?")//1分钟刷一次 
	public void flushCity(){
		List<String> list = modelApi.getScenicareaApi().findAllCity();
        int index = (int) (Math.random()* list.size());
        themeCity = list.get(index);
        String time = new SimpleDateFormat("MM-dd HH:mm:ss").format(new Date());
		System.out.println(time +"[quariz]com.yyl.web.IndexController:flushCity()-Method "
				+ "主题城市调度器正在执行,城市:"+themeCity);
	}
}
