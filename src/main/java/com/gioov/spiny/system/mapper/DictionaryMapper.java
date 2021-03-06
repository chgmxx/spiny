package com.gioov.spiny.system.mapper;

import com.gioov.common.mybatis.CrudMapper;
import com.gioov.common.mybatis.Pageable;
import com.gioov.spiny.system.entity.DictionaryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author godcheese
 * @date 2018-02-22
 */
@Mapper
@Component("dictionaryMapper")
public interface DictionaryMapper extends CrudMapper<DictionaryEntity, Long> {

    /**
     * 指定数据字典分类 id ，获取数据字典
     *
     * @param dictionaryCategoryId 数据字典分类 id
     * @return DictionaryEntity
     */
    DictionaryEntity getOneByDictionaryCategoryId(@Param("dictionaryCategoryId") Long dictionaryCategoryId);

    /**
     * 指定数据字典分类 id ，分页获取所有数据字典
     *
     * @param dictionaryCategoryId 数据字典分类 id
     * @param pageable Pageable
     * @return List<DictionaryEntity>
     */
    List<DictionaryEntity> pageAllByDictionaryCategoryId(@Param("dictionaryCategoryId") Long dictionaryCategoryId, @Param("pageable") Pageable pageable);

    /**
     * 指定数据字典分类 id ，统计所有数据字典个数
     *
     * @param dictionaryCategoryId 数据字典分类 id
     * @return int
     */
    int countAllByDictionaryCategoryId(@Param("dictionaryCategoryId") Long dictionaryCategoryId);

    /**
     * 指定数据字典键和值别名，获取数据字典
     *
     * @param key 数据字典键
     * @param valueSlug 数据字典值别名
     * @return DictionaryEntity
     */
    DictionaryEntity getOneByKeyAndValueSlug(@Param("key") String key, @Param("valueSlug") String valueSlug);

    /**
     * 指定数据字典键，获取所有数据字典
     *
     * @param key 数据字典键
     * @return List<DictionaryEntity>
     */
    List<DictionaryEntity> listAllByKey(@Param("key") String key);

}
