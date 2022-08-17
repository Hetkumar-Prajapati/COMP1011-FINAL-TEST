package ca.georgiancollege.comp1011m2022finaltest;
import com.google.gson.annotations.SerializedName;

public class Product {

  @SerializedName("id")
  private String m_id;

  @SerializedName("sku")
  private String m_sku;

  @SerializedName("name")
  private String m_name;

  @SerializedName("salePrice")
  private double m_salePrice;

  @SerializedName("regularPrice")
  private double m_regularPrice;

  @SerializedName("image")
  private String m_image;

  //Getters and Setters (Mutators and accessors)
  public String getId() {
    return m_id;
  }

  public void setId(String m_id) {
    this.m_id = m_id;
  }

  public String getSku() {
    return m_sku;
  }

  public void setSku(String m_sku) {
    this.m_sku = m_sku;
  }

  public String getName() {
    return m_name;
  }

  public void setName(String m_name) {
    this.m_name = m_name;
  }

  public double getSalePrice() {
    return m_salePrice;
  }

  public void setSalePrice(double m_salePrice) {
    this.m_salePrice = m_salePrice;
  }

  public double getRegularPrice() {
    return m_regularPrice;
  }

  public void setRegularPrice(double m_regularPrice) {
    this.m_regularPrice = m_regularPrice;
  }

  public String getImage() {
    return m_image;
  }

  public void setImage(String m_image) {
    this.m_image = m_image;
  }

  //Constructors
  public Product()
  {
    this.m_id = "";
    this.m_sku = "";
    this.m_name = "";
    this.m_salePrice= Double.parseDouble("");
    this.m_regularPrice = Double.parseDouble("");
    this.m_image = "";
  }

  public Product(String id, String sku, String name, double salePrice, double regularPrice, String image) {
    this.m_id = id;
    this.m_sku = sku;
    this.m_name = name;
    this.m_salePrice = salePrice;
    this.m_regularPrice = regularPrice;
    this.m_image = image;
  }

  //Overridden methods

  @Override
  public String toString() {

        /*
        return String.format("id: %s%n sku: %s%n name: %s%n salePrice: %s%n regularPrice: %s%n image: %s%n ",
                getId(), getSku(), getName(), getSalePrice(), getRegularPrice(), getImage() );

         */


    return String.format("[name]-$[sale price]",
           getName(), getSalePrice());
  }
}
