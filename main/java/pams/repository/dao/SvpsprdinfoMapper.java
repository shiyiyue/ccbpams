package pams.repository.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import pams.repository.model.Svpsprdinfo;
import pams.repository.model.SvpsprdinfoExample;

import java.util.List;

@Component
public interface SvpsprdinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int countByExample(SvpsprdinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int deleteByExample(SvpsprdinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int deleteByPrimaryKey(String prdid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int insert(Svpsprdinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int insertSelective(Svpsprdinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    List<Svpsprdinfo> selectByExample(SvpsprdinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    Svpsprdinfo selectByPrimaryKey(String prdid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int updateByExampleSelective(@Param("record") Svpsprdinfo record, @Param("example") SvpsprdinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int updateByExample(@Param("record") Svpsprdinfo record, @Param("example") SvpsprdinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int updateByPrimaryKeySelective(Svpsprdinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SVPSPRDINFO
     *
     * @mbggenerated Tue May 03 15:10:25 CST 2011
     */
    int updateByPrimaryKey(Svpsprdinfo record);
}