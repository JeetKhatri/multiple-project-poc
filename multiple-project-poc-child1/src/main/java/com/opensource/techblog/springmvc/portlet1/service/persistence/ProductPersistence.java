package com.opensource.techblog.springmvc.portlet1.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.opensource.techblog.springmvc.portlet1.model.Product;

/**
 * The persistence interface for the product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LegalWiz
 * @see ProductPersistenceImpl
 * @see ProductUtil
 * @generated
 */
public interface ProductPersistence extends BasePersistence<Product> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ProductUtil} to access the product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the products where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the products where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.springmvc.portlet1.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of products
    * @param end the upper bound of the range of products (not inclusive)
    * @return the range of matching products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the products where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.springmvc.portlet1.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of products
    * @param end the upper bound of the range of products (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first product in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Returns the first product in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last product in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Returns the last product in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the products before and after the current product in the ordered set where groupId = &#63;.
    *
    * @param productId the primary key of the current product
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product[] findByGroupId_PrevAndNext(
        long productId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Removes all the products where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of products where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching products
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the products where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the products where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.springmvc.portlet1.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of products
    * @param end the upper bound of the range of products (not inclusive)
    * @return the range of matching products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the products where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.springmvc.portlet1.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of products
    * @param end the upper bound of the range of products (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first product in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Returns the first product in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last product in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Returns the last product in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the products before and after the current product in the ordered set where companyId = &#63;.
    *
    * @param productId the primary key of the current product
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product[] findByCompanyId_PrevAndNext(
        long productId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Removes all the products where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of products where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching products
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the product where productId = &#63; or throws a {@link com.opensource.techblog.springmvc.portlet1.NoSuchProductException} if it could not be found.
    *
    * @param productId the product ID
    * @return the matching product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product findByProductDetails(
        long productId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Returns the product where productId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param productId the product ID
    * @return the matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product fetchByProductDetails(
        long productId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the product where productId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param productId the product ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching product, or <code>null</code> if a matching product could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product fetchByProductDetails(
        long productId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the product where productId = &#63; from the database.
    *
    * @param productId the product ID
    * @return the product that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product removeByProductDetails(
        long productId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Returns the number of products where productId = &#63;.
    *
    * @param productId the product ID
    * @return the number of matching products
    * @throws SystemException if a system exception occurred
    */
    public int countByProductDetails(long productId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the product in the entity cache if it is enabled.
    *
    * @param product the product
    */
    public void cacheResult(
        com.opensource.techblog.springmvc.portlet1.model.Product product);

    /**
    * Caches the products in the entity cache if it is enabled.
    *
    * @param products the products
    */
    public void cacheResult(
        java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> products);

    /**
    * Creates a new product with the primary key. Does not add the product to the database.
    *
    * @param productId the primary key for the new product
    * @return the new product
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product create(
        long productId);

    /**
    * Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param productId the primary key of the product
    * @return the product that was removed
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product remove(
        long productId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    public com.opensource.techblog.springmvc.portlet1.model.Product updateImpl(
        com.opensource.techblog.springmvc.portlet1.model.Product product)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the product with the primary key or throws a {@link com.opensource.techblog.springmvc.portlet1.NoSuchProductException} if it could not be found.
    *
    * @param productId the primary key of the product
    * @return the product
    * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product findByPrimaryKey(
        long productId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.opensource.techblog.springmvc.portlet1.NoSuchProductException;

    /**
    * Returns the product with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param productId the primary key of the product
    * @return the product, or <code>null</code> if a product with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.opensource.techblog.springmvc.portlet1.model.Product fetchByPrimaryKey(
        long productId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the products.
    *
    * @return the products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the products.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.springmvc.portlet1.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of products
    * @param end the upper bound of the range of products (not inclusive)
    * @return the range of products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the products.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.springmvc.portlet1.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of products
    * @param end the upper bound of the range of products (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of products
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.opensource.techblog.springmvc.portlet1.model.Product> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the products from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of products.
    *
    * @return the number of products
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
