package com.alag.mmall.mapper;

import com.alag.mmall.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Mon Jul 01 16:02:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Mon Jul 01 16:02:53 CST 2019
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Mon Jul 01 16:02:53 CST 2019
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Mon Jul 01 16:02:53 CST 2019
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Mon Jul 01 16:02:53 CST 2019
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbggenerated Mon Jul 01 16:02:53 CST 2019
     */
    int updateByPrimaryKey(Product record);

    List<Product> selectList();

    List<Product> selectByIdAndName(@Param("productId") Integer productId,@Param("productName")  String productName);

    List<Product> getProductListByKeywordAndcategoryIdList(@Param("keyword") String keyword, @Param("categoryIdList") List<Integer> categoryIdList);
}