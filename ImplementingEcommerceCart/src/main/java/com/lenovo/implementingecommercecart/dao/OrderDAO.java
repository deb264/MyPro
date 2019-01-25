package com.lenovo.implementingecommercecart.dao;
 
import java.util.List;

import com.lenovo.implementingecommercecart.model.CartInfo;
import com.lenovo.implementingecommercecart.model.OrderDetailInfo;
import com.lenovo.implementingecommercecart.model.OrderInfo;
import com.lenovo.implementingecommercecart.model.PaginationResult;
 
public interface OrderDAO {
    
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}