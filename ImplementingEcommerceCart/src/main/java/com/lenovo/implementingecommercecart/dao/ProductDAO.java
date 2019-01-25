package com.lenovo.implementingecommercecart.dao;
 
import com.lenovo.implementingecommercecart.entity.Product;
import com.lenovo.implementingecommercecart.model.PaginationResult;
import com.lenovo.implementingecommercecart.model.ProductInfo;
 
public interface ProductDAO {
 
    
    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}