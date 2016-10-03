package product;

/**
 *
 * @author Sam Rizzo
 */
public class Product {
    
    //Declare private variables
    private String productDescription;
    private String productName;
    
    private int productNumber;
    
    private double productCost;
    
    /**
     * Product constructor that takes in the following parameters:
     * 
     * productDescription, productName, productNumber
     * 
     * @param productDescription
     * @param productName
     * @param productNumber 
     * @param productCost
     */
    public Product(String productDescription, String productName, 
            int productNumber, double productCost) {
        
        this.productDescription = productDescription;
        this.productName = productName;
        this.productNumber = productNumber;
        this.productCost = productCost;
        
    } // end of Product constructor
    
    /********** Mutator Methods *********/
    
    /**
     * This method sets the productDescription
     * @param productDescription 
     */
    public void setProductDescription(String productDescription) {
        
        this.productDescription = productDescription;
    }
    
    /**
     * This method sets the productName
     * @param productName 
     */
    public void setProductName(String productName) {
        
        this.productName = productName;
    }
    
    /**
     * This method sets the productNumber
     * @param productNumber 
     */
    public void setProductNumber(int productNumber) {
        
        this.productNumber = productNumber;
    }
    
    /**
     * This method sets the cost of the product
     * @param productCost
     */
    public void setProductCost(double productCost) {
        
        this.productCost = productCost;
    }
    
    /********** Accessor Methods **********/
    
    /**
     * This method returns the productDescription
     * @return 
     */
    public String getProductDescription() {
        
        return this.productDescription;
    }
    
    /**
     * This method returns the productName
     * @return 
     */
    public String getProductName() {
        
        return this.productName;
    }
    
    /**
     * This method returns the productNumber
     * @return 
     */
    public int getProductNumber() {
        
        return this.productNumber;
    }
    
    /**
     * This method returns the productCost
     * @return
     */
    public double getProductCost() {
        
        return this.productCost;
    }
    
    /**
     * This method returns a string representation 
     * of the product
     * @return 
     */
    @Override
    public String toString() {
        
        return String.format("Product Name: %s\nProduct Description: %s\n"
                + "Product Number: %d\nProduct Cost: %.2f", getProductName(), 
                getProductDescription(), getProductNumber(), getProductCost());
    }
    
} // end of Product class
