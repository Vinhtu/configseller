package Model;

public class ProductModel {
	   private int id;
	   private String name;
	   private String price;
	   private String img;
	   private String alt_img;
	   private String description;
	   private String createByDate;
	   private String num_product;
	   private String promotion_id;
	   private String category_id;
	   private String type;
	   private long[] arrId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAlt_img() {
		return alt_img;
	}
	public void setAlt_img(String alt_img) {
		this.alt_img = alt_img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateByDate() {
		return createByDate;
	}
	public void setCreateByDate(String createByDate) {
		this.createByDate = createByDate;
	}
	public String getNum_product() {
		return num_product;
	}
	public void setNum_product(String num_product) {
		this.num_product = num_product;
	}
	public String getPromotion_id() {
		return promotion_id;
	}
	public void setPromotion_id(String promotion_id) {
		this.promotion_id = promotion_id;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public long[] getArrId() {
		return arrId;
	}
	public void setArrId(long[] arrId) {
		this.arrId = arrId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	   

}
