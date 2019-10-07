package com.opensource.techblog.springmvc.portlet1.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.opensource.techblog.springmvc.portlet1.NoSuchProductException;
import com.opensource.techblog.springmvc.portlet1.model.Product;
import com.opensource.techblog.springmvc.portlet1.model.impl.ProductImpl;
import com.opensource.techblog.springmvc.portlet1.model.impl.ProductModelImpl;
import com.opensource.techblog.springmvc.portlet1.service.persistence.ProductPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LegalWiz
 * @see ProductPersistence
 * @see ProductUtil
 * @generated
 */
public class ProductPersistenceImpl extends BasePersistenceImpl<Product>
    implements ProductPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ProductUtil} to access the product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ProductImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, ProductImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, ProductImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, ProductImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, ProductImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            ProductModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "product.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, ProductImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, ProductImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            ProductModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "product.companyId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_PRODUCTDETAILS = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, ProductImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByProductDetails",
            new String[] { Long.class.getName() },
            ProductModelImpl.PRODUCTID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTDETAILS = new FinderPath(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductDetails",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_PRODUCTDETAILS_PRODUCTID_2 = "product.productId = ?";
    private static final String _SQL_SELECT_PRODUCT = "SELECT product FROM Product product";
    private static final String _SQL_SELECT_PRODUCT_WHERE = "SELECT product FROM Product product WHERE ";
    private static final String _SQL_COUNT_PRODUCT = "SELECT COUNT(product) FROM Product product";
    private static final String _SQL_COUNT_PRODUCT_WHERE = "SELECT COUNT(product) FROM Product product WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "product.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Product exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Product exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ProductPersistenceImpl.class);
    private static Product _nullProduct = new ProductImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Product> toCacheModel() {
                return _nullProductCacheModel;
            }
        };

    private static CacheModel<Product> _nullProductCacheModel = new CacheModel<Product>() {
            @Override
            public Product toEntityModel() {
                return _nullProduct;
            }
        };

    public ProductPersistenceImpl() {
        setModelClass(Product.class);
    }

    /**
     * Returns all the products where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching products
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Product> findByGroupId(long groupId) throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Product> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

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
    @Override
    public List<Product> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Product> list = (List<Product>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Product product : list) {
                if ((groupId != product.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PRODUCT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProductModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<Product>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Product>(list);
                } else {
                    list = (List<Product>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first product in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching product
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchProductException, SystemException {
        Product product = fetchByGroupId_First(groupId, orderByComparator);

        if (product != null) {
            return product;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductException(msg.toString());
    }

    /**
     * Returns the first product in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching product, or <code>null</code> if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Product> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last product in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching product
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchProductException, SystemException {
        Product product = fetchByGroupId_Last(groupId, orderByComparator);

        if (product != null) {
            return product;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductException(msg.toString());
    }

    /**
     * Returns the last product in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching product, or <code>null</code> if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<Product> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Product[] findByGroupId_PrevAndNext(long productId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchProductException, SystemException {
        Product product = findByPrimaryKey(productId);

        Session session = null;

        try {
            session = openSession();

            Product[] array = new ProductImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, product, groupId,
                    orderByComparator, true);

            array[1] = product;

            array[2] = getByGroupId_PrevAndNext(session, product, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Product getByGroupId_PrevAndNext(Session session,
        Product product, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCT_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ProductModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(product);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Product> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the products where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (Product product : findByGroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(product);
        }
    }

    /**
     * Returns the number of products where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching products
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PRODUCT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the products where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching products
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Product> findByCompanyId(long companyId)
        throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

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
    @Override
    public List<Product> findByCompanyId(long companyId, int start, int end)
        throws SystemException {
        return findByCompanyId(companyId, start, end, null);
    }

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
    @Override
    public List<Product> findByCompanyId(long companyId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId, start, end, orderByComparator };
        }

        List<Product> list = (List<Product>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Product product : list) {
                if ((companyId != product.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PRODUCT_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProductModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Product>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Product>(list);
                } else {
                    list = (List<Product>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first product in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching product
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchProductException, SystemException {
        Product product = fetchByCompanyId_First(companyId, orderByComparator);

        if (product != null) {
            return product;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductException(msg.toString());
    }

    /**
     * Returns the first product in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching product, or <code>null</code> if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Product> list = findByCompanyId(companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last product in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching product
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchProductException, SystemException {
        Product product = fetchByCompanyId_Last(companyId, orderByComparator);

        if (product != null) {
            return product;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductException(msg.toString());
    }

    /**
     * Returns the last product in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching product, or <code>null</code> if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        if (count == 0) {
            return null;
        }

        List<Product> list = findByCompanyId(companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Product[] findByCompanyId_PrevAndNext(long productId,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchProductException, SystemException {
        Product product = findByPrimaryKey(productId);

        Session session = null;

        try {
            session = openSession();

            Product[] array = new ProductImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session, product, companyId,
                    orderByComparator, true);

            array[1] = product;

            array[2] = getByCompanyId_PrevAndNext(session, product, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Product getByCompanyId_PrevAndNext(Session session,
        Product product, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCT_WHERE);

        query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ProductModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(product);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Product> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the products where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCompanyId(long companyId) throws SystemException {
        for (Product product : findByCompanyId(companyId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(product);
        }
    }

    /**
     * Returns the number of products where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching products
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCompanyId(long companyId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PRODUCT_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the product where productId = &#63; or throws a {@link com.opensource.techblog.springmvc.portlet1.NoSuchProductException} if it could not be found.
     *
     * @param productId the product ID
     * @return the matching product
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product findByProductDetails(long productId)
        throws NoSuchProductException, SystemException {
        Product product = fetchByProductDetails(productId);

        if (product == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("productId=");
            msg.append(productId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchProductException(msg.toString());
        }

        return product;
    }

    /**
     * Returns the product where productId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param productId the product ID
     * @return the matching product, or <code>null</code> if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByProductDetails(long productId)
        throws SystemException {
        return fetchByProductDetails(productId, true);
    }

    /**
     * Returns the product where productId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param productId the product ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching product, or <code>null</code> if a matching product could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByProductDetails(long productId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { productId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
                    finderArgs, this);
        }

        if (result instanceof Product) {
            Product product = (Product) result;

            if ((productId != product.getProductId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_PRODUCT_WHERE);

            query.append(_FINDER_COLUMN_PRODUCTDETAILS_PRODUCTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(productId);

                List<Product> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "ProductPersistenceImpl.fetchByProductDetails(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Product product = list.get(0);

                    result = product;

                    cacheResult(product);

                    if ((product.getProductId() != productId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
                            finderArgs, product);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Product) result;
        }
    }

    /**
     * Removes the product where productId = &#63; from the database.
     *
     * @param productId the product ID
     * @return the product that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product removeByProductDetails(long productId)
        throws NoSuchProductException, SystemException {
        Product product = findByProductDetails(productId);

        return remove(product);
    }

    /**
     * Returns the number of products where productId = &#63;.
     *
     * @param productId the product ID
     * @return the number of matching products
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByProductDetails(long productId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTDETAILS;

        Object[] finderArgs = new Object[] { productId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PRODUCT_WHERE);

            query.append(_FINDER_COLUMN_PRODUCTDETAILS_PRODUCTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(productId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the product in the entity cache if it is enabled.
     *
     * @param product the product
     */
    @Override
    public void cacheResult(Product product) {
        EntityCacheUtil.putResult(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductImpl.class, product.getPrimaryKey(), product);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
            new Object[] { product.getProductId() }, product);

        product.resetOriginalValues();
    }

    /**
     * Caches the products in the entity cache if it is enabled.
     *
     * @param products the products
     */
    @Override
    public void cacheResult(List<Product> products) {
        for (Product product : products) {
            if (EntityCacheUtil.getResult(
                        ProductModelImpl.ENTITY_CACHE_ENABLED,
                        ProductImpl.class, product.getPrimaryKey()) == null) {
                cacheResult(product);
            } else {
                product.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all products.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ProductImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ProductImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the product.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Product product) {
        EntityCacheUtil.removeResult(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductImpl.class, product.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(product);
    }

    @Override
    public void clearCache(List<Product> products) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Product product : products) {
            EntityCacheUtil.removeResult(ProductModelImpl.ENTITY_CACHE_ENABLED,
                ProductImpl.class, product.getPrimaryKey());

            clearUniqueFindersCache(product);
        }
    }

    protected void cacheUniqueFindersCache(Product product) {
        if (product.isNew()) {
            Object[] args = new Object[] { product.getProductId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PRODUCTDETAILS,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
                args, product);
        } else {
            ProductModelImpl productModelImpl = (ProductModelImpl) product;

            if ((productModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_PRODUCTDETAILS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { product.getProductId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PRODUCTDETAILS,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
                    args, product);
            }
        }
    }

    protected void clearUniqueFindersCache(Product product) {
        ProductModelImpl productModelImpl = (ProductModelImpl) product;

        Object[] args = new Object[] { product.getProductId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTDETAILS, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS, args);

        if ((productModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_PRODUCTDETAILS.getColumnBitmask()) != 0) {
            args = new Object[] { productModelImpl.getOriginalProductId() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTDETAILS,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTDETAILS,
                args);
        }
    }

    /**
     * Creates a new product with the primary key. Does not add the product to the database.
     *
     * @param productId the primary key for the new product
     * @return the new product
     */
    @Override
    public Product create(long productId) {
        Product product = new ProductImpl();

        product.setNew(true);
        product.setPrimaryKey(productId);

        return product;
    }

    /**
     * Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param productId the primary key of the product
     * @return the product that was removed
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product remove(long productId)
        throws NoSuchProductException, SystemException {
        return remove((Serializable) productId);
    }

    /**
     * Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the product
     * @return the product that was removed
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product remove(Serializable primaryKey)
        throws NoSuchProductException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Product product = (Product) session.get(ProductImpl.class,
                    primaryKey);

            if (product == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(product);
        } catch (NoSuchProductException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Product removeImpl(Product product) throws SystemException {
        product = toUnwrappedModel(product);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(product)) {
                product = (Product) session.get(ProductImpl.class,
                        product.getPrimaryKeyObj());
            }

            if (product != null) {
                session.delete(product);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (product != null) {
            clearCache(product);
        }

        return product;
    }

    @Override
    public Product updateImpl(
        com.opensource.techblog.springmvc.portlet1.model.Product product)
        throws SystemException {
        product = toUnwrappedModel(product);

        boolean isNew = product.isNew();

        ProductModelImpl productModelImpl = (ProductModelImpl) product;

        Session session = null;

        try {
            session = openSession();

            if (product.isNew()) {
                session.save(product);

                product.setNew(false);
            } else {
                session.merge(product);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ProductModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((productModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        productModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { productModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((productModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        productModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] { productModelImpl.getCompanyId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }
        }

        EntityCacheUtil.putResult(ProductModelImpl.ENTITY_CACHE_ENABLED,
            ProductImpl.class, product.getPrimaryKey(), product);

        clearUniqueFindersCache(product);
        cacheUniqueFindersCache(product);

        return product;
    }

    protected Product toUnwrappedModel(Product product) {
        if (product instanceof ProductImpl) {
            return product;
        }

        ProductImpl productImpl = new ProductImpl();

        productImpl.setNew(product.isNew());
        productImpl.setPrimaryKey(product.getPrimaryKey());

        productImpl.setProductId(product.getProductId());
        productImpl.setGroupId(product.getGroupId());
        productImpl.setCompanyId(product.getCompanyId());
        productImpl.setUserId(product.getUserId());
        productImpl.setProductName(product.getProductName());

        return productImpl;
    }

    /**
     * Returns the product with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the product
     * @return the product
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product findByPrimaryKey(Serializable primaryKey)
        throws NoSuchProductException, SystemException {
        Product product = fetchByPrimaryKey(primaryKey);

        if (product == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchProductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return product;
    }

    /**
     * Returns the product with the primary key or throws a {@link com.opensource.techblog.springmvc.portlet1.NoSuchProductException} if it could not be found.
     *
     * @param productId the primary key of the product
     * @return the product
     * @throws com.opensource.techblog.springmvc.portlet1.NoSuchProductException if a product with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product findByPrimaryKey(long productId)
        throws NoSuchProductException, SystemException {
        return findByPrimaryKey((Serializable) productId);
    }

    /**
     * Returns the product with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the product
     * @return the product, or <code>null</code> if a product with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Product product = (Product) EntityCacheUtil.getResult(ProductModelImpl.ENTITY_CACHE_ENABLED,
                ProductImpl.class, primaryKey);

        if (product == _nullProduct) {
            return null;
        }

        if (product == null) {
            Session session = null;

            try {
                session = openSession();

                product = (Product) session.get(ProductImpl.class, primaryKey);

                if (product != null) {
                    cacheResult(product);
                } else {
                    EntityCacheUtil.putResult(ProductModelImpl.ENTITY_CACHE_ENABLED,
                        ProductImpl.class, primaryKey, _nullProduct);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ProductModelImpl.ENTITY_CACHE_ENABLED,
                    ProductImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return product;
    }

    /**
     * Returns the product with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param productId the primary key of the product
     * @return the product, or <code>null</code> if a product with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Product fetchByPrimaryKey(long productId) throws SystemException {
        return fetchByPrimaryKey((Serializable) productId);
    }

    /**
     * Returns all the products.
     *
     * @return the products
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Product> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Product> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Product> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Product> list = (List<Product>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PRODUCT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PRODUCT;

                if (pagination) {
                    sql = sql.concat(ProductModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Product>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Product>(list);
                } else {
                    list = (List<Product>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the products from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Product product : findAll()) {
            remove(product);
        }
    }

    /**
     * Returns the number of products.
     *
     * @return the number of products
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PRODUCT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the product persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.opensource.techblog.springmvc.portlet1.model.Product")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Product>> listenersList = new ArrayList<ModelListener<Product>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Product>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ProductImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
