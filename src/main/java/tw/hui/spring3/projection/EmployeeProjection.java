package tw.hui.spring3.projection;

import java.util.List;

import tw.hui.spring3.entity.Order;

/*
 * 方法名稱 -> Entity
 */
public interface EmployeeProjection {
//	String getLastName();
//	String getFirstName();
	String getTitle();
	List<Order> getOrders();
}
