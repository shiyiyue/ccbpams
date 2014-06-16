package pams.repository.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import pams.repository.model.ClsRptdata;
import pams.repository.model.ClsRptdataExample;
import pams.repository.model.ClsRptdataKey;

import java.util.List;

@Component
public interface ClsRptdataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int countByExample(ClsRptdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int deleteByExample(ClsRptdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int deleteByPrimaryKey(ClsRptdataKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int insert(ClsRptdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int insertSelective(ClsRptdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    List<ClsRptdata> selectByExample(ClsRptdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    ClsRptdata selectByPrimaryKey(ClsRptdataKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int updateByExampleSelective(@Param("record") ClsRptdata record, @Param("example") ClsRptdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int updateByExample(@Param("record") ClsRptdata record, @Param("example") ClsRptdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int updateByPrimaryKeySelective(ClsRptdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLS_RPTDATA
     *
     * @mbggenerated Sun Jan 05 20:28:05 CST 2014
     */
    int updateByPrimaryKey(ClsRptdata record);
}