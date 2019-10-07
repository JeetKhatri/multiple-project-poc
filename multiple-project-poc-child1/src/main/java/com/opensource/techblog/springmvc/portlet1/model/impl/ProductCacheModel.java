package com.opensource.techblog.springmvc.portlet1.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.opensource.techblog.springmvc.portlet1.model.Product;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Product in entity cache.
 *
 * @author LegalWiz
 * @see Product
 * @generated
 */
public class ProductCacheModel implements CacheModel<Product>, Externalizable {
    public long productId;
    public long groupId;
    public long companyId;
    public long userId;
    public String productName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{productId=");
        sb.append(productId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", productName=");
        sb.append(productName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Product toEntityModel() {
        ProductImpl productImpl = new ProductImpl();

        productImpl.setProductId(productId);
        productImpl.setGroupId(groupId);
        productImpl.setCompanyId(companyId);
        productImpl.setUserId(userId);

        if (productName == null) {
            productImpl.setProductName(StringPool.BLANK);
        } else {
            productImpl.setProductName(productName);
        }

        productImpl.resetOriginalValues();

        return productImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        productId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        productName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(productId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (productName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(productName);
        }
    }
}
