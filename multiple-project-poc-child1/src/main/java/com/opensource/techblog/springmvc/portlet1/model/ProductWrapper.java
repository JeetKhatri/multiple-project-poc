package com.opensource.techblog.springmvc.portlet1.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Product}.
 * </p>
 *
 * @author LegalWiz
 * @see Product
 * @generated
 */
public class ProductWrapper implements Product, ModelWrapper<Product> {
    private Product _product;

    public ProductWrapper(Product product) {
        _product = product;
    }

    @Override
    public Class<?> getModelClass() {
        return Product.class;
    }

    @Override
    public String getModelClassName() {
        return Product.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("productId", getProductId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("productName", getProductName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long productId = (Long) attributes.get("productId");

        if (productId != null) {
            setProductId(productId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String productName = (String) attributes.get("productName");

        if (productName != null) {
            setProductName(productName);
        }
    }

    /**
    * Returns the primary key of this product.
    *
    * @return the primary key of this product
    */
    @Override
    public long getPrimaryKey() {
        return _product.getPrimaryKey();
    }

    /**
    * Sets the primary key of this product.
    *
    * @param primaryKey the primary key of this product
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _product.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the product ID of this product.
    *
    * @return the product ID of this product
    */
    @Override
    public long getProductId() {
        return _product.getProductId();
    }

    /**
    * Sets the product ID of this product.
    *
    * @param productId the product ID of this product
    */
    @Override
    public void setProductId(long productId) {
        _product.setProductId(productId);
    }

    /**
    * Returns the group ID of this product.
    *
    * @return the group ID of this product
    */
    @Override
    public long getGroupId() {
        return _product.getGroupId();
    }

    /**
    * Sets the group ID of this product.
    *
    * @param groupId the group ID of this product
    */
    @Override
    public void setGroupId(long groupId) {
        _product.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this product.
    *
    * @return the company ID of this product
    */
    @Override
    public long getCompanyId() {
        return _product.getCompanyId();
    }

    /**
    * Sets the company ID of this product.
    *
    * @param companyId the company ID of this product
    */
    @Override
    public void setCompanyId(long companyId) {
        _product.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this product.
    *
    * @return the user ID of this product
    */
    @Override
    public long getUserId() {
        return _product.getUserId();
    }

    /**
    * Sets the user ID of this product.
    *
    * @param userId the user ID of this product
    */
    @Override
    public void setUserId(long userId) {
        _product.setUserId(userId);
    }

    /**
    * Returns the user uuid of this product.
    *
    * @return the user uuid of this product
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _product.getUserUuid();
    }

    /**
    * Sets the user uuid of this product.
    *
    * @param userUuid the user uuid of this product
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _product.setUserUuid(userUuid);
    }

    /**
    * Returns the product name of this product.
    *
    * @return the product name of this product
    */
    @Override
    public java.lang.String getProductName() {
        return _product.getProductName();
    }

    /**
    * Sets the product name of this product.
    *
    * @param productName the product name of this product
    */
    @Override
    public void setProductName(java.lang.String productName) {
        _product.setProductName(productName);
    }

    @Override
    public boolean isNew() {
        return _product.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _product.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _product.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _product.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _product.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _product.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _product.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _product.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _product.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _product.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _product.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ProductWrapper((Product) _product.clone());
    }

    @Override
    public int compareTo(
        com.opensource.techblog.springmvc.portlet1.model.Product product) {
        return _product.compareTo(product);
    }

    @Override
    public int hashCode() {
        return _product.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.opensource.techblog.springmvc.portlet1.model.Product> toCacheModel() {
        return _product.toCacheModel();
    }

    @Override
    public com.opensource.techblog.springmvc.portlet1.model.Product toEscapedModel() {
        return new ProductWrapper(_product.toEscapedModel());
    }

    @Override
    public com.opensource.techblog.springmvc.portlet1.model.Product toUnescapedModel() {
        return new ProductWrapper(_product.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _product.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _product.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _product.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ProductWrapper)) {
            return false;
        }

        ProductWrapper productWrapper = (ProductWrapper) obj;

        if (Validator.equals(_product, productWrapper._product)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Product getWrappedProduct() {
        return _product;
    }

    @Override
    public Product getWrappedModel() {
        return _product;
    }

    @Override
    public void resetOriginalValues() {
        _product.resetOriginalValues();
    }
}
