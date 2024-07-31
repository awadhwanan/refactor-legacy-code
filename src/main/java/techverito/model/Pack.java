package techverito.model;

import techverito.constants.BasepackTypes;

public class Pack {

	String packType;
	String monthlyPrice;
	String months;
	
	public String getPackType() {
		String fullStringPackType = "";
		switch(packType){
			case "G":
				fullStringPackType = "Gold";
				break;
			case "S":
				fullStringPackType = "Silver";
				break;
		}
		return fullStringPackType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	public String getMonthlyPrice() {
		if(getPackType().equals("Gold"))
			return BasepackTypes.GoldPack.getValue();
		else if(getPackType().equals("Silver")){
			return BasepackTypes.SilverPack.getValue();
		}
		return BasepackTypes.GoldPack.getValue();
	}
	public void setMonthlyPrice(String monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
	}
	
}
