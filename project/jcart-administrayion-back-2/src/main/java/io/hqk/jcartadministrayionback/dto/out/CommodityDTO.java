package io.hqk.jcartadministrayionback.dto.out;

public class CommodityDTO {
    private Integer productId;
    private Integer productCode;
    private Integer discount;
    private Integer sortOrde;
    private Integer stockQuantity;
    private Integer rewordPoints;
    private String productName;
    private String status;
    private double price;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getSortOrde() {
        return sortOrde;
    }

    public void setSortOrde(Integer sortOrde) {
        this.sortOrde = sortOrde;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getRewordPoints() {
        return rewordPoints;
    }

    public void setRewordPoints(Integer rewordPoints) {
        this.rewordPoints = rewordPoints;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CommodityDTO() {
    }

    public CommodityDTO(Integer productId, Integer productCode, Integer discount, Integer sortOrde, Integer stockQuantity, Integer rewordPoints, String productName, String status, double price) {
        this.productId = productId;
        this.productCode = productCode;
        this.discount = discount;
        this.sortOrde = sortOrde;
        this.stockQuantity = stockQuantity;
        this.rewordPoints = rewordPoints;
        this.productName = productName;
        this.status = status;
        this.price = price;
    }
}
