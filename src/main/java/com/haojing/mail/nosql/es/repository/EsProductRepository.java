package com.haojing.mail.nosql.es.repository;


import com.haojing.mail.nosql.es.document.EsProduct;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *  商品ES操作类
 * @author jiange
 * @date 2020/6/9 16:13
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {

    // todo 条件搜索暂时有问题，需要fix
    /**
     * 搜索查询
     *
     * @param name              商品名称
     * @param subTitle          商品标题
     * @param keywords          商品关键字
     * @param page              分页信息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);

}
