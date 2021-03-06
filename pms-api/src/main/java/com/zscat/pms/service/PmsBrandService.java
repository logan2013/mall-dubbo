package com.zscat.pms.service;

import com.zscat.pms.dto.PmsBrandParam;
import com.zscat.pms.model.PmsBrand;

import java.util.List;

/**
 * 商品品牌Service
 * Created by zscat on 2018/4/26.
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandParam pmsBrandParam);


    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    int deleteBrand(Long id);

    int deleteBrand(List<Long> ids);

    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
