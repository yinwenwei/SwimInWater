package com.yyl.scenicarea.service.scenicspot;
import com.yyl.entity.Picture;
import com.yyl.entity.ScenInfo;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.PageBean;
import com.yyl.scenicarea.repository.scenicspot.ScenicspotQueryMapper;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class ScenicspotQueryServiceImpl implements ScenicspotQueryService {
	private Logger logger = LoggerFactory.getLogger(ScenicspotQueryServiceImpl.class);
    @Resource
    private ScenicspotQueryMapper scenicspotQueryMapper;
    //solr服务
    @Resource
    private SolrServer solrServer;

    public Scenicspot getScenicspotById(Integer id){
        try {
			 return scenicspotQueryMapper.getScenicspotById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Scenicspot> getScenicspotListByMap(Map<String,Object> param){
        try {
			return scenicspotQueryMapper.getScenicspotListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getScenicspotCountByMap(Map<String,Object> param){
        try {
			return scenicspotQueryMapper.getScenicspotCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<Scenicspot> queryScenicspotPageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = scenicspotQueryMapper.getScenicspotCountByMap(param);
            PageBean<Scenicspot> pageBean = new PageBean<Scenicspot>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Scenicspot> scenicspotList = scenicspotQueryMapper.getScenicspotListByMap(param);
            pageBean.setList(scenicspotList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
    
    /**
     * 根据景点id查询景点图片
     */
	@Override
	public List<Picture> findScenicspotPictureByPTypeId(Integer pTypeId) {
		// TODO Auto-generated method stub
		try {
			return scenicspotQueryMapper.findScenicspotPictureByPTypeId(pTypeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> findAllCity() {
		return scenicspotQueryMapper.findAllCity();
	}
	
	/**
	 * 根据分区查询景点信息
	 */
	@Override
	public List<Scenicspot> findScenPicAll() {
		// TODO Auto-generated method stub
		return scenicspotQueryMapper.findScenPicAll();
	}
	
	@Override
	public Integer getScenicspotCountBySRegion(Map<String, Object> param) {
		// TODO Auto-generated method stub
		try {
			return scenicspotQueryMapper.getScenicspotCountBySRegion(param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据分区查询景点信息
	 */
	@Override
	public PageBean<Scenicspot> findScenicspotBySRegion(Map<String, Object> param, Integer size, Integer cur) {
		System.out.println("进入------------根据分区查询景点信息------------------");
		logger.debug("接收请求,参数:当前页：{}，显示数量：{}", cur, size );

		try {
			Integer total = scenicspotQueryMapper.getScenicspotCountBySRegion(param);
			System.err.println("境外游记录数:"+total);
			PageBean<Scenicspot> pageBean = new PageBean<Scenicspot>(total,size,cur);
			param.put("start", (pageBean.getCurrentPage()-1)*size);
			param.put("size", size);
			List<Scenicspot> scenicspotList = scenicspotQueryMapper.findScenicspotBySRegion(param);					
			pageBean.setList(scenicspotList);
			return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 查询景点收藏排行榜(降序排列)
	 */
	@Override
	public List<Scenicspot> findScenCollectionOrderByDesc() {
		// TODO Auto-generated method stub
		try {
			return scenicspotQueryMapper.findScenCollectionOrderByDesc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 人气旅游
	 */
	@Override
	public List<Scenicspot> findPopularTourism() {
		// TODO Auto-generated method stub
		return scenicspotQueryMapper.findPopularTourism();
	}
	
	/**
	 * 最新旅游
	 */
	@Override
	public List<Scenicspot> findNewestTourism() {
		// TODO Auto-generated method stub
		return scenicspotQueryMapper.findNewestTourism();
	}

	@Override
	public List<Scenicspot> findThemeTourism(String sCity) {
		// TODO Auto-generated method stub
		return scenicspotQueryMapper.findThemeTourism(sCity);
	}
	
	/**
	 * 将数据库查询信息存入solr索引库
	 */
	@Override
	public void importAllScenInfo() {
		//查询景点信息列表
		List<ScenInfo> scenList = scenicspotQueryMapper.findScenInfo();
		try {
			//把商品信息写入索引库
			for (ScenInfo scenInfo : scenList) {
				//创建一个SolrInputDocument对象
				SolrInputDocument document=new SolrInputDocument();
				document.setField("id", scenInfo.getId());
				document.setField("scen_sname", scenInfo.getsName());
				document.setField("scen_scity", scenInfo.getsCity());
				document.setField("scen_scontent", scenInfo.getsContent());
				document.setField("scen_sprice", scenInfo.getsPrice());
				document.setField("pic_pid", scenInfo.getPid());
				document.setField("pic_prelativepath", scenInfo.getpRelativePath());
				solrServer.add(document);
			}
			//提交solr服务
			solrServer.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
