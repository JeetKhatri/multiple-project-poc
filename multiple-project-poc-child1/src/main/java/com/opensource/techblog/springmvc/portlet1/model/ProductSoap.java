package com.opensource.techblog.springmvc.portlet1.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.opensource.techblog.springmvc.portlet1.service.http.ProductServiceSoap}.
 *
 * @author LegalWiz
 * @see com.opensource.techblog.springmvc.portlet1.service.http.ProductServiceSoap
 * @generated
 */
public class ProductSoap implements Serializable {
    private long _productId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _productName;

    public ProductSoap() {
    }

    public static ProductSoap toSoapModel(Product model) {
        ProductSoap soapModel = new ProductSoap();

        soapModel.setProductId(model.getProductId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setProductName(model.getProductName());

        return soapModel;
    }

    public static ProductSoap[] toSoapModels(Product[] models) {
        ProductSoap[] soapModels = new ProductSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ProductSoap[][] toSoapModels(Product[][] models) {
        ProductSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ProductSoap[models.length][models[0].length];
        } else {
            soapModels = new ProductSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ProductSoap[] toSoapModels(List<Product> models) {
        List<ProductSoap> soapModels = new ArrayList<ProductSoap>(models.size());

        for (Product model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ProductSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _productId;
    }

    public void setPrimaryKey(long pk) {
        setProductId(pk);
    }

    public long getProductId() {
        return _productId;
    }

    public void setProductId(long productId) {
        _productId = productId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getProductName() {
        return _productName;
    }

    public void setProductName(String productName) {
        _productName = productName;
    }
}
