package com.yyl.api.eunms;

import org.springframework.stereotype.Component;

import com.yyl.entity.enums.HotelGrage;
import com.yyl.entity.enums.OrderStatus;
import com.yyl.entity.enums.PictureType;
import com.yyl.entity.enums.ScenicspotRegoin;
import com.yyl.entity.enums.ScenicspotStatus;
import com.yyl.entity.enums.UserRole;
import com.yyl.entity.enums.UserSex;
@Component
public class EnumsApiImpl implements EnumsApi{
	private final String  UNKNOW = "未知类型";

	@Override
	public String getUserRole(Integer index) {
		if(UserRole.MNAGER.getIndex() == index){
			return UserRole.MNAGER.getRole();
		}else if(UserRole.NORMAL.getIndex() == index){
			return UserRole.NORMAL.getRole();
		}else{
			return UNKNOW;
		}
	}

	@Override
	public String getScenicspotStatus(Integer index) {
		if(ScenicspotStatus.PUBLISH.getIndex() == index){
			return ScenicspotStatus.PUBLISH.getStatu();
		}else if(ScenicspotStatus.UNPUBLISH.getIndex() == index){
			return ScenicspotStatus.UNPUBLISH.getStatu();
		}else if(ScenicspotStatus.HOT.getIndex() == index){
			return ScenicspotStatus.HOT.getStatu();
		}else{
			return UNKNOW;
		}
	}

	@Override
	public String getScenicspotRegoin(Integer index) {
		if(ScenicspotRegoin.DOMESTIC.getIndex() == index){
			return ScenicspotRegoin.DOMESTIC.getRegoin();
		}else if(ScenicspotRegoin.FOREIGN.getIndex() == index){
			return ScenicspotRegoin.FOREIGN.getRegoin();
		}else if(ScenicspotRegoin.HK_AND_Maco.getIndex() == index){
			return ScenicspotRegoin.HK_AND_Maco.getRegoin();
		}else{
			return UNKNOW;
		}
	}

	@Override
	public String getUserSex(Integer index) {
		if(UserSex.MAN.getIndex() == index){
			return UserSex.MAN.getSex();
		}else if(UserSex.FEMALE.getIndex() == index){
			return UserSex.FEMALE.getSex();
		}else{
			return UNKNOW;
		}
	}

	@Override
	public String getHotelGrage(Integer index) {
		if(HotelGrage.FOUR_STAR.getIndex() == index){
			return HotelGrage.FOUR_STAR.getGrage();
		}else if(HotelGrage.FIVE_STAR.getIndex() == index){
			return HotelGrage.FIVE_STAR.getGrage();
		}else if(HotelGrage.SIX_STAR.getIndex() == index){
			return HotelGrage.SIX_STAR.getGrage();
		}else{
			return UNKNOW;
		}
	}

	@Override
	public String getOrderStatus(Integer index) {
		if(OrderStatus.PAY.getIndex() == index){
			return OrderStatus.PAY.getStatu();
		}else if(OrderStatus.UNPAY.getIndex() == index){
			return OrderStatus.UNPAY.getStatu();
		}else{
			return UNKNOW;
		}
	}

	@Override
	public String getPictureType(Integer index) {
		if(PictureType.USER_PIC.getIndex() == index){
			return PictureType.USER_PIC.getType();
		}else if(PictureType.SCENIC_PIC.getIndex() == index){
			return PictureType.SCENIC_PIC.getType();
		}else if(PictureType.HOTEL_PIC.getIndex() == index){
			return PictureType.HOTEL_PIC.getType();
		}else{
			return UNKNOW;
		}
	}


}
