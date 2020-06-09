package com.haojing.mail.service;

import com.haojing.mail.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author jiange
 * @date 2020/6/8 20:32
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
