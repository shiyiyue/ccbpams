package pams.repository.dao;

import org.apache.ibatis.annotations.Param;
import pams.repository.model.OdsbCtsBal;
import pams.repository.model.OdsbCtsBalExample;

import java.util.List;

public interface OdsbCtsBalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int countByExample(OdsbCtsBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int deleteByExample(OdsbCtsBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int insert(OdsbCtsBal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int insertSelective(OdsbCtsBal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    List<OdsbCtsBal> selectByExample(OdsbCtsBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    OdsbCtsBal selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByExampleSelective(@Param("record") OdsbCtsBal record, @Param("example") OdsbCtsBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByExample(@Param("record") OdsbCtsBal record, @Param("example") OdsbCtsBalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByPrimaryKeySelective(OdsbCtsBal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ODSB_CTS_BAL
     *
     * @mbggenerated Sat Apr 12 21:10:38 CST 2014
     */
    int updateByPrimaryKey(OdsbCtsBal record);
}