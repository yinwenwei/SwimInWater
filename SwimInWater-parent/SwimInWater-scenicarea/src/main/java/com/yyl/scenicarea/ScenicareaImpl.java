package com.yyl.scenicarea;

import java.util.List;

import com.yyl.api.scenicarea.ScenicareaApi;
import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Scenicspot;

public class ScenicareaImpl implements ScenicareaApi {

	@Override
	public List<Scenicspot> findScenicspotAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dictionary> findScenicRegion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> findHotelAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Scenicspot> findScenicspotBySNameOrSCity(String sName,
			String sCity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Line> findLine(String lName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Line> findLineLikeLNameOrSPrice(String lName, Integer sPrice) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
