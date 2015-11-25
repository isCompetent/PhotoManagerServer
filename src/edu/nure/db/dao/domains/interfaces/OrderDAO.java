package edu.nure.db.dao.domains.interfaces;

import edu.nure.db.dao.exceptions.SelectException;
import edu.nure.db.entity.Order;

import java.util.List;

/**
 * Created by bod on 11.11.15.
 */
public interface OrderDAO extends GenericDAO<Order> {

    List<Order> getByResponsible(int respId) throws SelectException;
    List<Order> getByCustomer(int customerId) throws SelectException;
    List<Order> getActiveByResponsible(int respId) throws SelectException;
    List<Order> getActiveByCustomer(int customerId) throws SelectException;
    List<Order> getActiveById(int id) throws SelectException;

}
