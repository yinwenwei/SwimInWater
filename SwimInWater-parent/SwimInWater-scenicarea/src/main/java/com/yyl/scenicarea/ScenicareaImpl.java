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
		
		return null;
	}

	@Override
	public List<Dictionary> findScenicRegion() {
		return null;
	}

	@Override
	public List<Hotel> findHotelAll() {
		return null;
	}

	@Override
	public List<Scenicspot> findScenicspotBySNameOrSCity(String sName,
			String sCity) {
		return null;
	}

	@Override
	public List<Line> findLine(String lName) {
		return null;
	}

	@Override
	public List<Line> findLineLikeLNameOrSPrice(String lName, Integer sPrice) {
		return null;
	}
	
}
