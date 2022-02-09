package com.example.content2.Mapper;

import com.example.content2.POJO.Element;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Vector;

@Mapper
public interface ElementMapper {

    @Select("select * from element where id=#{id}")
    public Element selectById(Integer id);

    @Select("select * from element where expression_=#{expression}")
    public Element selectByExpression(String expression);

    public Integer getElementIdByTranslation(String elementName);

    public Integer getElementIdByExpression(String expression);

    public String getTranslationByExpression(String expression);

}
