package com.opensource.techblog.springmvc.portlet1.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.opensource.techblog.springmvc.portlet1.model.Product;
import com.opensource.techblog.springmvc.portlet1.model.ProductModel;
import com.opensource.techblog.springmvc.portlet1.model.ProductSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Product service. Represents a row in the &quot;legalwiz_Product&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.opensource.techblog.springmvc.portlet1.model.ProductModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProductImpl}.
 * </p>
 *
 * @author LegalWiz
 * @see ProductImpl
 * @see com.opensource.techblog.springmvc.portlet1.model.Product
 * @see com.opensource.techblog.springmvc.portlet1.model.ProductModel
 * @generated
 */
@JSON(strict = true)
public class ProductModelImpl extends BaseModelImpl<Product>
    implements ProductModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a product model instance should use the {@link com.opensource.techblog.springmvc.portlet1.model.Product} interface instead.
     */
    public static final String TABLE_NAME = "legalwiz_Product";
    public static final Object[][] TABLE_COLUMNS = {
            { "productId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "productName", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table legalwiz_Product (productId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,productName VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table legalwiz_Product";
    public static final String ORDER_BY_JPQL = " ORDER BY product.productId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY legalwiz_Product.productId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.opensource.techblog.springmvc.portlet1.model.Product"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.opensource.techblog.springmvc.portlet1.model.Product"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.opensource.techblog.springmvc.portlet1.model.Product"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long PRODUCTID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.opensource.techblog.springmvc.portlet1.model.Product"));
    private static ClassLoader _classLoader = Product.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Product.class
        };
    private long _productId;
    private long _originalProductId;
    private boolean _setOriginalProductId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private long _userId;
    private String _userUuid;
    private String _productName;
    private long _columnBitmask;
    private Product _escapedModel;

    public ProductModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Product toModel(ProductSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Product model = new ProductImpl();

        model.setProductId(soapModel.getProductId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setProductName(soapModel.getProductName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Product> toModels(ProductSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Product> models = new ArrayList<Product>(soapModels.length);

        for (ProductSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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

    @JSON
    @Override
    public long getProductId() {
        return _productId;
    }

    @Override
    public void setProductId(long productId) {
        _columnBitmask |= PRODUCTID_COLUMN_BITMASK;

        if (!_setOriginalProductId) {
            _setOriginalProductId = true;

            _originalProductId = _productId;
        }

        _productId = productId;
    }

    public long getOriginalProductId() {
        return _originalProductId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _columnBitmask |= COMPANYID_COLUMN_BITMASK;

        if (!_setOriginalCompanyId) {
            _setOriginalCompanyId = true;

            _originalCompanyId = _companyId;
        }

        _companyId = companyId;
    }

    public long getOriginalCompanyId() {
        return _originalCompanyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getProductName() {
        if (_productName == null) {
            return StringPool.BLANK;
        } else {
            return _productName;
        }
    }

    @Override
    public void setProductName(String productName) {
        _productName = productName;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Product.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Product toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Product) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        ProductImpl productImpl = new ProductImpl();

        productImpl.setProductId(getProductId());
        productImpl.setGroupId(getGroupId());
        productImpl.setCompanyId(getCompanyId());
        productImpl.setUserId(getUserId());
        productImpl.setProductName(getProductName());

        productImpl.resetOriginalValues();

        return productImpl;
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

        if (!(obj instanceof Product)) {
            return false;
        }

        Product product = (Product) obj;

        long primaryKey = product.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        ProductModelImpl productModelImpl = this;

        productModelImpl._originalProductId = productModelImpl._productId;

        productModelImpl._setOriginalProductId = false;

        productModelImpl._originalGroupId = productModelImpl._groupId;

        productModelImpl._setOriginalGroupId = false;

        productModelImpl._originalCompanyId = productModelImpl._companyId;

        productModelImpl._setOriginalCompanyId = false;

        productModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Product> toCacheModel() {
        ProductCacheModel productCacheModel = new ProductCacheModel();

        productCacheModel.productId = getProductId();

        productCacheModel.groupId = getGroupId();

        productCacheModel.companyId = getCompanyId();

        productCacheModel.userId = getUserId();

        productCacheModel.productName = getProductName();

        String productName = productCacheModel.productName;

        if ((productName != null) && (productName.length() == 0)) {
            productCacheModel.productName = null;
        }

        return productCacheModel;
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
