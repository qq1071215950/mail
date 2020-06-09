package com.haojing.mail.dao;

import com.haojing.mail.nosql.es.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * @author jiange
 * @date 2020/6/9 16:21
 */
public interface EsProductDao {

    List<EsProduct> getAllEsProductList(@Param("id") Long id);

}
