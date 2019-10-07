package com.opensource.techblog.springmvc.portlet1.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.opensource.techblog.springmvc.portlet1.service.ClpSerializer;
import com.opensource.techblog.springmvc.portlet1.service.ProductLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ProductClp extends BaseModelImpl<Product> implements Product {
    private long _productId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _productName;
    private BaseModel<?> _productRemoteModel;
    private Class<?> _clpSerializerClass = com.opensource.techblog.springmvc.portlet1.service.ClpSerializer.class;

    public ProductClp() {
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
    public long getPrimaryKey() {
        return _productId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setProductId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _productId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getProductId() {
        return _productId;
    }

    @Override
    public void setProductId(long productId) {
        _productId = productId;

        if (_productRemoteModel != null) {
            try {
                Class<?> clazz = _productRemoteModel.getClass();

                Method method = clazz.getMethod("setProductId", long.class);

                method.invoke(_productRemoteModel, productId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_productRemoteModel != null) {
            try {
                Class<?> clazz = _productRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_productRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_productRemoteModel != null) {
            try {
                Class<?> clazz = _productRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_productRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_productRemoteModel != null) {
            try {
                Class<?> clazz = _productRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_productRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getProductName() {
        return _productName;
    }

    @Override
    public void setProductName(String productName) {
        _productName = productName;

        if (_productRemoteModel != null) {
            try {
                Class<?> clazz = _productRemoteModel.getClass();

                Method method = clazz.getMethod("setProductName", String.class);

                method.invoke(_productRemoteModel, productName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getProductRemoteModel() {
        return _productRemoteModel;
    }

    public void setProductRemoteModel(BaseModel<?> productRemoteModel) {
        _productRemoteModel = productRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _productRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_productRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ProductLocalServiceUtil.addProduct(this);
        } else {
            ProductLocalServiceUtil.updateProduct(this);
        }
    }

    @Override
    public Product toEscapedModel() {
        return (Product) ProxyUtil.newProxyInstance(Product.class.getClassLoader(),
            new Class[] { Product.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ProductClp clone = new ProductClp();

        clone.setProductId(getProductId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setProductName(getProductName());

        return clone;
    }

    @Override
    public int compareTo(Product product) {
        long primaryKey = product.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ProductClp)) {
            return false;
        }

        ProductClp product = (ProductClp) obj;

        long primaryKey = product.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{productId=");
        sb.append(getProductId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", productName=");
        sb.append(getProductName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.opensource.techblog.springmvc.portlet1.model.Product");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>productId</column-name><column-value><![CDATA[");
        sb.append(getProductId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>productName</column-name><column-value><![CDATA[");
        sb.append(getProductName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
