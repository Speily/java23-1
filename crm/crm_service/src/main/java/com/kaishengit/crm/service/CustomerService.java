package com.kaishengit.crm.service;

import com.github.pagehelper.PageInfo;
import com.kaishengit.crm.entity.Account;
import com.kaishengit.crm.entity.Customer;

import java.util.List;
import java.util.Map;

/**
 * 客户管理业务层
 */
public interface CustomerService {

    List<String> findAllTrade();
    List<String> findAllSource();

    void saveNewCustomer(Customer customer, Account account);

    PageInfo<Customer> findMyCustomer(Map<String,Object> queryParam);
}
