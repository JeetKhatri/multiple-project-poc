package com.opensource.techblog.springmvc.portlet1.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.opensource.techblog.springmvc.portlet1.model.Product;
import com.opensource.techblog.springmvc.portlet1.service.ProductLocalServiceUtil;

/**
 * @author LegalWiz
 * @generated
 */
public abstract class ProductActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ProductActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ProductLocalServiceUtil.getService());
        setClass(Product.class);

        setClassLoader(com.opensource.techblog.springmvc.portlet1.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("productId");
    }
}
